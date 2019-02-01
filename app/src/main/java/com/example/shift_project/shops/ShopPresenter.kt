package com.example.shift_project.shops

import com.example.shift_project.just_test.TestObjects

class ShopPresenter {
    private var view: ShopsView? = null

    fun bindView(view: ShopsView) {
        this.view = view
    }

    fun unbindView() {
        this.view = null
    }

    fun setArgument(id: Int) {
        updateProducts(id)
    }

    private fun updateProducts(id: Int) {
        val shops = TestObjects().productList.filter { it.idCategory == id }
        view?.showShops(shops)

        if (shops.isEmpty()) {
            view?.showEmptyState()
        }
    }
}
//var elements = TestObjects().getList(id)