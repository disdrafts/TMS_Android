package com.example.tms_android.lesson3.task1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    activity : FragmentActivity,
    ) : FragmentStateAdapter(activity) {
    private val fragments = mutableListOf<Fragment>()

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }

    override fun getItemCount(): Int = fragments.size

    fun addFragment(fragment: Fragment) {
        fragments.add(fragment)
        notifyItemInserted(fragments.size-1)
    }
    fun removeLastFragment() {
        if(fragments.isEmpty()) {
            val position = fragments.lastIndex
            fragments.removeAt(position)
            notifyItemRemoved(position)
        }
    }

}