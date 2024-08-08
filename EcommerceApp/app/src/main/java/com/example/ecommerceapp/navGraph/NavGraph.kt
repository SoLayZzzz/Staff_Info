package com.example.ecommerceapp.navGraph

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.ecommerceapp.dashboard.ItemScreen.home.presentaion.homeRoute
import com.example.ecommerceapp.dashboard.ItemScreen.notification.presentation.notificationRoute
import com.example.ecommerceapp.dashboard.ItemScreen.order.presentation.orderRoute
import com.example.ecommerceapp.dashboard.ItemScreen.profile.presentation.profileRoute
import com.example.ecommerceapp.login.presentation.LoginDestination
import com.example.ecommerceapp.login.presentation.logInRoute

@Composable
fun NavGraph(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navHostController,
        startDestination = LoginDestination.LOGIN_ROUTE) {
       // ======
        logInRoute(navHostController = navHostController)
        homeRoute(navHostController = navHostController)
        notificationRoute()
        orderRoute()
        profileRoute()
    }
}

