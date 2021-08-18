package com.varsha.binaryveda

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.varsha.binaryveda.adapter.MyAdapter
import com.varsha.binaryveda.adapter.SecondScreenAdapter
import com.varsha.binaryveda.model.Model
import com.varsha.binaryveda.model.SecondModel
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val modelObjects:MutableList<SecondModel> = mutableListOf<SecondModel>()
        modelObjects.add(SecondModel(R.drawable.first_image))
        modelObjects.add(SecondModel(R.drawable.second_image))
        modelObjects.add(SecondModel(R.drawable.third_image))
        modelObjects.add(SecondModel(R.drawable.fourth_image))
        modelObjects.add(SecondModel(R.drawable.fifth_image))
        modelObjects.add(SecondModel(R.drawable.sixth_image))
        recyclerView2.adapter= SecondScreenAdapter(modelObjects)
        recyclerView2.layoutManager= GridLayoutManager(this,2)
        recyclerView2.isNestedScrollingEnabled=false


    }
}