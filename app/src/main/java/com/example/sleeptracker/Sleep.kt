package com.example.sleeptracker
 import androidx.room.Entity
 import androidx.room.PrimaryKey

@Entity(tableName="sleep")
class Sleep(
    //SQLite Database
    @PrimaryKey(autoGenerate = true) val id: Int,
            val startDate :String,
                    val endDate: String,
                            val quality: Int
)