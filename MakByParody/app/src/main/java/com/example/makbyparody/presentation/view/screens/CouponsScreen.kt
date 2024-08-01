package com.example.makbyparody.presentation.view.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.makbyparody.presentation.viewmodel.CouponsViewModel

@Composable
fun CouponsScreen(navController: NavHostController, viewModel: CouponsViewModel) {
    Text(text = "CouponsScreen", fontSize = 100.sp, maxLines = 1, overflow = TextOverflow.Ellipsis)
}