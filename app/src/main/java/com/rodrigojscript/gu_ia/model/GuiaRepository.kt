package com.rodrigojscript.gu_ia.model

import android.app.Application
import androidx.lifecycle.LiveData
import com.rodrigojscript.gu_ia.model.Database.GuiaDao
import com.rodrigojscript.gu_ia.model.Database.GuiaDatabase
import com.rodrigojscript.gu_ia.model.Database.GuiaEntity

class GuiaRepository(application: Application) {
    private var guiaDao: GuiaDao

    init {
        val database = GuiaDatabase.getInstance(application)
        guiaDao = database.guiaDao()
    }

    val readAllData: LiveData<MutableList<GuiaEntity.Datos>> = guiaDao.getDatos()

    suspend fun insertData(datos: GuiaEntity.Datos) {
        guiaDao.insert(datos)
    }

    suspend fun deleteData(datos: GuiaEntity.Datos) {
        guiaDao.delete(datos)
    }
}