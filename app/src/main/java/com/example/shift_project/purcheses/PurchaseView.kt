package com.example.shift_project.purcheses

import com.example.shift_project.backend.Purchase

interface PurchaseView {
    fun showShops(shop: List<Purchase>)
    fun showEmptyState()
}