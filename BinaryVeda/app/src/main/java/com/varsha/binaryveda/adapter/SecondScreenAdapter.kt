package com.varsha.binaryveda.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.varsha.binaryveda.R
import com.varsha.binaryveda.model.SecondModel

import kotlinx.android.synthetic.main.second_screen_itemlayout.view.*

class SecondScreenAdapter(val imagelist: List<SecondModel>): RecyclerView.Adapter<SecondScreenAdapter.SecondScreenViewHolder>(){
    inner class SecondScreenViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondScreenViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.second_screen_itemlayout,parent,false)
        return SecondScreenViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondScreenViewHolder, position: Int) {

        holder.itemView.apply {
            firstImageView.setImageResource(imagelist[position].firstImage)


        }
    }

    override fun getItemCount(): Int {
        return imagelist.size
    }
}