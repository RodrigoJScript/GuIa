package com.rodrigojscript.gu_ia.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable

typealias onChange = (String) -> Unit

@Composable
fun CustomTextField(value: String, onChange: onChange, name: String) {
    TextField(
        value = value,
        onValueChange = { onChange(it) },
        label = { Text(text = name) })
}