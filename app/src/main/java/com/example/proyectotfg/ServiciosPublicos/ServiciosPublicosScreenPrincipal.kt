package com.example.proyectotfg.ServiciosPublicos

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
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
import com.example.proyectotfg.mapa.opciones


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ServiciosPublicosScreenPrincipal(navController: NavHostController) {
    val opciones = listOf(
        Triple("Edificios Administrativos", R.drawable.ayuntamientomonforte1, "ayuntamiento"),
        Triple("Centros Educativos", R.drawable.colegio, "centrosEducativos"),
        Triple("Zonas Deportivas", R.drawable.pabellonmonforte1, "zonasDeportivas"),
        Triple("Parques", R.drawable.parques, "parques")
    )

    Scaffold(
        topBar = { TopBarMonforte(navController) },
        bottomBar = { BotonesNavegacion(navController) },
        content = { paddingValues ->
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    painter = painterResource(id = R.drawable.escudo_original_correcto_monforte_del_cid__1_),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight()
                        .align(alignment = Alignment.TopCenter)
                        .size(500.dp),
                    contentScale = ContentScale.Fit,
                    alpha = 0.10f
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(paddingValues)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 12.dp)
                            .background(
                                color = Color(0xFFFFF3E0),
                                shape = RoundedCornerShape(12.dp)
                            )
                            .shadow(4.dp, RoundedCornerShape(12.dp))
                    ) {
                        Text(
                            text = "Servicios Públicos",
                            style = MaterialTheme.typography.headlineMedium.copy(
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 32.sp,
                                shadow = Shadow(
                                    color = Color.DarkGray,
                                    offset = Offset(2f, 2f),
                                    blurRadius = 4f
                                )
                            ),
                            color = Color(0xFFE65100),
                            modifier = Modifier
                                .padding(16.dp)
                                .fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )
                    }

                    Text(
                        text = "Encuentra todo lo que necesitas.",
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 22.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Text(
                        text = "Selecciona la imagen para ver más información",
                        style = MaterialTheme.typography.headlineMedium,
                        fontSize = 16.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    LazyColumn(
                        modifier = Modifier.fillMaxSize().padding(16.dp),
                        state = rememberLazyListState()
                    ) {
                        items(opciones) { (titulo, icono, ruta) ->
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(vertical = 8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {

                                    Image(
                                        painter = painterResource(id = icono),
                                        contentDescription = "Icono de $titulo",
                                        modifier = Modifier
                                            .padding(8.dp)
                                            .clickable { navController.navigate(ruta) }
                                    )
                                Text(
                                    text = titulo,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier.fillMaxWidth()
                                )
                            }
                        }
                    }

                }
            }
        }
    )
}
