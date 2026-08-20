package com.example.tms_android.lesson20.task1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tms_android.R

class AdapterRec(private val items: MutableList<Item>) : RecyclerView.Adapter<AdapterRec.ItemViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_rec, parent, false)
        return ItemViewHolder(view)
    }
    override fun onBindViewHolder(
        holder: ItemViewHolder,
        position: Int
    ) {
       holder.text.text = items[position].text
    }
    override fun getItemCount(): Int {
        return items.size
    }
    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val text: TextView = itemView.findViewById(R.id.tv_rec)
    }
    fun addElement(item: Item) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }
}