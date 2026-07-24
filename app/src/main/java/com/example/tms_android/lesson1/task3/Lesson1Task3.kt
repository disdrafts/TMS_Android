package com.example.tms_android.lesson1.task3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tms_android.R


class Lesson1Task3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson1_task3)
        val btnCreateAccount = findViewById<Button>(R.id.btn_create_account)
        val etName = findViewById<EditText>(R.id.et_name)
        val etPhone = findViewById<EditText>(R.id.et_phone)
        val etPass = findViewById<EditText>(R.id.et_pass)

        btnCreateAccount.setOnClickListener {
            val textName = etName.text.toString()
            val textPhone = etPhone.text.toString()
            val textPass = etPass.text.toString()

            if (textName.isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_name), Toast.LENGTH_SHORT).show()
            } else if (textPhone.isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_phone), Toast.LENGTH_SHORT).show()
            } else if (textPass.isEmpty()) {
                Toast.makeText(this, getString(R.string.enter_pass), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, getString(R.string.create_account), Toast.LENGTH_SHORT).show()
            }
        }
    }
}