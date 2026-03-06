package com.example.proyectotfg.tienda

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "productos")
data class ProductoBaseDeDatos(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val nombre: String,
    val precio: Double,
    val imagen: Int,
    val enCarrito: Boolean = false,
    val cantidad: Int = 1
)
