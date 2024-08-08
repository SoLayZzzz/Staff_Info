package com.example.ecommerceapp.dashboard.ItemScreen.notification.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object NotificationDestination{
    const val NOTIFICATION_ROUTE = "notification"
}

fun NavGraphBuilder.notificationRoute(

){
    composable(route = NotificationDestination.NOTIFICATION_ROUTE)
    {
        NotificationScreen()
    }
}