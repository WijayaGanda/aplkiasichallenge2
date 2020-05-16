package com.cr7.bismillah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.cr7.bismillah.API.ApiRepository
import com.cr7.bismillah.data.*
import com.cr7.bismillah.util.dismissLoading
import com.cr7.bismillah.util.showLoading
import com.cr7.bismillah.util.tampilToast
import com.google.gson.Gson
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment2.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


//mengambil data dari api dbsport
class Fragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate layout dari fragment ini
        return inflater.inflate(R.layout.fragment2, container, false)

    }

    override fun onViewCreated(view: View,
                              @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        callApiNextmatch()
    }

    private fun callApiNextmatch(){
        showLoading(context!!, swipeRefreshLayout)

        val httpClient = httpClient()
        val apiRequest = apiRequest<NextMatchService>(httpClient)

        val call = apiRequest.getNextMatch()
        call.enqueue(object : Callback<List<Event>>{

            override fun onFailure(call : Call<List<Event>>, t:Throwable){
                dismissLoading(swipeRefreshLayout)
            }

            override fun onResponse(call: Call<List<Event>>, response: Response<List<Event>>) {
                dismissLoading(swipeRefreshLayout)
                when{
                    response.isSuccessful ->
                        when{
                            response.body()?.size !=0 ->
                                tampilNextMatch(response.body()!!)
                            else ->{
                                tampilToast(context!!, "Berhasil")
                            }
                        }
                    else ->{
                        tampilToast(context!!, "Gagal")
                    }
                }
            }
        })

    }

    private fun tampilNextMatch(events: List<Event>){
        rv_nextmatch.layoutManager = LinearLayoutManager(context)
        rv_nextmatch.adapter = NextMatchAdapter(context!!, events){
            val getNextevents = it
            tampilToast(context!!, getNextevents.idLeague)

        }
    }


    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}