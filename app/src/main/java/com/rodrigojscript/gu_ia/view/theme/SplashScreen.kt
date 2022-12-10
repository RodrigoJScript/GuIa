package com.rodrigojscript.gu_ia.view.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.rodrigojscript.gu_ia.R

@Composable
fun SplashScreen(navController: NavController) {
    BaseAppTheme {
        LaunchedEffect(key1 = true) {
            navController.popBackStack()
            navController.navigate("mainscreen")
        }

        Splash()
    }
}

@Composable
fun Splash() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.icoguia),
            contentDescription = "Logo de aplicacion",
            modifier = Modifier.size(250.dp, 250.dp)
        )
    }
}