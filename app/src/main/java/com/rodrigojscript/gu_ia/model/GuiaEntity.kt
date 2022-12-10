package com.rodrigojscript.gu_ia.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class GuiaEntity {
    @Entity(tableName = "datos")
    data class Datos(
        @PrimaryKey(autoGenerate = true)
        var id: Int?,

        @ColumnInfo(name = "ticket")
        var ticket: Double,

        @ColumnInfo(name = "nombre")
        var nombre: String,

        @ColumnInfo(name = "codigo")
        var codigo: Int,

        @ColumnInfo(name = "precio")
        var precio: Double,

        @ColumnInfo(name = "cantidad")
        var cantidad: Int,
    )
}