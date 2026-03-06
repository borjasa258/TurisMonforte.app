package com.example.proyectotfg.menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.proyectotfg.BotonesNavegacion.BotonesNavegacion
import com.example.proyectotfg.R
import com.example.proyectotfg.TopBarMonforte.TopBarMonforte

@Composable
fun PantallaMenu(navController: NavHostController) {
    Scaffold(
        topBar = { TopBarMonforte(navController) },
        bottomBar = { BotonesNavegacion(navController) },
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddingValues)
        ) {
            Text(
                text = "Explora la historia, lugares y servicios de tu localidad",
                fontSize = 24.sp,
                color = Color(0xFF0D47A1),
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            )
            Text(
                text = "Selecciona la imagen para conocer más información",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            val opciones = listOf(
                Triple("Historia →", R.drawable.monforteimagenhistoria, "historia"),
                Triple("Pedanías →", R.drawable.oritofotopedan_as, "lugares"),
                Triple("Fiestas y Tradiciones →", R.drawable.fiestasfoto, "fiestas y tradiciones"),
                Triple("Comercios y Establecimientos →", R.drawable.mercadofoto, "mapa"),
                Triple("Casas en Venta →", R.drawable.casasventa, "casasVentaMonforte"),
                Triple("Tienda →", R.drawable.tienda, "tienda")
            )

            opciones.forEach { (titulo, icono, ruta) ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Card(
                        shape = RoundedCornerShape(16.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
                        modifier = Modifier
                            .fillMaxWidth(0.85f)
                            .height(180.dp)
                            .clickable { navController.navigate(ruta) }
                    ) {
                        Image(
                            painter = painterResource(id = icono),
                            contentDescription = titulo,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Text(
                        text = titulo,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFF1B5E20),
                        modifier = Modifier
                            .background(Color(0xFFE8F5E9), RoundedCornerShape(8.dp))
                            .padding(horizontal = 16.dp, vertical = 6.dp)
                    )
                }
            }
            Image(
                painter = painterResource(id = R.drawable.escudo_original_correcto_monforte_del_cid),
                contentDescription = "Logo Ayuntamiento Monforte del Cid",
                modifier = Modifier
                    .fillMaxWidth()

            )
        }
    }
}

