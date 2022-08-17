package com.rodrigojscript.gu_ia.ui.screens

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.rodrigojscript.gu_ia.ui.components.CustomTextField
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


var totalTodo: Double = 0.0

@Composable
fun MainScreen() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    var nmb by rememberSaveable { mutableStateOf("") }
    var cod by rememberSaveable { mutableStateOf("") }
    var pre by rememberSaveable { mutableStateOf("") }
    var can by rememberSaveable { mutableStateOf("") }
    var nmb1 by rememberSaveable { mutableStateOf("") }
    var cod1 by rememberSaveable { mutableStateOf("") }
    var pre1 by rememberSaveable { mutableStateOf("") }
    var can1 by rememberSaveable { mutableStateOf("") }
    var nmb2 by rememberSaveable { mutableStateOf("") }
    var cod2 by rememberSaveable { mutableStateOf("") }
    var pre2 by rememberSaveable { mutableStateOf("") }
    var can2 by rememberSaveable { mutableStateOf("") }
    var nmb3 by rememberSaveable { mutableStateOf("") }
    var cod3 by rememberSaveable { mutableStateOf("") }
    var pre3 by rememberSaveable { mutableStateOf("") }
    var can3 by rememberSaveable { mutableStateOf("") }
    var nmb4 by rememberSaveable { mutableStateOf("") }
    var cod4 by rememberSaveable { mutableStateOf("") }
    var pre4 by rememberSaveable { mutableStateOf("") }
    var can4 by rememberSaveable { mutableStateOf("") }
    var nmb5 by rememberSaveable { mutableStateOf("") }
    var cod5 by rememberSaveable { mutableStateOf("") }
    var pre5 by rememberSaveable { mutableStateOf("") }
    var can5 by rememberSaveable { mutableStateOf("") }
    var nmb6 by rememberSaveable { mutableStateOf("") }
    var cod6 by rememberSaveable { mutableStateOf("") }
    var pre6 by rememberSaveable { mutableStateOf("") }
    var can6 by rememberSaveable { mutableStateOf("") }
    var nmb7 by rememberSaveable { mutableStateOf("") }
    var cod7 by rememberSaveable { mutableStateOf("") }
    var pre7 by rememberSaveable { mutableStateOf("") }
    var can7 by rememberSaveable { mutableStateOf("") }
    var nmb8 by rememberSaveable { mutableStateOf("") }
    var cod8 by rememberSaveable { mutableStateOf("") }
    var pre8 by rememberSaveable { mutableStateOf("") }
    var can8 by rememberSaveable { mutableStateOf("") }
    var nmb9 by rememberSaveable { mutableStateOf("") }
    var cod9 by rememberSaveable { mutableStateOf("") }
    var pre9 by rememberSaveable { mutableStateOf("") }
    var can9 by rememberSaveable { mutableStateOf("") }

    var valTicket by remember { mutableStateOf("") }
    var tot: Double? by remember { mutableStateOf(0.0) }
    var tot1: Double? by remember { mutableStateOf(0.0) }
    var tot2: Double? by remember { mutableStateOf(0.0) }
    var tot3: Double? by remember { mutableStateOf(0.0) }
    var tot4: Double? by remember { mutableStateOf(0.0) }
    var tot5: Double? by remember { mutableStateOf(0.0) }
    var tot6: Double? by remember { mutableStateOf(0.0) }
    var tot7: Double? by remember { mutableStateOf(0.0) }
    var tot8: Double? by remember { mutableStateOf(0.0) }
    var tot9: Double? by remember { mutableStateOf(0.0) }
    var valTicketN: Double? by remember { mutableStateOf(0.0) }
    var totalTod by remember { mutableStateOf(totalTodo.toString()) }
    val stateLay = rememberLazyListState()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = { TopAppBar(title = { Text(text = "Ticket") }) }) {
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
                        if (valTicket.isEmpty()) {
                            coroutineScope.launch {
                                scaffoldState.snackbarHostState.showSnackbar(
                                    message = "Campo ticket esta en blanco",
                                    duration = SnackbarDuration.Short
                                )
                            }
                        }
                        tot = isNull(can, pre)
                        tot1 = isNull(can1, pre1)
                        tot2 = isNull(can2, pre2)
                        tot3 = isNull(can3, pre3)
                        tot4 = isNull(can4, pre4)
                        tot5 = isNull(can5, pre5)
                        tot6 = isNull(can6, pre6)
                        tot7 = isNull(can7, pre7)
                        tot8 = isNull(can8, pre8)
                        tot9 = isNull(can9, pre9)
                        valTicketN = isNullT(valTicket)
                        totalTod =
                            (tot!! + tot1!! + tot2!! + tot3!! + tot4!! + tot5!! + tot6!! + tot7!! + tot8!! + tot9!! + valTicketN!!).toString()
                    }) {
                        Text(text = "Calcular")
                    }
                }
            }
        }
    }
}

fun isNull(can: String, pre: String): Double? {
    return try {
        can.toDouble() * pre.toDouble()
    } catch (e: NumberFormatException) {
        0.0
    }
}

fun isNullT(input: String): Double? {
    return try {
        input.toDouble()
    } catch (e: NumberFormatException) {
        0.0
    }
}