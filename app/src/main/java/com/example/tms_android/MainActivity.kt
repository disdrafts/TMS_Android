package com.example.tms_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tms_android.lesson1.MainActivityLesson1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_les1 = findViewById<Button>(R.id.btn_les1)
        btn_les1.setOnClickListener {
            val intent = Intent(this, MainActivityLesson1::class.java)
            startActivity(intent)
        }

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val intetn = Intent(this, TestActivity::class.java)
            startActivity(intetn)
        }
    }
}