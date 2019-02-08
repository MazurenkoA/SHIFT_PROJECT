package com.example.shift_project.purcheses

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.example.shift_project.const_value.EXTRA_MESSAGE
import com.example.shift_project.R
import com.example.shift_project.backend.Purchase
import kotlinx.android.synthetic.main.activity_shop.*


class PurchaseListActivity : AppCompatActivity(), PurchaseView {

    private val adapter = ShopAdapter ()
    private val presenter = PurchasePresenter()

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

    override fun showShops(shop: List<Purchase>) {
        adapter.setShops(shop)
    }

    override fun showEmptyState() {
        emptyStateIV.visibility = View.VISIBLE
    }
}