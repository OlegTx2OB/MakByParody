package com.example.makbyparody.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.makbyparody.presentation.view.screens.AboutAppScreen
import com.example.makbyparody.presentation.view.screens.CouponsScreen
import com.example.makbyparody.presentation.view.screens.HomeScreen
import com.example.makbyparody.presentation.view.screens.LoginScreen
import com.example.makbyparody.presentation.view.screens.MenuScreen
import com.example.makbyparody.presentation.view.screens.MoreScreen
import com.example.makbyparody.presentation.view.screens.RestaurantsScreen
import com.example.makbyparody.presentation.viewmodel.AboutAppViewModel
import com.example.makbyparody.presentation.viewmodel.CouponsViewModel
import com.example.makbyparody.presentation.viewmodel.HomeViewModel
import com.example.makbyparody.presentation.viewmodel.LoginViewModel
import com.example.makbyparody.presentation.viewmodel.MenuViewModel
import com.example.makbyparody.presentation.viewmodel.MoreViewModel
import com.example.makbyparody.presentation.viewmodel.RestaurantsViewModel

object Screens {
    const val HOME = "home"
    const val COUPONS = "coupons"
    const val MENU = "menu"
    const val RESTAURANTS = "restaurants"
    const val MORE = "more"
    const val ABOUT_APP = "about_app"
    const val LOGIN = "login"
    const val FOOD_ITEM = "food_item"
    const val MAP_OPTIONS = "map_options"
}

@Composable
fun AppNavHost(navController: NavHostController, paddingValues: PaddingValues) {
    NavHost(
        navController = navController,
        startDestination = Screens.HOME,
        modifier = Modifier.padding(paddingValues)
    ) {
        composable(Screens.HOME) {
            val viewModel: HomeViewModel = hiltViewModel()
            HomeScreen(navController, viewModel)
        }
        composable(Screens.COUPONS) {
            val viewModel: CouponsViewModel = hiltViewModel()
            CouponsScreen(navController, viewModel)
        }
        composable(Screens.MENU) {
            val viewModel: MenuViewModel = hiltViewModel()
            MenuScreen(navController, viewModel)
        }
        composable(Screens.RESTAURANTS) {
            val viewModel: RestaurantsViewModel = hiltViewModel()
            RestaurantsScreen(navController, viewModel)
        }
        composable(Screens.MORE) {
            val viewModel: MoreViewModel = hiltViewModel()
            MoreScreen(navController, viewModel)
        }
        composable(Screens.ABOUT_APP) {
            val viewModel: AboutAppViewModel = hiltViewModel()
            AboutAppScreen(navController, viewModel)
        }
        composable(Screens.LOGIN) {
            val viewModel: LoginViewModel = hiltViewModel()
            LoginScreen(navController, viewModel)
        }
        composable(Screens.FOOD_ITEM) {
            val viewModel: LoginViewModel = hiltViewModel()
            LoginScreen(navController, viewModel)
        }
        composable(Screens.MAP_OPTIONS) {
            val viewModel: LoginViewModel = hiltViewModel()
            LoginScreen(navController, viewModel)
        }
    }
}