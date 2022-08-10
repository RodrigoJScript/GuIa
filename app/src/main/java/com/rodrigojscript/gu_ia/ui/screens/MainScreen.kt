package com.rodrigojscript.gu_ia.ui.screens

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.rodrigojscript.gu_ia.ui.components.CustomTextField

var totalTodo: Double = 0.0

@Composable
fun MainScreen() {
    var nmb by remember { mutableStateOf("") }
    var cod by remember { mutableStateOf("") }
    var pre by remember { mutableStateOf("") }
    var can by remember { mutableStateOf("") }
    var nmb1 by remember { mutableStateOf("") }
    var cod1 by remember { mutableStateOf("") }
    var pre1 by remember { mutableStateOf("") }
    var can1 by remember { mutableStateOf("") }
    var nmb2 by remember { mutableStateOf("") }
    var cod2 by remember { mutableStateOf("") }
    var pre2 by remember { mutableStateOf("") }
    var can2 by remember { mutableStateOf("") }
    var nmb3 by remember { mutableStateOf("") }
    var cod3 by remember { mutableStateOf("") }
    var pre3 by remember { mutableStateOf("") }
    var can3 by remember { mutableStateOf("") }
    var nmb4 by remember { mutableStateOf("") }
    var cod4 by remember { mutableStateOf("") }
    var pre4 by remember { mutableStateOf("") }
    var can4 by remember { mutableStateOf("") }
    var nmb5 by remember { mutableStateOf("") }
    var cod5 by remember { mutableStateOf("") }
    var pre5 by remember { mutableStateOf("") }
    var can5 by remember { mutableStateOf("") }
    var nmb6 by remember { mutableStateOf("") }
    var cod6 by remember { mutableStateOf("") }
    var pre6 by remember { mutableStateOf("") }
    var can6 by remember { mutableStateOf("") }
    var nmb7 by remember { mutableStateOf("") }
    var cod7 by remember { mutableStateOf("") }
    var pre7 by remember { mutableStateOf("") }
    var can7 by remember { mutableStateOf("") }
    var nmb8 by remember { mutableStateOf("") }
    var cod8 by remember { mutableStateOf("") }
    var pre8 by remember { mutableStateOf("") }
    var can8 by remember { mutableStateOf("") }
    var nmb9 by remember { mutableStateOf("") }
    var cod9 by remember { mutableStateOf("") }
    var pre9 by remember { mutableStateOf("") }
    var can9 by remember { mutableStateOf("") }

    var valTicket by remember { mutableStateOf("") }
    var tot by remember { mutableStateOf(0.0) }
    var tot1 by remember { mutableStateOf(0.0) }
    var tot2 by remember { mutableStateOf(0.0) }
    var tot3 by remember { mutableStateOf(0.0) }
    var tot4 by remember { mutableStateOf(0.0) }
    var tot5 by remember { mutableStateOf(0.0) }
    var tot6 by remember { mutableStateOf(0.0) }
    var tot7 by remember { mutableStateOf(0.0) }
    var tot8 by remember { mutableStateOf(0.0) }
    var tot9 by remember { mutableStateOf(0.0) }
    var totalTod by remember { mutableStateOf(totalTodo.toString()) }
    var expanded by remember { mutableStateOf(false) }
    var stateLay = rememberLazyListState()
    Scaffold(topBar = { TopAppBar(title = { Text(text = "Ticket") }) }) {
        LazyColumn(modifier = Modifier.fillMaxSize(), state = stateLay) {
            item {
                Column {
                    Row {
                        Text(text = "Valor ticket")

                        TextField(value = valTicket, onValueChange = { valTicket = it })
                    }
                    Card {
                        Column {
                            Text(text = "Nota 1")
                            CustomTextField(
                                value = nmb,
                                onChange = { nmb = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod,
                                onChange = { cod = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre,
                                onChange = { pre = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can,
                                onChange = { can = it },
                                "Cantidad"
                            )
                            Text(text = "$tot")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 2")
                            CustomTextField(
                                value = nmb1,
                                onChange = { nmb1 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod1,
                                onChange = { cod1 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre1,
                                onChange = { pre1 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can1,
                                onChange = { can1 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot1")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 3")
                            CustomTextField(
                                value = nmb2,
                                onChange = { nmb2 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod2,
                                onChange = { cod2 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre2,
                                onChange = { pre2 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can2,
                                onChange = { can2 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot2")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 4")
                            CustomTextField(
                                value = nmb3,
                                onChange = { nmb3 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod3,
                                onChange = { cod3 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre3,
                                onChange = { pre3 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can3,
                                onChange = { can3 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot3")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 5")
                            CustomTextField(
                                value = nmb4,
                                onChange = { nmb4 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod4,
                                onChange = { cod4 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre4,
                                onChange = { pre4 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can4,
                                onChange = { can4 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot4")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 6")
                            CustomTextField(
                                value = nmb5,
                                onChange = { nmb5 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod5,
                                onChange = { cod5 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre5,
                                onChange = { pre5 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can5,
                                onChange = { can5 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot5")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 7")
                            CustomTextField(
                                value = nmb6,
                                onChange = { nmb6 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod6,
                                onChange = { cod6 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre6,
                                onChange = { pre6 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can6,
                                onChange = { can6 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot6")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 8")
                            CustomTextField(
                                value = nmb7,
                                onChange = { nmb7 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod7,
                                onChange = { cod7 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre7,
                                onChange = { pre7 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can7,
                                onChange = { can7 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot7")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 9")
                            CustomTextField(
                                value = nmb8,
                                onChange = { nmb8 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod8,
                                onChange = { cod8 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre8,
                                onChange = { pre8 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can8,
                                onChange = { can8 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot8")
                        }
                    }
                    Card {
                        Column {
                            Text(text = "Nota 10")
                            CustomTextField(
                                value = nmb9,
                                onChange = { nmb9 = it },
                                "Nombre"
                            )
                            CustomTextField(
                                value = cod9,
                                onChange = { cod9 = it },
                                "Codigo"
                            )
                            CustomTextField(
                                value = pre9,
                                onChange = { pre9 = it },
                                "Precio"
                            )
                            CustomTextField(
                                value = can9,
                                onChange = { can9 = it },
                                "Cantidad"
                            )
                            Text(text = "$tot9")
                        }
                    }

                    Text(text = totalTod)
                    Button(onClick = {
                        tot = can.toDouble() * pre.toDouble()
                        tot1 = can1.toDouble() * pre1.toDouble()
                        tot2 = can2.toDouble() * pre2.toDouble()
                        tot3 = can3.toDouble() * pre3.toDouble()
                        tot4 = can4.toDouble() * pre4.toDouble()
                        tot5 = can5.toDouble() * pre5.toDouble()
                        tot6 = can6.toDouble() * pre6.toDouble()
                        tot7 = can7.toDouble() * pre7.toDouble()
                        tot8 = can8.toDouble() * pre8.toDouble()
                        tot9 = can9.toDouble() * pre9.toDouble()
                        totalTod =
                            (tot + tot1 + tot2 + tot3 + tot4 + tot5 + tot6 + tot7 + tot8 + tot9 + valTicket.toDouble()).toString()
                    }) {
                        Text(text = "Calcular")
                    }
                }
            }
        }
    }
}

