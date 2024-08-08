package com.example.ecommerceapp.login.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable


object LoginDestination{
    const val LOGIN_ROUTE = "login"
}

fun NavGraphBuilder.logInRoute(
navHostController: NavHostController
) {
    composable(route = LoginDestination.LOGIN_ROUTE){
        LoginScreen(navHostController = navHostController)
    }
}