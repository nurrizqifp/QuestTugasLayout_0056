package com.example.profilkartu.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import com.example.questtugaslayout_0056.R

@Composable
fun ProfilKartuTheme(content: @Composable () -> Unit) {
    val colorScheme = lightColorScheme(
        background = colorResource(R.color.screen_background),
        surface = colorResource(R.color.screen_background),
        onBackground = colorResource(R.color.text_primary),
        onSurface = colorResource(R.color.text_primary),
    )

    MaterialTheme(
        colorScheme = colorScheme,
        content = content,
    )
}