package com.rodrigojscript.gu_ia.model.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class GuiaEntity {
    @Entity(tableName = "datos")
    data class Datos(
        @PrimaryKey(autoGenerate = true) var id: Int?,

        @ColumnInfo(name = "ticket") var ticket: Double,

        @ColumnInfo(name = "nota1") var nota1: Double,

        @ColumnInfo(name = "nota2") var nota2: Double,

        @ColumnInfo(name = "nota3") var nota3: Double,

        @ColumnInfo(name = "nota4") var nota4: Double,

        @ColumnInfo(name = "nota5") var nota5: Double,

        @ColumnInfo(name = "nota6") var nota6: Double,

        @ColumnInfo(name = "nota7") var nota7: Double,

        @ColumnInfo(name = "nota8") var nota8: Double,

        @ColumnInfo(name = "nota9") var nota9: Double,

        @ColumnInfo(name = "nota10") var nota10: Double,

        @ColumnInfo(name = "total") var total: Double,

        )
}