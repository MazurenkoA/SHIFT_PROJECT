package com.example.shift_project.category

import com.example.shift_project.App
import com.example.shift_project.backend.Budget
import com.example.shift_project.backend.testvalue
import com.example.shift_project.model.api.Api
import com.example.shift_project.model.response.BudgetResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CategoryListPresenter {
    private var view: CategoriesView? = null

    fun bindView(view: CategoriesView) {
        this.view = view
    }

    fun setView() {
        updateCategories()
    }

    private fun updateCategories() {
//        App.retrofit
//            .create(Api::class.java)
//            .getBudget()
//            .enqueue(object : Callback<BudgetResponse> {
//                override fun onFailure(call: Call<BudgetResponse>, t: Throwable) {
//                }
//
//                override fun onResponse(call: Call<BudgetResponse>, response: Response<BudgetResponse>) {
//                    val category = response.body()?.categoryListString ?: return
//                    view?.showCategories(category)
//                }
//            })
        val budgets = testvalue()
        view?.showCategories(budgets.testBudget.categoryList)
    }

    fun unbindView() {
        this.view = null
    }
}