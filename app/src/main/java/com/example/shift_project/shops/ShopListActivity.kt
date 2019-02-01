package com.example.shift_project.shops

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.shift_project.const_value.EXTRA_MESSAGE
import com.example.shift_project.R
import com.example.shift_project.just_test.TestProduct
import kotlinx.android.synthetic.main.activity_shop.*


class ShopListActivity : AppCompatActivity(), ShopsView {

    private val adapter = ShopAdapter ()
    private val presenter = ShopPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        shopRecyclerView.layoutManager = LinearLayoutManager(this)
        shopRecyclerView.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        presenter.bindView(this)
        val id = intent.getIntExtra(EXTRA_MESSAGE, -1)
        presenter.setArgument(id)
    }

    override fun onStop() {
        super.onStop()
        presenter.unbindView()
    }

    override fun showShops(shop: List<TestProduct>) {
        adapter.setShops(shop)
    }

    override fun showEmptyState() {
        emptyStateIV.visibility = View.VISIBLE
    }
}