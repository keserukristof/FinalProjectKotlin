package com.example.finalprojectkotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.finalprojectkotlin.data.GroceryRepository

class GroceryesViewModelFactory(private val groceryRepository: GroceryRepository)
    : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GroceryesViewModel(groceryRepository) as T
    }
}