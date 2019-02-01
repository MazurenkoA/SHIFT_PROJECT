package com.example.shift_project.category

import com.example.shift_project.just_test.TestCategory
import com.example.shift_project.model.response.BudgetResponse
import com.example.shift_project.model.response.BudgetsResponse

interface CategoriesView {
    fun showCategories(categories: BudgetResponse)
}