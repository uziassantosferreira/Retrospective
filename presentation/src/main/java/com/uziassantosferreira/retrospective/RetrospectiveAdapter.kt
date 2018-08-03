package com.uziassantosferreira.retrospective

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class RetrospectiveAdapter(private val context: Context): RecyclerView.Adapter<RetrospectiveAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder  =
            ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_retrospective_item, parent, false))

    override fun getItemCount(): Int = 30

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}