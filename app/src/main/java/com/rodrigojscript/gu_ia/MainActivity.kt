package com.rodrigojscript.gu_ia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rodrigojscript.gu_ia.ui.screens.MainScreen
import com.rodrigojscript.gu_ia.ui.theme.SplashScreen
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") { SplashScreen(navController) }
                composable("mainscreen") { MainScreen(navController) }
            }
        }
    }
}