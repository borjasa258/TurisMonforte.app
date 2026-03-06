package com.example.proyectotfg.mapa

import android.content.Context
import android.content.Intent
import android.net.Uri

fun abrirGoogleMaps(context: Context, latitud: Double, longitud: Double) {
    val uri = Uri.parse("geo:$latitud,$longitud?q=$latitud,$longitud (Lugar encontrado)")
    val intent = Intent(Intent.ACTION_VIEW, uri)
    intent.setPackage("com.google.android.apps.maps")
    context.startActivity(intent)
}
