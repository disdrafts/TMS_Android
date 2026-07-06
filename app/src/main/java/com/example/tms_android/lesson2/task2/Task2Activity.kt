package com.example.tms_android.lesson2.task2

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R

class Task2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task2)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fl_container, Task2Fragment())
            .commit()
    }
}