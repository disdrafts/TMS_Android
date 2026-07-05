package com.example.tms_android.lesson2.task1

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val tvName = findViewById<TextView>(R.id.tv_name)
        val tvAge = findViewById<TextView>(R.id.tv_age)
        tvName.text = intent.getStringExtra(Lesson2Task1.NAME_KEY)
        tvAge.text = intent.getStringExtra(Lesson2Task1.AGE_KEY)
    }
}