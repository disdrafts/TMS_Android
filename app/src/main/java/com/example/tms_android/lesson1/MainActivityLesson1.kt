package com.example.tms_android.lesson1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R
import com.example.tms_android.lesson1.task1.Lesson1Task1
import com.example.tms_android.lesson1.task2.Lesson1Task2
import com.example.tms_android.lesson1.task3.Lesson1Task3
import com.example.tms_android.lesson1.task4.Lesson1Task4
import com.example.tms_android.lesson1.task5.Lesson1Task5
import com.example.tms_android.lesson1.task6.Lesson1Task6


class MainActivityLesson1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson1)
        val btnTask1 = findViewById<Button>(R.id.btn_lesson1_task1)
        val btnTask2 = findViewById<Button>(R.id.btn_lesson1_task2)
        val btnTask3 = findViewById<Button>(R.id.btn_lesson1_task3)
        val btnTask4 = findViewById<Button>(R.id.btn_lesson1_task4)
        val btnTask5 = findViewById<Button>(R.id.btn_lesson1_task5)
        val btnTask6 = findViewById<Button>(R.id.btn_lesson1_task6)

        btnTask1.setOnClickListener {
            val intent = Intent(this, Lesson1Task1::class.java)
            startActivity(intent)
        }
        btnTask2.setOnClickListener {
            val intent = Intent(this, Lesson1Task2::class.java)
            startActivity(intent)
        }
        btnTask3.setOnClickListener {
            val intent = Intent(this, Lesson1Task3::class.java)
            startActivity(intent)
        }
        btnTask4.setOnClickListener {
            val intent = Intent(this, Lesson1Task4::class.java)
            startActivity(intent)
        }
        btnTask5.setOnClickListener {
            val intent = Intent(this, Lesson1Task5::class.java)
            startActivity(intent)
        }
        btnTask6.setOnClickListener {
            val intent = Intent(this, Lesson1Task6::class.java)
            startActivity(intent)
        }
    }
}