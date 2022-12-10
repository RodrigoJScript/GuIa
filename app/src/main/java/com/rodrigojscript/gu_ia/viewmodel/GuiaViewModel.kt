package com.rodrigojscript.gu_ia.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.rodrigojscript.gu_ia.model.Database.GuiaEntity
import com.rodrigojscript.gu_ia.model.GuiaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GuiaViewModel(application: Application) : AndroidViewModel(application) {
    private val guiaRepository: GuiaRepository = GuiaRepository(application)

    fun getAllData(): LiveData<MutableList<GuiaEntity.Datos>> {
        return guiaRepository.readAllData
    }

    fun insertData(datos: GuiaEntity.Datos) {
        viewModelScope.launch(Dispatchers.IO) {
            guiaRepository.insertData(datos)
        }
    }

    fun deleteData(datos: GuiaEntity.Datos) {
        viewModelScope.launch(Dispatchers.IO) {
            guiaRepository.deleteData(datos)
        }
    }
}