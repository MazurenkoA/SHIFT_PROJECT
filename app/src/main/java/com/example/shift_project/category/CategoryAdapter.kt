package com.example.shift_project.category

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shift_project.R
import com.example.shift_project.backend.Category
import kotlinx.android.synthetic.main.category_item_cardview.view.*

class CategoryAdapter(private val callback: (Int) -> Unit) : RecyclerView.Adapter<CategoryHolder>() {

    private val categories: MutableList<Category> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CategoryHolder =
        CategoryHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_item_cardview, parent, false))

    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val category = categories[position]
        holder.bind(category)
        holder.itemView.setOnClickListener {
            callback(position)
        }
    }

    fun setCategories(categories: List<Category>) {
        this.categories.clear()
        this.categories.addAll(categories)
        notifyDataSetChanged()
    }
}

class CategoryHolder(view: View) : RecyclerView.ViewHolder(view) {

    @SuppressLint("SetTextI18n")
    fun bind(category: Category) {
        itemView.nameTextView.text = category.name
        itemView.sumTextView.text = "Budget: ${category.budget}"
        itemView.consumptionTextView.text = "Consumption: ${category.consumption}"

    }
}