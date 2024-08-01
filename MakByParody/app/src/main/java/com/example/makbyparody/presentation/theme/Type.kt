package com.example.makbyparody.presentation.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight

// Set of Material typography styles to start with
val Typography = Typography(

    labelSmall = TextStyle(
        color = darkTeal,
        fontWeight = FontWeight.W500,
        fontSize = size11Sp
    ),

    headlineMedium = TextStyle(
        color = darkTeal,
        fontWeight = FontWeight.W700,
        fontSize = size16Sp,
    ),

    bodyLarge = TextStyle(
        color = darkTeal
    ),

    bodyMedium = TextStyle(
        color = darkTeal,
        letterSpacing = size075Sp,
        fontSize = size16Sp,
    ),

)