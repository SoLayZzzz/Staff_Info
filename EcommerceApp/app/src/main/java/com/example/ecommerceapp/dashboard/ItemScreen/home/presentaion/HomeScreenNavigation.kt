package com.example.ecommerceapp.dashboard.ItemScreen.home.presentaion

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

object HomeScreenDestination{
    const val HOME_ROUTE = "home"
}

fun NavGraphBuilder.homeRoute(
    navHostController: NavHostController
){
    composable(route = HomeScreenDestination.HOME_ROUTE){
        HomeScreen()
    }
}