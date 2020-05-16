package com.cr7.bismillah
//membuat recyclerview adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.previous_match_item.*


class PreviousMatchAdapter (private val context: Context, private val items : ArrayList<PreviousMatch>)
    : RecyclerView.Adapter<PreviousMatchAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder (
        LayoutInflater.from( context ).inflate(R.layout. previous_match_item , parent, false )
    )

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: PreviousMatchAdapter.ViewHolder, position: Int) {
        holder.binditem(items.get(position))
    }

    class ViewHolder(override val containerView: View):
            RecyclerView.ViewHolder(containerView),LayoutContainer{
        fun binditem (items: PreviousMatch ){
            tv_date.text = items.tanggal
            tv_home.text = items.teama
            tv_skor.text = items.skor
            tv_away.text = items.teamb
        }

    }

}
