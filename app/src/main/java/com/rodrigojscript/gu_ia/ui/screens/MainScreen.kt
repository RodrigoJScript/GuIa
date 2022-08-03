package com.rodrigojscript.gu_ia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.*
import com.rodrigojscript.gu_ia.ui.components.CustomTextField

var totalTodo: Double = 0.0

@Composable
fun MainScreen() {
    var nmb by remember { mutableStateOf("") }
    var cod by remember { mutableStateOf("") }
    var pre by remember { mutableStateOf("") }
    var can by remember { mutableStateOf("") }
    var valTicket by remember { mutableStateOf("") }
    var tot1 by remember { mutableStateOf(0.0) }
    var totalTod by remember { mutableStateOf(totalTodo.toString()) }
    Scaffold(topBar = { TopAppBar(title = { Text(text = "Ticket") }) }) {
        LazyColumn {
            item {
                Column {
                    Row {
                        Text(text = "Valor ticket")

                        TextField(value = valTicket, onValueChange = { valTicket = it })
                    }
                    Card {
                        Column {
                            CustomTextField(value = nmb, onChange = { nmb = it }, "Nombre")
                            CustomTextField(value = cod, onChange = { cod = it }, "Codigo")
                            CustomTextField(value = pre, onChange = { pre = it }, "Precio")
                            CustomTextField(value = can, onChange = { can = it }, "Cantidad")
                            Text(text = "$tot1")
                        }
                    }

                    Text(text = totalTod)
                    Button(onClick = {
                        tot1 = can.toDouble() * pre.toDouble()
                        totalTod = (tot1 + valTicket.toDouble()).toString()
                    }) {
                        Text(text = "Calcular")
                    }
                }
            }
        }
    }
}
