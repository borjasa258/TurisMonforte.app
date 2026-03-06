package com.example.proyectotfg.mapa

import com.example.proyectotfg.R

data class Opcion(val ruta: String, val icono: Int, val texto: String)

val opciones = listOf(
    Opcion("serviciosPublicos", R.drawable.icono_serviciospublicos, "Servicios Públicos"),
    Opcion("restaurantes", R.drawable.icono_restaurante, "Restaurantes"),
    Opcion("tiendas", R.drawable.icono_tienda, "Comercios"),
    Opcion("supermercados", R.drawable.icono_supermercado, "Supermercados"),
    Opcion("carnicerias", R.drawable.icono_carniceria, "Carnicerías"),
    Opcion("pescaderias", R.drawable.icono_pescaderia, "Pescaderías"),
    Opcion("mecanicos", R.drawable.icono_mecanico, "Talleres de vehículos"),
    Opcion("opticas", R.drawable.icono_optica, "Ópticas"),
    Opcion("peluqueria", R.drawable.icono_peluqueria, "Peluquerías"),
    Opcion("panaderias", R.drawable.icono_panaderia, "Panaderías")
)