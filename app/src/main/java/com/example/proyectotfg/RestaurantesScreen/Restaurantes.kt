package com.example.proyectotfg.RestaurantesScreen

data class Restaurantes(
    val nombre: String,
    val direccion: String,
    val horario: String,
    val precioMedio: String,
    val telefono: String,
    val latitud: Double,
    val longitud: Double,
    val klm : String
)