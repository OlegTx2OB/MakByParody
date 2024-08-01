package com.example.makbyparody.presentation.view.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.makbyparody.presentation.navigation.AppNavHost
import com.example.makbyparody.presentation.navigation.bottomNavigationItems
import com.example.makbyparody.presentation.theme.Typography
import com.example.makbyparody.presentation.theme.maxLines1
import com.example.makbyparody.presentation.theme.size26Dp

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
        BottomNavigationBar(navController)
    }) { paddingValues ->
        AppNavHost(navController = navController, paddingValues = paddingValues)
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        bottomNavigationItems().forEach { navigationItem ->
            NavigationBarItem(selected = navigationItem.route == navController
                .currentBackStackEntryAsState().value?.destination?.route,
                label = {
                    Text(
                        text = stringResource(navigationItem.labelId),
                        maxLines = maxLines1,
                        overflow = TextOverflow.Ellipsis,
                        style = Typography.labelSmall,
                    )
                },
                icon = {
                    Icon(
                        painterResource(navigationItem.iconId),
                        contentDescription = stringResource(navigationItem.labelId),
                        modifier = Modifier.size(size26Dp)
                    )
                },
                onClick = {
                    navController.navigate(navigationItem.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = false
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                })
        }
    }
}