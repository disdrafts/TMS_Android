package com.example.tms_android.lesson3.task1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.tms_android.R
import com.google.android.material.snackbar.Snackbar


class Lesson3Task1: AppCompatActivity() {
    private lateinit var adapter: ViewPagerAdapter
    private var counter = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lesson3_task1)
        val viewPager = findViewById<ViewPager2>(R.id.view_pager)
        val btnAddFragment = findViewById<Button>(R.id.btn_add_fragment)

        adapter = ViewPagerAdapter(this)
        viewPager.adapter = adapter
        adapter.addFragment(PageFragment.newInstance("${getString(R.string.number_page)} $counter"))
        btnAddFragment.setOnClickListener {
            counter++
            adapter.addFragment(PageFragment.newInstance("${getString(R.string.number_page)} $counter"))
            viewPager.currentItem = adapter.itemCount- 1
            Snackbar.make(
                btnAddFragment,
                getString(R.string.added_page),
                Snackbar.LENGTH_LONG
            ).setAction(getString(R.string.cancel)) {
                adapter.removeLastFragment()
                if(adapter.itemCount > 0) {
                    viewPager.currentItem = adapter.itemCount - 1
                }
                counter--
            }.show()
        }
    }
}