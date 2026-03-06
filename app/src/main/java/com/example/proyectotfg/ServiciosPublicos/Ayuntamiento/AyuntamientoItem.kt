package com.example.proyectotfg.ServiciosPublicos.Ayuntamiento

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.proyectotfg.R
import com.example.proyectotfg.Tiendas.Peluquerias.Peluquerias
import com.example.proyectotfg.mapa.abrirGoogleMaps

@Composable
fun AyuntamientoItem(ayuntamiento: Ayuntamiento) {
    val context = LocalContext.current  // Obtiene el contexto para abrir el enlace

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = ayuntamiento.nombre, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text(text = "Dirección: ${ayuntamiento.direccion}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Horario: ${ayuntamiento.horario}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Teléfono: ${ayuntamiento.telefono}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Lugar: ${ayuntamiento.lugar}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "URL: ${ayuntamiento.klm}", style = MaterialTheme.typography.bodySmall)
            Button(onClick = { abrirGoogleMaps(context, ayuntamiento.latitud, ayuntamiento.longitud) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.Azul_Inicio)
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