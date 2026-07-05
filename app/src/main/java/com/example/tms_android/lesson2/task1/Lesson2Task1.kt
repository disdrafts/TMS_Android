package com.example.tms_android.lesson2.task1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R

class Lesson2Task1 : AppCompatActivity() {
    companion object {
        const val NAME_KEY = "name_key"
        const val AGE_KEY = "age_key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson2_task1)
        val btnOpenProfile = findViewById<Button>(R.id.btn_open_profile)
        val etName = findViewById<EditText>(R.id.et_name)
        val etAge = findViewById<EditText>(R.id.et_age)
        btnOpenProfile.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            val textName = etName.text.toString()
            val textAge = etAge.text.toString()
            if(textName.isEmpty()) {
                Toast.makeText(this, R.string.enter_name, Toast.LENGTH_SHORT).show()
            } else if(textAge.isEmpty()) {
                Toast.makeText(this, R.string.enter_age, Toast.LENGTH_SHORT).show()
            } else {
                intent.putExtra(NAME_KEY, textName)
                intent.putExtra(AGE_KEY, textAge)
            }
            startActivity(intent)
        }
    }
}