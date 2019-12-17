package com.example.finalprojectkotlin.room_recycler

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fake_table")
class Fake(@PrimaryKey @ColumnInfo(name = "fake") val fake: String)