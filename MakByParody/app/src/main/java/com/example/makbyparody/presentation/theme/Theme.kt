package com.example.makbyparody.presentation.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

@Composable
fun MakByParodyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
    val colorScheme = LightColorScheme
    val view = LocalView.current
    SideEffect {
        val window = (view.context as Activity).window
        window.statusBarColor = colorScheme.primary.toArgb()
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true
    }
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

private val DarkColorScheme = darkColorScheme(
    primary = white,
    secondary = white,
    tertiary = white
)

private val LightColorScheme = lightColorScheme(
    primary = white,
    secondary = yellow,
    tertiary = yellow,
    onPrimary = yellow,

    onSurfaceVariant = darkTeal,    //цвет невыбранной иконки и текста
    secondaryContainer = makYellow,  //цвет выбранного овала
    onSecondaryContainer = darkTeal, // цвет выбранной иконки
    surface = white, //цвет панели нижней
    background = yellow, //цвет фона
    onBackground = yellow, //цвет текста на фоне по умолчанию

//    primary = yellow,
//    onPrimary = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    primaryContainer = yellow,
//    onPrimaryContainer = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    inversePrimary = yellow,
//    secondary = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onSecondary = yellow,
//    secondaryContainer = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onSecondaryContainer = yellow,
//    tertiary = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onTertiary = yellow,
//    tertiaryContainer = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onTertiaryContainer = yellow,
//    background = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onBackground = yellow,
//    surface = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onSurface = yellow,
//    surfaceVariant = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    onSurfaceVariant = yellow,
//    surfaceTint = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    inverseSurface = yellow,
//    inverseOnSurface = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    error = yellow,
//    onError = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    errorContainer = yellow,
//    onErrorContainer = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    outline = yellow,
//    outlineVariant = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    scrim = yellow,
//    surfaceBright = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    surfaceContainer = yellow,
//    surfaceContainerHigh = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    surfaceContainerHighest = yellow,
//    surfaceContainerLow = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//    surfaceContainerLowest = yellow,
//    surfaceDim = _root_ide_package_.com.example.makbyparody.presentation.theme.yellow,
//
)
