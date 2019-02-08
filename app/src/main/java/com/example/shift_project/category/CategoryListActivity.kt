package com.example.shift_project.category

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.shift_project.R
import com.example.shift_project.backend.Category
import com.example.shift_project.const_value.EXTRA_MESSAGE
import com.example.shift_project.purcheses.PurchaseListActivity
import kotlinx.android.synthetic.main.activity_main.*


class CategoryListActivity : AppCompatActivity(), CategoriesView {

    private val adapter = CategoryAdapter {
        val intent = Intent(this, PurchaseListActivity::class.java)
        .apply {
            putExtra(EXTRA_MESSAGE, it)
        }

        startActivity(intent)
    }

    private val presenter = CategoryListPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        categoriesRecyclerView.layoutManager = LinearLayoutManager(this)
        categoriesRecyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        presenter.bindView(this)
        presenter.setView()
    }

    override fun onStop() {
        super.onStop()
        presenter.unbindView()
    }

    override fun showCategories(categories: List<Category>) {
        adapter.setCategories(categories)
    }
}

