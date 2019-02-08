package com.example.shift_project.backend.test


class TestObjects(){
//    val foodCategory = TestCategory(1, "Food", 0.0)
//    val bookCategory = TestCategory(2, "Book", 0.0)

    val categoryList = mutableListOf(
        TestCategory(1, "Food", 0.0),
        TestCategory(2, "Book", 0.0),
        TestCategory(3, "Relax", 0.0),
        TestCategory(4, "Relax", 0.0),
        TestCategory(5, "Relax", 32.0),
        TestCategory(6, "Relax", 0.0),
        TestCategory(7, "Relax", 0.0),
        TestCategory(8, "Relax", 0.0),
        TestCategory(9, "Relax", 0.0),
        TestCategory(10, "Relax", 0.0),
        TestCategory(11, "Relax", 0.0)
    )
    val productList = mutableListOf(
        TestProduct(1, 1, "Coca-Cola", 2.0),
        TestProduct(2, 1, "Sprite", 4.0),
        TestProduct(3, 1, "Nuke", 5.0),
        TestProduct(4, 2, "Farm of Animals", 33.0),
        TestProduct(5, 1, "Chicken", 10.0)
    )

    fun getList(number: Int): List<TestProduct> {
        return productList.filter { it.idCategory ==  categoryList[number].id}
    }

}

