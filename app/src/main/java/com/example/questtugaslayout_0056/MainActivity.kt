package com.example.questtugaslayout_0056

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.questtugaslayout_0056.ui.screen.ProfilScreen
import com.example.questtugaslayout_0056.ui.theme.ProfilKartuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfilKartuTheme {
                ProfilScreen()
            }
        }
    }
}