package com.example.proyectotfg.ServiciosPublicos.Parques

data class Parques (
    val nombre: String,
    val direccion: String,
    val lugar: String,
    val imageId : Int,
    val latitud: Double,
    val longitud: Double,
    val klm : String
)