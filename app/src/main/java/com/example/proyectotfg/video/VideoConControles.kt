package com.example.proyectotfg.video

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeOff
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.LineHeightStyle
import com.example.proyectotfg.R


@Composable
fun VideoConControlDeSonido(context: Context) {
    var isMuted by remember { mutableStateOf(true) }
    var mediaPlayer: MediaPlayer? by remember { mutableStateOf(null) }

    Box {
        AndroidView(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .padding(horizontal = 16.dp)
            ,
            factory = {
                VideoView(it).apply {
                    val mediaController = MediaController(it)
                    mediaController.setAnchorView(this)
                    setMediaController(mediaController)

                    setVideoURI(Uri.parse("android.resource://${context.packageName}/${R.raw.videoturismomonforte}"))

                    setOnPreparedListener { mp ->
                        mediaPlayer = mp
                        mp.isLooping = true
                        mp.setVolume(0f, 0f)
                        start()
                    }
                }
            }
        )

        IconButton(
            onClick = {
                isMuted = !isMuted
                mediaPlayer?.setVolume(if (isMuted) 0f else 1f, if (isMuted) 0f else 1f)
            },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .size(40.dp)
                .background(Color.Black.copy(alpha = 0.5f), shape = CircleShape)
        ) {
            Icon(
                imageVector = if (isMuted) Icons.Default.VolumeOff else Icons.Default.VolumeUp,
                contentDescription = "Toggle sonido",
                tint = Color.White
            )
        }
    }
}