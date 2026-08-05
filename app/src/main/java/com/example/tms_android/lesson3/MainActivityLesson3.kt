package com.example.tms_android.lesson3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R
import com.example.tms_android.lesson3.task1.Lesson3Task1

class MainActivityLesson3 : AppCompatActivity() {
    lateinit var btnTask1: Button
    lateinit var btnTask2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson3)

        btnTask1 = findViewById(R.id.btn_lesson3_task1)
        btnTask2 = findViewById(R.id.btn_lesson3_task2)

        btnTask1.setOnClickListener {
            val intent = Intent(this, Lesson3Task1::class.java)
            startActivity(intent)
        }
    }
}