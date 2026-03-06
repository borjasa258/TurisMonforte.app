package com.example.proyectotfg.tienda

import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.navigation.NavController

@Composable
fun PantallaTienda(viewModel: TiendaViewModel, navController: NavController) {
    val productos by remember { derivedStateOf { viewModel.productos } }
    val carrito by rememberUpdatedState(viewModel.carrito)
    val cantidadEnCarrito = carrito.sumOf { it.cantidad }

    TiendaScreen(
        productos = productos,
        cantidadEnCarrito = cantidadEnCarrito,
        onAnadir = {
            viewModel.anadirAlCarrito(it)
        },
        onIrACarrito = { navController.navigate("cesta") },
        navController = navController
    )
}