package com.example.colormyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

//    var box_three_text : TextView = findViewById(R.id.box_three_text)

    lateinit var box_three_text: TextView
    lateinit var box_four_text: TextView
    lateinit var box_five_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun makeColored(view : View){

        box_three_text = findViewById(R.id.box_three_text)
        box_four_text = findViewById(R.id.box_four_text)
        box_five_text = findViewById(R.id.box_five_text)

        when(view.id){

            //boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.tv_satu)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.tv_box)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.tv_tiga_lima)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.tv_dua)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.tv_tiga_lima)
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundResource(R.drawable.bg_satu)
        }
    }

    private fun setListeners() {

        val redButton = findViewById<Button>(R.id.red_button)
        val greenButton = findViewById<Button>(R.id.green_button)
        val yellowButton = findViewById<Button>(R.id.yellow_button)

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val clickableViews : List<View> =
            listOf(boxOneText,boxTwoText,boxThreeText,boxFourText,boxFiveText,rootConstraintLayout,redButton,yellowButton,greenButton)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}