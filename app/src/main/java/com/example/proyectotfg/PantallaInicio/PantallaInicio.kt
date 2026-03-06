package com.example.proyectotfg.PantallaInicio


import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.webkit.WebView
import android.widget.MediaController
import android.widget.VideoView
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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.example.proyectotfg.R
import com.example.proyectotfg.TopBarMonforte.TopBarMonforte
import com.example.proyectotfg.TopBarPantallasInicio.TopBarPantallasInicio
import com.example.proyectotfg.video.VideoConControlDeSonido

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "SetJavaScriptEnabled")
@Composable
fun HomeScreen(navController: NavHostController) {
    val context = LocalContext.current
    Scaffold(
        topBar = { TopBarPantallasInicio(navController) },
        content = {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(paddingValues = it)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 24.dp, vertical = 12.dp)
                            .background(
                                color = Color(0xFFF0F4FF),
                                shape = RoundedCornerShape(16.dp)
                            )
                    ) {
                        Text(
                            text = "Explora la historia y los encantos de Monforte del Cid.",
                            style = MaterialTheme.typography.titleMedium,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Medium,
                            textAlign = TextAlign.Center,
                            color = Color(0xFF1E3A8A),
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .shadow(4.dp, shape = RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ) {
                        Text(
                            text = stringResource(id = R.string.textointroduccion1),
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start,
                            color = Color.Black
                        )
                    }
                    VideoConControlDeSonido(context )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .shadow(4.dp, shape = RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ){
                        Text(
                            text = stringResource(id = R.string.textointroduccion2),
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .fillMaxWidth()
                                //.padding(16.dp)
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.superficie_monforte2),
                        contentDescription = "Foto de la superficie de Monforte del Cid",
                        modifier = Modifier
                            .fillMaxSize()
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .shadow(4.dp, shape = RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ){
                        Text(
                            text = stringResource(id = R.string.textointroduccion3),
                            fontSize = 16.sp,
                            textAlign = TextAlign.Start,
                            modifier = Modifier
                                .fillMaxWidth()
                                //.padding(16.dp)
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.fotoiniciomonforte),
                        contentDescription = "Foto de la plaza del ayuntamiento de Monforte del Cid.",
                        modifier = Modifier
                            .fillMaxWidth()
                            //.padding(16.dp)
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp, vertical = 8.dp)
                            .background(
                                color = Color.White,
                                shape = RoundedCornerShape(12.dp)
                            )
                            .shadow(4.dp, shape = RoundedCornerShape(12.dp))
                            .padding(16.dp)
                    ){
                        Text(
                            text = stringResource(id = R.string.textointroduccion4),
                            fontSize = 16.sp,
                            textAlign = TextAlign.Center,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .fillMaxWidth()
                                //.padding(16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(24.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 32.dp)
                            .background(color = Color(0xFFDDE7FF), shape = RoundedCornerShape(24.dp))
                            .clickable { navController.navigate("pantalla_menu") }
                            .padding(vertical = 12.dp, horizontal = 20.dp)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(
                            text = "Conoce todo sobre Monforte del Cid →",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color(0xFF1E3A8A),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.escudo_original_correcto_monforte_del_cid),
                        contentDescription = "Logo Ayuntamiento Monforte del Cid",
                        modifier = Modifier
                            .fillMaxWidth()
                            //.padding(16.dp)
                    )
                }
            }
        //}
    )
}