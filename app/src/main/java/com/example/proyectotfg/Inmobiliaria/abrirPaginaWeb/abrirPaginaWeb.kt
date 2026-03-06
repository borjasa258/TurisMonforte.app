package com.example.proyectotfg.Inmobiliaria.abrirPaginaWeb

import android.content.Context
import android.content.Intent
import android.net.Uri

fun abrirPaginaWeb(context: Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}