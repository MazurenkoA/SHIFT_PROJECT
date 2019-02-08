package com.example.shift_project.category

import com.example.shift_project.backend.Budget
import com.example.shift_project.backend.Category
import com.example.shift_project.model.response.BudgetResponse
import com.example.shift_project.model.response.Purchase

interface CategoriesView {
    fun showCategories(categories: List<Category>)
}