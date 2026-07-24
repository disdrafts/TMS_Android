package com.example.tms_android.lesson2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R
import com.example.tms_android.lesson2.task1.Lesson2Task1
import com.example.tms_android.lesson2.task2.Task2Activity
import com.example.tms_android.lesson2.task3.Task3Activity

class MainActivityLesson2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson2)
        val btnTask1 = findViewById<Button>(R.id.btn_task_1)
        btnTask1.setOnClickListener {
            val intent = Intent(this, Lesson2Task1::class.java)
            startActivity(intent)
        }
        val btnTask2 = findViewById<Button>(R.id.btn_task_2)
        btnTask2.setOnClickListener {
            val intent = Intent(this, Task2Activity::class.java)
            startActivity(intent)
        }
        val btnTask3 = findViewById<Button>(R.id.btn_task_3)
        btnTask3.setOnClickListener {
            val intent = Intent(this, Task3Activity::class.java)
            startActivity(intent)
        }
    }
}