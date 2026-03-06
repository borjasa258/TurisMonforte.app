package com.example.proyectotfg.ServiciosPublicos.CentrosEducativos

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
import com.example.proyectotfg.ServiciosPublicos.Ayuntamiento.Ayuntamiento
import com.example.proyectotfg.mapa.abrirGoogleMaps

@Composable
fun CentrosEducativosItem(centrosEducativos: CentrosEducativos) {
    val context = LocalContext.current  // Obtiene el contexto para abrir el enlace

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = centrosEducativos.nombre, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text(text = "Dirección: ${centrosEducativos.direccion}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Horario: ${centrosEducativos.horario}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Teléfono: ${centrosEducativos.telefono}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Lugar: ${centrosEducativos.lugar}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Servicio: ${centrosEducativos.servicio}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "URL: ${centrosEducativos.klm}", style = MaterialTheme.typography.bodySmall)
            Button(onClick = { abrirGoogleMaps(context, centrosEducativos.latitud, centrosEducativos.longitud) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF7CB69E)
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