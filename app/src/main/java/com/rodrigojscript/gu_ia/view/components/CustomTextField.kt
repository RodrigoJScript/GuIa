package com.rodrigojscript.gu_ia.view.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
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
        label = { Text(text = name) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next)
    )
}

@Composable
fun CustomTextFieldN(value: String, onChange: onChange, name: String) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        value = value,
        onValueChange = { onChange(it) },
        label = { Text(text = name) },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Number,
            imeAction = ImeAction.Next
        ), singleLine = true
    )
}