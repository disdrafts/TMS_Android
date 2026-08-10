package com.example.tms_android.lesson3.task1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.tms_android.R

class PageFragment : Fragment(R.layout.fragment_page) {
    companion object {
        fun newInstance(text: String) : PageFragment {
            val fragment = PageFragment()
            fragment.arguments = Bundle().apply {
                putString("text",text)
            }
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvText = view.findViewById<TextView>(R.id.tv_text)
        tvText.text = arguments?.getString("text")
    }

}