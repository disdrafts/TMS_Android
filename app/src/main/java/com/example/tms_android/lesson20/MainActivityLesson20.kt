package com.example.tms_android.lesson20

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R
import com.example.tms_android.lesson20.task1.Lesson20Task1

class MainActivityLesson20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson20)
        val btnTask1 = findViewById<Button>(R.id.btn_lesson20_task1)
        btnTask1.setOnClickListener {
            val intent = Intent(this, Lesson20Task1::class.java)
            startActivity(intent)
        }
    }

}