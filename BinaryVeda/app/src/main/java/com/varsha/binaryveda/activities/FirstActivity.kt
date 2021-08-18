package com.varsha.binaryveda.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.varsha.binaryveda.R
import com.varsha.binaryveda.adapter.FirstScreenAdapter
import com.varsha.binaryveda.model.FirstModel
import kotlinx.android.synthetic.main.activity_main.*

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val modelObjects:MutableList<FirstModel> = mutableListOf<FirstModel>()
        modelObjects.add(
            FirstModel(
                R.drawable.ic_first_group,"lorem ipsum\n" +
                        "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_first_group_2,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_third_group_4,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_fourth_group_14_copy_2,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_group_7,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_sixth_group_10,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_seven_group_14,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        modelObjects.add(
            FirstModel(
                R.drawable.ic_eight_group_15,"lorem ipsum\n" +
                    "is used","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.")
        )
        recyclerView.adapter= FirstScreenAdapter(modelObjects)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.isNestedScrollingEnabled=false
        btnRegister.setOnClickListener {
            val intent=Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }



    }
}