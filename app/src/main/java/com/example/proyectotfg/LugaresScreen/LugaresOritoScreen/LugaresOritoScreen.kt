package com.example.proyectotfg.LugaresScreen.LugaresOritoScreen


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
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
import androidx.compose.ui.graphics.Color
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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LugaresOritoScreen(navController: NavHostController){
    Scaffold(
        topBar = { TopBarMonforte(navController) },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .verticalScroll(rememberScrollState())

            ) {
                Column (
                    modifier = Modifier
                        .weight(1f)
                        .verticalScroll(rememberScrollState())
                ){
                    Spacer(modifier = Modifier.height(100.dp))
                    Text(
                        text = "Lugares de Interés en Orito",
                        style = MaterialTheme.typography.headlineSmall,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .background(color = colorResource(id = R.color.naranja))
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = stringResource(R.string.IntroduccionlugaresdeinteresOrito),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "1. Ermita de la Aparición.",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito1),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Image(
                        painter = painterResource(id = R.drawable.ermita_orito),
                        contentDescription = "Foto de la Ermita de la Aparición en Orito",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "2. Santuario Nuestra Señora de Orito y San Pascual.",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito2),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Image(
                        painter = painterResource(id = R.drawable.santuario),
                        contentDescription = "Foto del Santuario de Nuestra Señora de Orito y San Pascual",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                    )
                    Text(
                        text = "Virgen de Orito",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(bottom = 8.dp)
                            .align(Alignment.CenterHorizontally)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito3),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Image(
                        painter = painterResource(id = R.drawable.virgen_de_orito_detalle),
                        contentDescription = "Foto en detalle de la Virgen de orito",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "3. Cueva de San Pascual.",
                        fontSize = 24.sp,
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito4),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito5),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Image(
                        painter = painterResource(id = R.drawable.exterior_de_la_cueva),
                        contentDescription = "Foto de la cueva de San Pascual Bailón",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                    )
                    Text(
                        text = stringResource(R.string.lugaresdeinteresOrito6),
                        fontSize = 16.sp,
                        style = MaterialTheme.typography.bodyMedium
                    )
                    Image(
                        painter = painterResource(id = R.drawable.san_pascual),
                        contentDescription = "Foto de San Pascual Bailón",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(400.dp)
                    )
                }
                BotonesNavegacion(navController)
            }
        }
    )
}