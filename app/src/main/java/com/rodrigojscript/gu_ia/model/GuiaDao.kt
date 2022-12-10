package com.rodrigojscript.gu_ia.model


import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface GuiaDao {
    @Query("SELECT * FROM datos ORDER BY id DESC")
    fun getDatos(): LiveData<MutableList<GuiaEntity.Datos>>
}