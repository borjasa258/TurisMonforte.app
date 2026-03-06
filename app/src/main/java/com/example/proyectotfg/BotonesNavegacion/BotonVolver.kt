package com.example.proyectotfg.BotonesNavegacion

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun BotonVolver(navController: NavController) {
    IconButton(
        onClick = { navController.navigate("home") },
    ) {
        Icon(Icons.Default.Home, contentDescription = "Volver al Inicio")
    }
}