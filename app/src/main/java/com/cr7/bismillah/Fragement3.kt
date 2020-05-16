package com.cr7.bismillah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment3.*

class Fragement3 : Fragment(){

    //mengisi dataa ke papan skor
    private fun PapanSkor(){
        listlaga= ArrayList()
        listlaga.add(PreviousMatch("20 april 2004", "real madrid", "2vs0", "barca" ))
    }
    //menampilkan data ke dalam recyclerview
    private fun TampilMatch(){
        rv_previous. layoutManager = LinearLayoutManager( activity )
        rv_previous. adapter = PreviousMatchAdapter( activity !!, listlaga )
    }
    lateinit var listlaga : ArrayList<PreviousMatch>

    override fun onCreate(savedInstanceState: Bundle?) {
        super .onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment3 ,
            container, false )
    }
    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super .onViewCreated(view, savedInstanceState)
        initview()
    }

    private fun initview(){
        PapanSkor()
        TampilMatch()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }

}