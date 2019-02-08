package com.example.shift_project.purcheses

import com.example.shift_project.backend.testvalue

class PurchasePresenter {
    private var view: PurchaseView? = null

    fun bindView(view: PurchaseView) {
        this.view = view
    }

    fun unbindView() {
        this.view = null
    }

    fun setArgument(id: Int) {
        updateProducts(id)
    }

    private fun updateProducts(id: Int) {

//        App.retrofit
//            .create(Api::class.java)
//            .getCategory(id)
//            .enqueue(object : Callback<CategoryResponse> {
//                override fun onFailure(call: Call<CategoryResponse>, t: Throwable) {
//                }
//
//                override fun onResponse(call: Call<CategoryResponse>, response: Response<CategoryResponse>) {
//                    val category = response.body()?.purchaseList ?: return
//                    view?.showShops(category)
//
//                    if (category.isEmpty()) {
//                        view?.showEmptyState()
//                    }
//                }
//            })
        val category = testvalue().testBudget.categoryList[id].purchaseList
        view?.showShops(category)

        if (category.isEmpty()) {
            view?.showEmptyState()
        }


    }
}
//var elements = TestObjects().getList(id)