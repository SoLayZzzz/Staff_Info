package com.example.ecommerceapp.dashboard.ItemScreen.order.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object OrderDestination{
    const val ORDER_ROUTE = "order"
}

fun NavGraphBuilder.orderRoute(){
    composable(route = OrderDestination.ORDER_ROUTE){
        OrderScreen()
    }
}