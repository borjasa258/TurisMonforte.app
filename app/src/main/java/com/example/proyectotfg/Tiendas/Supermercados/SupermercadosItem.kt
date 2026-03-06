package com.example.proyectotfg.Tiendas.Supermercados

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
import com.example.proyectotfg.Tiendas.Comercios.Tiendas
import com.example.proyectotfg.mapa.abrirGoogleMaps


@Composable
fun SupermercadosItem(supermercados: Supermercados) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = supermercados.nombre, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
            Text(text = "Dirección: ${supermercados.direccion}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Horario: ${supermercados.horario}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Teléfono: ${supermercados.telefono}", style = MaterialTheme.typography.bodyMedium)
            Text(text = "URL: ${supermercados.klm}", style = MaterialTheme.typography.bodySmall)
            Button(onClick = { abrirGoogleMaps(context, supermercados.latitud, supermercados.longitud) },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFC374)
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