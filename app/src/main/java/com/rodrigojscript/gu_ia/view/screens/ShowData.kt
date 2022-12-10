package com.rodrigojscript.gu_ia.view.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.rodrigojscript.gu_ia.model.Database.GuiaEntity
import com.rodrigojscript.gu_ia.view.components.CustomCardData
import com.rodrigojscript.gu_ia.view.theme.BaseAppTheme
import com.rodrigojscript.gu_ia.viewmodel.GuiaViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ShowData(navController: NavHostController, guiaViewModel: GuiaViewModel) {
    val list: List<GuiaEntity.Datos> = guiaViewModel.getAllData().observeAsState(listOf()).value
    BaseAppTheme {
        Scaffold(topBar = { TopAppBar(title = { Text(text = "Datos Guardados") }) }) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(vertical = 12.dp)
            ) {
                itemsIndexed(list) { _, item ->
                    CustomCardData(item, guiaViewModel)
                }
            }
        }
    }
}