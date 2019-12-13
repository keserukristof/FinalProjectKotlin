package com.example.finalprojectkotlin.data

class Database private constructor() {

    var groceryDao = GroceryDao()
        private set

    companion object {
        @Volatile private var instance: Database? = null

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: Database().also { instance = it }
            }
    }
}