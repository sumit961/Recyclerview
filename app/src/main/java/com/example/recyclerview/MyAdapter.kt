package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.databinding.ItemBinding


class MyAdapter(private val items: MutableList<MyModel>)
    : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyModel) {
            binding.apply {
                myId.text = item.MyId.toString()
                myName.text = item.MyName
            }
        }
    }
}
