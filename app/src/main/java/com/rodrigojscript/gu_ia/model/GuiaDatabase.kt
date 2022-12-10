package com.rodrigojscript.gu_ia.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [GuiaEntity.Datos::class], version = 1, exportSchema = false)
abstract class GuiaDatabase : RoomDatabase() {
    abstract fun guiaDao(): GuiaDao

    companion object {
        private var INSTANCE: GuiaDatabase? = null
        fun getInstance(context: Context): GuiaDatabase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context, GuiaDatabase::class.java, "roombd").build()
            }
            return INSTANCE as GuiaDatabase
        }
    }
}