package com.varsha.binaryveda.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.varsha.binaryveda.model.Model
import com.varsha.binaryveda.R
import kotlinx.android.synthetic.main.firstscreen_item_layout.view.*

class MyAdapter(val datalist:List<Model>): RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.firstscreen_item_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemView.apply {
          mFirstImage.setImageResource(datalist[position].titleImage)
          tvFirstTextview.text=datalist[position].firstText
          tvSecondTextView.text=datalist[position].secondText

        }
    }

    override fun getItemCount(): Int {
        return datalist.size
    }
}