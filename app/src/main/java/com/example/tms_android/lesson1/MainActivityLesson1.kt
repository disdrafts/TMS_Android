package com.example.tms_android.lesson1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R
import com.example.tms_android.lesson1.task1.Lesson1Task1


class MainActivityLesson1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lesson1)
        val btn = findViewById<Button>(R.id.btn_lesson1_task1)

        btn.setOnClickListener {
            val intent = Intent(this, Lesson1Task1::class.java)
            startActivity(intent)
        }
    }
}