package com.rodrigojscript.gu_ia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.rodrigojscript.gu_ia.view.screens.MainScreen
import com.rodrigojscript.gu_ia.view.theme.SplashScreen
import androidx.navigation.compose.rememberNavController
import com.rodrigojscript.gu_ia.view.screens.ShowData
import com.rodrigojscript.gu_ia.viewmodel.GuiaViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val guiaViewModel: GuiaViewModel = ViewModelProvider(this)[GuiaViewModel::class.java]
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "splash") {
                composable("splash") { SplashScreen(navController) }
                composable("mainscreen") { MainScreen(navController, guiaViewModel) }
                composable("showdata") { ShowData(navController, guiaViewModel) }
            }
        }
    }
}