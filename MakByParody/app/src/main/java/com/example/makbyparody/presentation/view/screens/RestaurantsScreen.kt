package com.example.makbyparody.presentation.view.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.makbyparody.presentation.viewmodel.RestaurantsViewModel

@Composable
fun RestaurantsScreen(navController: NavHostController, viewModel: RestaurantsViewModel) {
    Text(text = "RestaurantsScreen", fontSize = 100.sp)
}