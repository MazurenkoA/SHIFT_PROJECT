package com.example.shift_project.model.response

import java.util.*

class CategoryResponse (
    val purchaseList: List<Purchase>,
    val name: String,
    val budget : Long,
    val id : Int,
    val consumption : Int
    )
class Purchase (
     var id : Int,
     var name : String,
     var cost : Int,
    var date : Date
)

