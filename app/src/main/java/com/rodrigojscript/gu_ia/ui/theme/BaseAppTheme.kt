package com.rodrigojscript.gu_ia.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun BaseAppTheme(content: @Composable () -> Unit) {
    GuIaTheme {
        Surface(color = MaterialTheme.colors.background)
        {
            content()
        }
    }
}
