package com.example.finalprojectkotlin.utils

import com.example.finalprojectkotlin.GroceryesViewModelFactory
import com.example.finalprojectkotlin.data.Database
import com.example.finalprojectkotlin.data.GroceryRepository

object InjectorUtils {
    fun provideGroceryesViewModelFactory(): GroceryesViewModelFactory {
        val groceryRepository = GroceryRepository.getInstance(Database.getInstance().groceryDao)
        return GroceryesViewModelFactory(groceryRepository)
    }
}