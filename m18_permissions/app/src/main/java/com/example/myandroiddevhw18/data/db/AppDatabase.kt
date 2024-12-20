package com.example.myandroiddevhw18.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myandroiddevhw18.data.model.Photo

@Database(
    entities = [
        Photo::class
    ], version = 2
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun photoDao(): PhotoDao
}