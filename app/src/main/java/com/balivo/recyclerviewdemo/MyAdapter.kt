package com.balivo.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

class MyAdapter(rowItems: ArrayList<String>, ctx: Context) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private val rowItems: List<String>
    private val mCtx: Context

    // 1
    init {
        this.rowItems = rowItems
        this.mCtx = ctx
    }

    // 2
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent!!.context).inflate(R.layout.row_layout, parent, false)
        return ViewHolder(v)
    }

    // 3
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.mRowTitle.text = rowItems[position]
        holder.mRowPosition.text = "Layout position is " + position
    }

    // 4
    override fun getItemCount(): Int = rowItems.size

    // 5
    // here itemView refers to the item layout.
    // you pass the item layout ref when you create
    // ViewHolder object
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var mRowTitle: TextView = itemView.findViewById(R.id.row_title)
        internal var mRowPosition: TextView = itemView.findViewById(R.id.row_position)
    }
}