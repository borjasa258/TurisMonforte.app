package com.example.proyectotfg.ServiciosPublicos.Ayuntamiento

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AyuntamientoScreenPrincipal(navController: NavHostController) {
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
                        .padding(16.dp)
                ) {


                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState()),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 12.dp)
                                .background(
                                    color = Color(0xFFE3F2FD),
                                    shape = RoundedCornerShape(12.dp)
                                )
                                .shadow(4.dp, RoundedCornerShape(12.dp))
                        ) {
                            Text(
                                text = "🏛️ Edificios Administrativos",
                                style = MaterialTheme.typography.headlineMedium.copy(
                                    fontWeight = FontWeight.ExtraBold,
                                    fontSize = 24.sp,
                                    shadow = Shadow(
                                        color = Color.Gray,
                                        offset = Offset(2f, 2f),
                                        blurRadius = 4f
                                    )
                                ),
                                color = Color(0xFF0D47A1),
                                modifier = Modifier
                                    .padding(16.dp)
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                        Text(
                            text = "Elige la opción que desee",
                            style = MaterialTheme.typography.headlineMedium,
                            fontSize = 24.sp,
                            color = Color.Black,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        IconButton(
                            onClick = { navController.navigate("ayuntamiento_edificio") },
                            modifier = Modifier.size(200.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icono_ayuntamiento),
                                contentDescription = "Icono de Edificio del ayuntamiento",
                                modifier = Modifier.padding(16.dp)
                            )
                        }

                        Text(
                            text = "Ayuntamiento",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        IconButton(
                            onClick = { navController.navigate("centro_juvenil") },
                            modifier = Modifier.size(200.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icono_casadelajuventud),
                                contentDescription = "Icono de Centro Juvenil",
                                modifier = Modifier.padding(16.dp)
                            )
                        }

                        Text(
                            text = "Casa de la Juventud",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        IconButton(
                            onClick = { navController.navigate("serviciosSociales") },
                            modifier = Modifier.size(200.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icono_servicios_sociales),
                                contentDescription = "Icono de Servicios Sociales",
                                modifier = Modifier.padding(16.dp)
                            )
                        }

                        Text(
                            text = "Servicios Sociales",
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                }
            }
        }
    )
}
