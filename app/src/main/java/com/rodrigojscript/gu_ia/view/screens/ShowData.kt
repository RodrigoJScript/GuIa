package com.rodrigojscript.gu_ia.view.screens

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShowData(navController: NavHostController) {
    Scaffold(topBar = { TopAppBar(title = { Text(text = "Hola") }) }) {
        // TODO: Contenido
    }
}