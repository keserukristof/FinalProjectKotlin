package com.example.finalprojectkotlin.data

data class Grocery(val groceryText: String, val db: String) {
    override fun toString(): String {
        return "$groceryText - $db"
    }
}