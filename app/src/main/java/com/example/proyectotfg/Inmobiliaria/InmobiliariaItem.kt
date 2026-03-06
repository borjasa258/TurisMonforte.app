package com.example.proyectotfg.Inmobiliaria

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.proyectotfg.Inmobiliaria.abrirPaginaWeb.abrirPaginaWeb
import com.example.proyectotfg.R
import com.example.proyectotfg.Tiendas.Supermercados.Supermercados
import com.example.proyectotfg.mapa.abrirGoogleMaps

@Composable
fun InmobiliariaItem(inmobiliaria: Inmobiliaria) {
    val context = LocalContext.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable{abrirPaginaWeb(context, inmobiliaria.url)}
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
            Image(
                painter = painterResource(id = inmobiliaria.imageId),
                contentDescription = "Imagen de lugares en venta o alquiler de una inmobiliaria",
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .clip(RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = inmobiliaria.titulo, style = MaterialTheme.typography.titleLarge, fontWeight = FontWeight.Bold)
                Text(text = "Descripción:\n ${inmobiliaria.descripcion}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Dirección: ${inmobiliaria.direccion}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Precio: ${inmobiliaria.precio}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Tipo: ${inmobiliaria.tipo}", style = MaterialTheme.typography.bodyMedium, fontWeight = FontWeight.Bold)
                Text(text = "Se encuentra en: ${inmobiliaria.lugar}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Teléfono: ${inmobiliaria.telefono}", style = MaterialTheme.typography.bodyMedium)
                Text(text = "Inmobiliaria: ${inmobiliaria.inmobiliarias}", style = MaterialTheme.typography.bodySmall)

            }
    }
}