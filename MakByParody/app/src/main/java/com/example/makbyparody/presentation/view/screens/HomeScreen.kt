package com.example.makbyparody.presentation.view.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.makbyparody.presentation.viewmodel.HomeViewModel
import kotlin.math.roundToInt

@Composable
fun HomeScreen(navController: NavHostController, viewModel: HomeViewModel) {
    var xOffset by remember { mutableStateOf(0f) }
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .offset { IntOffset(xOffset.roundToInt(), 20) }
                .background(Color.DarkGray)
                .size(150.dp)
                .draggable(
                    orientation = Orientation.Horizontal,
                    state = rememberDraggableState { distance ->
                        xOffset += distance
                    }
                )
        )
        Text("xOffset: $xOffset", Modifier.padding(10.dp), fontSize=22.sp)
    }
}