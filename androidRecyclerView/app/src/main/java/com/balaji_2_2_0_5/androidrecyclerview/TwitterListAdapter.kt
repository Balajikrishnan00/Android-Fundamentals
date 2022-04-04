package com.balaji_2_2_0_5.androidrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TwitterListAdapter:RecyclerView.Adapter<TwitterListAdapter.viewHolder>() {

    class viewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val listItem=LayoutInflater.from(parent.context).inflate(R.layout.csk_layout,parent,false)

        return viewHolder(listItem)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}