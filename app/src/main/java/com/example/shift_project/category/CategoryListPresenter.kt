package com.example.shift_project.category

import com.example.shift_project.App
import com.example.shift_project.just_test.TestObjects
import com.example.shift_project.model.api.Api
import com.example.shift_project.model.response.BudgetResponse
import com.example.shift_project.model.response.BudgetsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryListPresenter {
    private var view: CategoriesView? = null

    fun bindView(view: CategoriesView) {
        this.view = view
    }

//    private fun updateCategories() {
//        var categories = TestObjects().categoryList
//        view?.showCategories(categories)
//    }

    fun setView() {
        updateCategories()
    }

    private fun updateCategories() {
        App.retrofit
            .create(Api::class.java)
            .getAll()
            .enqueue(object : Callback<BudgetResponse> {
                override fun onFailure(call: Call<BudgetResponse>, t: Throwable) {
                }

                override fun onResponse(call: Call<BudgetResponse>, response: Response<BudgetResponse>) {
                    val category = response.body() ?: return
                    view?.showCategories(category)
                }


            })
    }

    fun unbindView() {
        this.view = null
    }
}