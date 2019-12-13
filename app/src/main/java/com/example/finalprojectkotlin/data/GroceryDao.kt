package com.example.finalprojectkotlin.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class GroceryDao {

    private val groceryList = mutableListOf<Grocery>()
    private val groceryes = MutableLiveData<List<Grocery>>()

    init {
        groceryes.value = groceryList
    }

    fun addGrocery(grocery: Grocery) {
        groceryList.add(grocery)
        groceryes.value = groceryList
    }

    fun getGroceryes() = groceryes as LiveData<List<Grocery>>
}