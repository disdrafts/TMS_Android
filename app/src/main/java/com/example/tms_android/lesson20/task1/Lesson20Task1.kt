package com.example.tms_android.lesson20.task1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tms_android.R


class Lesson20Task1 : AppCompatActivity() {
    private lateinit var adapter: AdapterRec
    private lateinit var tvPlug: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson20_task1)
        val btnAddRec = findViewById<Button>(R.id.btn_add_rec)
        val recyclerView = findViewById<RecyclerView>(R.id.recView)
        tvPlug = findViewById(R.id.tv_plug)
        val items = mutableListOf<Item>()
        adapter = AdapterRec(items)
        recyclerView.adapter = adapter
        plugRec()
        recyclerView.layoutManager = LinearLayoutManager(this)
        var counter = 0
        btnAddRec.setOnClickListener {
            adapter.addElement(Item("Add element $counter"))
            counter++
            plugRec()
        }
    }
    private fun plugRec() {
        if(adapter.itemCount == 0) {
            tvPlug.visibility = View.VISIBLE
        } else {
            tvPlug.visibility = View.GONE
        }

    }
}