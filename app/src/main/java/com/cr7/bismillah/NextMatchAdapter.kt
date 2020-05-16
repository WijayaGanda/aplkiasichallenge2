package com.cr7.bismillah

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.cr7.bismillah.data.Event
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.next_match_item.*
import java.text.SimpleDateFormat
import java.util.*


//untuk menampilkan list data pada recyclerview
class NextMatchAdapter(
    private val context: Context,
    private val events: List<Event>,
    val listener: (Event) -> Unit
)
    : RecyclerView.Adapter<NextMatchAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder(context,
        LayoutInflater.from(context).inflate(R.layout.next_match_item, parent, false)
    )


    override fun getItemCount(): Int = events.size

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onBindViewHolder(holder: NextMatchAdapter.ViewHolder, position: Int) {
        holder.binditem(events [position], listener)
    }

    class ViewHolder(val context: Context, override val containerView: View)
        :RecyclerView.ViewHolder(containerView),LayoutContainer {

        @RequiresApi(Build.VERSION_CODES.O)
        fun binditem (events: Event, listener:(Event) -> Unit){
            val formatdate = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
            val date = formatdate.parse(events.dateEvent)
            val dateText = SimpleDateFormat("EEE,dd-MM-yyyy", Locale.getDefault())
                .format(date).toString()
            dateevent.text = dateText
            AwayTeam.text=events.strAwayTeam
            HomeTeam.text=events.strHomeTeam
            strHomeScore.text= events.intHomeScore



        }
    }

}