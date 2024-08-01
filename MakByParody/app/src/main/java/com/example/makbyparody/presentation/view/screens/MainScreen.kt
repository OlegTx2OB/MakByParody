package com.example.makbyparody.presentation.view.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.makbyparody.presentation.navigation.Screens
import com.example.makbyparody.presentation.navigation.bottomNavigationItems
import com.example.makbyparody.presentation.theme.Typography
import com.example.makbyparody.presentation.theme.maxLines1
import com.example.makbyparody.presentation.theme.size26Dp
import com.example.makbyparody.presentation.theme.white
import com.example.makbyparody.presentation.viewmodel.CouponsViewModel
import com.example.makbyparody.presentation.viewmodel.HomeViewModel
import com.example.makbyparody.presentation.viewmodel.MenuViewModel
import com.example.makbyparody.presentation.viewmodel.MoreViewModel
import com.example.makbyparody.presentation.viewmodel.RestaurantsViewModel

@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            BottomNavigationBar(navController)
        }
    ) { paddingValues ->
        AppNavHost(navController = navController, paddingValues = paddingValues)
    }
}

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        bottomNavigationItems().forEach { navigationItem ->
            NavigationBarItem(
                selected = navigationItem.route == navController
                    .currentBackStackEntryAsState()
                    .value
                    ?.destination
                    ?.route,
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
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}

@Composable
fun AppNavHost(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = Screens.HOME,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Screens.HOME) {
            val viewModel: HomeViewModel = viewModel()
            HomeScreen(navController, viewModel)
        }
        composable(Screens.COUPONS) {
            val viewModel: CouponsViewModel = viewModel()
            CouponsScreen(navController, viewModel)
        }
        composable(Screens.MENU) {
            val viewModel: MenuViewModel = viewModel()
            MenuScreen(navController, viewModel)
        }
        composable(Screens.RESTAURANTS) {
            val viewModel: RestaurantsViewModel = viewModel()
            RestaurantsScreen(navController, viewModel)
        }
        composable(Screens.MORE) {
            val viewModel: MoreViewModel = viewModel()
            MoreScreen(navController, viewModel)
        }
    }
}