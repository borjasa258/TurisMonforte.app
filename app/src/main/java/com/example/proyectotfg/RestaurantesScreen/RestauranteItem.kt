package com.example.proyectotfg.RestaurantesScreen

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import com.example.proyectotfg.R
import com.example.proyectotfg.mapa.abrirGoogleMaps

@Composable
fun RestauranteItem(restaurante: Restaurantes) {
    val context = LocalContext.current  // Obtiene el contexto para abrir el enlace

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = restaurante.nombre, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text(text = "Dirección: ${restaurante.direccion}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Horario: ${restaurante.horario}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Precio Medio: ${restaurante.precioMedio}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Teléfono: ${restaurante.telefono}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "URL: ${restaurante.klm}", style = MaterialTheme.typography.bodySmall)
            Button(onClick = { abrirGoogleMaps(context, restaurante.latitud, restaurante.longitud) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFE07D53)
                )){
                Text(
                    text = "Abrir en Google Maps",
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)
            }
        }
    }
}