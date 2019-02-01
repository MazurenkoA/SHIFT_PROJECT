package com.example.shift_project.shops

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shift_project.R
import com.example.shift_project.just_test.TestProduct
import kotlinx.android.synthetic.main.category_item_cardview.view.*

class ShopAdapter : RecyclerView.Adapter<ShopHolder>() {

    private val shops: MutableList<TestProduct> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ShopHolder =
        ShopHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_item_cardview, parent, false))

    override fun getItemCount(): Int = shops.size

    override fun onBindViewHolder(holder: ShopHolder, position: Int) {
        val shop = shops[position]
        holder.bind(shop)
    }

    fun setShops(products: List<TestProduct>) {
        this.shops.clear()
        this.shops.addAll(products)
        notifyDataSetChanged()
    }
}

class ShopHolder(view: View) : RecyclerView.ViewHolder(view) {

    @SuppressLint("SetTextI18n")
    fun bind(shops: TestProduct) {
        itemView.nameTV.text = shops.name
        itemView.sumTV.text = "Sum: ${shops.sum}"

    }
}