package com.example.proyectotfg.FiestasYTradiciones.FiestasYTradicionesScreenPrincipal


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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
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
fun FiestasMonforteScreenPrincipal(navController: NavHostController){
    Scaffold (
        topBar = { TopBarMonforte(navController) },
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
                    alpha = 0.08f
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
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 12.dp)
                                .background(
                                    color = Color(0xFFE3F2FD),
                                    shape = RoundedCornerShape(16.dp)
                                )
                                .shadow(4.dp, shape = RoundedCornerShape(16.dp))
                        ) {
                            Text(
                                text = "🎉 Fiestas en Monforte del Cid 🎉",
                                fontSize = 22.sp,
                                fontWeight = FontWeight.ExtraBold,
                                color = Color(0xFF0D47A1),
                                modifier = Modifier
                                    .padding(16.dp)
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = stringResource(R.string.fiestasYtradicionesMonforteScreenPrincipal1),
                            fontSize = 16.sp,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = stringResource(R.string.fiestasYtradicionesMonforteScreenPrincipal2),
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Italic,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Text(
                            text = stringResource(R.string.fiestasYtradicionesMonforteScreenPrincipal3),
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Italic,
                            style = MaterialTheme.typography.bodyMedium
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        Box(
                            modifier = Modifier
                                .size(350.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable { navController.navigate("fiestasEnMonforte") }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.cartelmorosycristianos),
                                    contentDescription = "Foto de fiestas Moros y Cristianos",
                                    modifier = Modifier
                                        .size(300.dp)
                                )
                                Text(
                                    text = "Fiestas de Moros y Cristianos",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Box(
                            modifier = Modifier
                                .size(350.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable { navController.navigate("fiestasEnSanRamon") }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.cartesanramon),
                                    contentDescription = "Cartel de las fiestas de San Ramón",
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally)
                                        .padding(start = 16.dp, top = 16.dp)
                                        .size(300.dp)
                                )
                                Text(
                                    text = "Fiestas de San Ramón",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(40.dp))
                        Box(
                            modifier = Modifier
                                .size(400.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable { navController.navigate("fiestasSanRoque") }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.san_roque),
                                    contentDescription = "Cartel de las fiestas de San Roque",
                                    modifier = Modifier
                                        .size(350.dp)
                                )
                                Text(
                                    text = "Fiestas de San Roque",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(20.dp))
                        Box(
                            modifier = Modifier
                                .size(350.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable { navController.navigate("fiestasMedievales") }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.folleto_fiestas_medievales_2022_delantera_copia_1_212x300),
                                    contentDescription = "Cartel de las fiestas Medievales",
                                    modifier = Modifier
                                        .padding(end = 16.dp, top = 16.dp)
                                        .size(300.dp)
                                )
                                Text(
                                    text = "Fiestas Medievales del Cid",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .width(350.dp)
                                .align(Alignment.CenterHorizontally)
                                .clickable { navController.navigate("fiestasSantoCristo") }
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.santocristo),
                                    contentDescription = "Foto fiestas del barrio Santo Cristo",
                                    modifier = Modifier
                                        .size(300.dp)
                                )
                                Text(
                                    text = "Fiestas del barrio Santo Cristo",
                                    fontSize = 20.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                        Spacer(modifier = Modifier.height(16.dp))

                    }
                    BotonesNavegacion(navController)
                }
            }
        }
    )
}