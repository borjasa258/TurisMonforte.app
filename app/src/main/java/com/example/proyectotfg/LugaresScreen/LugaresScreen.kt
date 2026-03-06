package com.example.proyectotfg.LugaresScreen


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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
fun LugaresScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopBarMonforte(navController) },
        bottomBar = { BotonesNavegacion(navController) },
        content = {
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
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Spacer(modifier = Modifier.height(100.dp))
                        Text(
                            text = "Descubre los Lugares de Interés",
                            style = MaterialTheme.typography.headlineSmall,
                            fontWeight = FontWeight.ExtraBold,
                            color = Color(0xFFFF7043),
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .align(Alignment.CenterHorizontally)
                                .padding(vertical = 12.dp)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(
                                    color = Color.White,
                                    shape = RoundedCornerShape(12.dp)
                                )
                                .shadow(4.dp, shape = RoundedCornerShape(12.dp))
                                .padding(16.dp)
                        ){
                            Text(
                                text = stringResource(id = R.string.lugaresdeinteresIntroduccion),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(16.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.iglesia),
                                contentDescription = "Foto representativa de Monforte del Cid",
                                modifier = Modifier.size(200.dp)
                            )
                            Button(
                                onClick = { navController.navigate("lugares_monforte") },
                                modifier = Modifier.padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.colorFondoMonforteLugaresInteres))
                            ) {
                                Text(
                                    text = "Monforte del Cid",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Button(
                                onClick = { navController.navigate("lugares_orito") },
                                modifier = Modifier.padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.naranja))
                            ) {
                                Text(
                                    text = "Orito",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.orito),
                                contentDescription = "Foto representativa de Orito",
                                modifier = Modifier.size(200.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.fotocapitana),
                                contentDescription = "Foto representativa de La Capitana",
                                modifier = Modifier.size(200.dp)
                            )
                            Button(
                                onClick = { navController.navigate("lugares_capitana") },
                                modifier = Modifier.padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.colorFondoLaCapitanaLugaresInteres))
                            ) {
                                Text(
                                    text = "La Capitana",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Button(
                                onClick = { navController.navigate("lugares_alenda") },
                                modifier = Modifier.padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.colorFondoAlendaLugaresInteres))
                            ) {
                                Text(
                                    text = "Alenda",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                            Image(
                                painter = painterResource(id = R.drawable.fotorepresentativaalenda),
                                contentDescription = "Foto representativa de Alenda Golf",
                                modifier = Modifier.size(200.dp)
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.miniaturafontllop),
                                contentDescription = "Foto representativa de la Font del Llop",
                                modifier = Modifier.size(200.dp)
                            )
                            Button(
                                onClick = { navController.navigate("lugares_Fontllop") },
                                modifier = Modifier.padding(vertical = 8.dp),
                                colors = ButtonDefaults.buttonColors(colorResource(id = R.color.colorLugaresdeInteresFontLlop))
                            ) {
                                Text(
                                    text = "La Font del Llop",
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            }
                        }
                        Image(
                                painter = painterResource(id = R.drawable.escudo_original_correcto_monforte_del_cid),
                        contentDescription = "Logo Ayuntamiento Monforte del Cid",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                        )
                    }

                }
            }
        }
    )
}