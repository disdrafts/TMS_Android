package com.example.tms_android.lesson2.task3

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.tms_android.R

class Task3Activity : AppCompatActivity() {
    lateinit var btnHome: Button
    lateinit var btnCatalog: Button
    lateinit var btnCart: Button

    private var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task3)
        btnHome = findViewById(R.id.btn_home)
        btnCatalog = findViewById(R.id.btn_catalog)
        btnCart = findViewById(R.id.btn_cart)

        if(savedInstanceState == null) {
            openFragment(HomeFragment())
        }

        btnHome.setOnClickListener {
            if(currentFragment !is HomeFragment) {
                openFragment(HomeFragment())
            }
        }
        btnCatalog.setOnClickListener {
            if(currentFragment !is CatalogFragment) {
                openFragment(CatalogFragment())
            }
        }
        btnCart.setOnClickListener {
            if(currentFragment !is CartFragment) {
                openFragment(CartFragment())
            }
        }
    }
    fun openFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fr_container, fragment)
            .addToBackStack(null)
            .commit()
        currentFragment = fragment
        updateButton()
    }
    fun updateButton() {
        val defaultColor = ContextCompat.getColor(this, R.color.purple_dark)
        val newColor = ContextCompat.getColor(this, R.color.purple_white)
        btnHome.setBackgroundColor(defaultColor)
        btnCart.setBackgroundColor(defaultColor)
        btnCatalog.setBackgroundColor(defaultColor)
        when(currentFragment) {
            is HomeFragment -> btnHome.setBackgroundColor(newColor)
            is CatalogFragment -> btnCatalog.setBackgroundColor(newColor)
            is CartFragment -> btnCart.setBackgroundColor(newColor)
        }
    }
}