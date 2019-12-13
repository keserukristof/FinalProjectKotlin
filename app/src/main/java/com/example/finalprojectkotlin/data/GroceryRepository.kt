package com.example.finalprojectkotlin.data

class GroceryRepository private constructor(private val groceryDao: GroceryDao){

    fun addGrocery(grocery: Grocery) {
        groceryDao.addGrocery(grocery)
    }

    fun getGroceryes() = groceryDao.getGroceryes()

    companion object {
        @Volatile private var instance: GroceryRepository? = null

        fun getInstance(groceryDao: GroceryDao) =
            instance ?: synchronized(this) {
                instance ?: GroceryRepository(groceryDao).also { instance = it }
            }
    }
}