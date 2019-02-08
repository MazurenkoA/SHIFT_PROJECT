package com.example.shift_project.model.response

import java.util.concurrent.atomic.AtomicLong

class BudgetResponse(
    var categoryListString : List<String>,
    var budget : Long,
    var consumption : Long
)
