package com.rodrigojscript.gu_ia.view.components

import android.app.AlertDialog
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rodrigojscript.gu_ia.model.Database.GuiaEntity
import com.rodrigojscript.gu_ia.viewmodel.GuiaViewModel

@Composable
fun CustomCardData(item: GuiaEntity.Datos, guiaViewModel: GuiaViewModel) {
    val openDialog = remember { mutableStateOf(false) }

    if (openDialog.value) {
        AlertDialog(
            title = { Text(text = "Estas a punto de eliminar un registro") },
            text = {
                Text(
                    text = "¿Eliminar?"
                )
            },
            onDismissRequest = { openDialog.value = false },
            confirmButton = {
                TextButton(onClick = { // (4)
                    guiaViewModel.deleteData(item)
                    openDialog.value = false
                }) {
                    Text(text = "Eliminar", color = Color.Black)
                }
            },
            dismissButton = {
                TextButton(onClick = { // (5)
                    openDialog.value = false
                }) {
                    Text(text = "Cancelar", color = Color.Black)
                }
            }
        )
    }
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(4.dp))
            Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Ticket: $${item.ticket}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 1: $${item.nota1}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 2: $${item.nota2}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 3: $${item.nota3}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 4: $${item.nota4}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 5: $${item.nota5}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 6: $${item.nota6}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 7: $${item.nota7}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 8: $${item.nota8}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 9: $${item.nota9}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Nota 10: $${item.nota10}",
                    style = MaterialTheme.typography.caption,
                    fontSize = 16.sp
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            IconButton(onClick = { openDialog.value = true }) {
                Icon(Icons.Filled.Delete, "")
            }
        }
    }
}