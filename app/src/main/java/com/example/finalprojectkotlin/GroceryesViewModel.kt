package com.example.finalprojectkotlin

import androidx.lifecycle.ViewModel
import com.example.finalprojectkotlin.data.Grocery
import com.example.finalprojectkotlin.data.GroceryRepository

class GroceryesViewModel(private val groceryRepository: GroceryRepository) : ViewModel(){

    fun getGroceryes() = groceryRepository.getGroceryes()

    fun addGrocery(grocery: Grocery) = groceryRepository.addGrocery(grocery)
}