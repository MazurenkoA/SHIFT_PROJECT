package com.example.shift_project.just_test

class TestProduct (var id: Int, var idCategory: Int, var name: String, var sum: Double){
    fun getInfo(): String{
        return "Name: $name, Sum: $sum"
    }
}