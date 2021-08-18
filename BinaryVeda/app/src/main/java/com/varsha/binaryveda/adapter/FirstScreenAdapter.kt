package com.varsha.binaryveda.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.varsha.binaryveda.model.FirstModel
import com.varsha.binaryveda.R
import kotlinx.android.synthetic.main.firstscreen_item_layout.view.*

class FirstScreenAdapter(val datalist:List<FirstModel>): RecyclerView.Adapter<FirstScreenAdapter.FirstScreenViewHolder>(){
    inner class FirstScreenViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstScreenViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.firstscreen_item_layout,parent,false)
        return FirstScreenViewHolder(view)
    }

    override fun onBindViewHolder(holder: FirstScreenViewHolder, position: Int) {

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