package com.rodrigojscript.gu_ia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rodrigojscript.gu_ia.view.screens.MainScreen
import com.rodrigojscript.gu_ia.view.theme.SplashScreen
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.gu_ia.view.screens.ShowData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") { SplashScreen(navController) }
                composable("mainscreen") { MainScreen(navController) }
                composable("showdata"){ ShowData(navController)}
            }
        }
    }
}