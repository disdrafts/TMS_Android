package com.example.tms_android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tms_android.lesson1.MainActivityLesson1
import com.example.tms_android.lesson2.MainActivityLesson2

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
        val btnLes1 = findViewById<Button>(R.id.btn_les1)
        btnLes1.setOnClickListener {
            val intent = Intent(this, MainActivityLesson1::class.java)
            startActivity(intent)
        }
        val btnLes2 = findViewById<Button>(R.id.btn_les2)
        btnLes2.setOnClickListener {
            val intent = Intent(this, MainActivityLesson2::class.java)
            startActivity(intent)
        }
    }
}