package com.example.makbyparody.presentation.navigation

import com.example.makbyparody.R

data class BottomNavigationItem(
    val labelId : Int,
    val iconId : Int,
    val route : String,
)
fun bottomNavigationItems() : List<BottomNavigationItem> {
    return listOf(
        BottomNavigationItem(
            labelId = R.string.home,
            iconId = R.drawable.ic_home,
            route = Screens.HOME
        ),
        BottomNavigationItem(
            labelId = R.string.coupons,
            iconId = R.drawable.ic_coupon,
            route = Screens.COUPONS
        ),
        BottomNavigationItem(
            labelId = R.string.menu,
            iconId = R.drawable.ic_burger,
            route = Screens.MENU
        ),
        BottomNavigationItem(
            labelId = R.string.restaurants,
            iconId = R.drawable.ic_map,
            route = Screens.RESTAURANTS
        ),
        BottomNavigationItem(
            labelId = R.string.more,
            iconId = R.drawable.ic_more,
            route = Screens.MORE
        ),
    )
}