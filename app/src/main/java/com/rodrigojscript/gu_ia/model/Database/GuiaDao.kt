package com.rodrigojscript.gu_ia.model.Database


import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GuiaDao {
    @Query("SELECT * FROM datos ORDER BY id DESC")
    fun getDatos(): LiveData<MutableList<GuiaEntity.Datos>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(datos: GuiaEntity.Datos)

    @Delete
    suspend fun delete(datos: GuiaEntity.Datos)
}