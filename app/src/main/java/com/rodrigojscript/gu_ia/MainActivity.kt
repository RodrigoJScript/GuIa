package com.rodrigojscript.gu_ia

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rodrigojscript.gu_ia.ui.screens.MainScreen
import kotlinx.coroutines.DelicateCoroutinesApi

class MainActivity : ComponentActivity() {
    @OptIn(DelicateCoroutinesApi::class)
    @SuppressLint("CoroutineCreationDuringComposition")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}