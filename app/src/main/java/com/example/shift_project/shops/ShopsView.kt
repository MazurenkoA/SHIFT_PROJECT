package com.example.shift_project.shops


import com.example.shift_project.just_test.TestProduct

interface ShopsView {
    fun showShops(shop: List<TestProduct>)
    fun showEmptyState()
}