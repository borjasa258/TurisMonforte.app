package com.example.proyectotfg.ServiciosPublicos.CentrosEducativos

data class CentrosEducativos (
    val nombre: String,
    val direccion: String,
    val horario: String,
    val telefono: String,
    val lugar: String,
    val servicio: String,
    val latitud: Double,
    val longitud: Double,
    val klm : String
)