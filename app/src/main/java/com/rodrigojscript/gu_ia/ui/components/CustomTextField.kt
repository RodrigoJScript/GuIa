package com.rodrigojscript.gu_ia.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

typealias onChange = (String) -> Unit

@Composable
fun CustomTextField(value: String, onChange: onChange, name: String) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        value = value,
        onValueChange = { onChange(it) },
        label = { Text(text = name) })
}