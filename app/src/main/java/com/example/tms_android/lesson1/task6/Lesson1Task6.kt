package com.example.tms_android.lesson1.task6

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R

class Lesson1Task6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1_task6)
        val mainLinear = findViewById<LinearLayout>(R.id.main_linear)
        val loadLinear = findViewById<LinearLayout>(R.id.load_linear)
        val btnStart = findViewById<Button>(R.id.btn_start_progress)

        btnStart.setOnClickListener {
            mainLinear.visibility = View.GONE
            loadLinear.visibility = View.VISIBLE
            loadLinear.postDelayed({
                loadLinear.visibility = View.GONE
                mainLinear.visibility = View.VISIBLE
            }, 5000)
        }
    }
}