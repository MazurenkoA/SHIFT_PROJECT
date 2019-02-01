package com.example.shift_project.category

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shift_project.R
import com.example.shift_project.just_test.TestCategory
import com.example.shift_project.model.response.BudgetResponse
import com.example.shift_project.model.response.BudgetsResponse
import kotlinx.android.synthetic.main.category_item.view.*
import kotlinx.android.synthetic.main.category_item_cardview.view.*

class CategoryAdapter(private val callback: (BudgetResponse) -> Unit) : RecyclerView.Adapter<CategoryHolder>() {

    private val categories: MutableList<BudgetResponse> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): CategoryHolder =
            CategoryHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_item_cardview, parent, false))
    override fun getItemCount(): Int = categories.size

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        val category = categories[position]
        holder.bind(category)
        holder.itemView.setOnClickListener {
            callback(category)
        }
    }

    fun setCategories(categories: List<BudgetResponse>) {
        this.categories.clear()
        this.categories.addAll(categories)
        notifyDataSetChanged()
    }
}

class CategoryHolder(view: View) : RecyclerView.ViewHolder(view) {

    @SuppressLint("SetTextI18n")
    fun bind(category: BudgetResponse) {
        itemView.nameTV.text = category.name
        itemView.sumTV.text = "Sum: ${category.budget}"

    }
}