package com.example.ecommerceapp.dashboard.ItemScreen.profile.presentation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

object ProfileDestination{
    const val PROFILE_ROUTE = " profile"
}
fun NavGraphBuilder.profileRoute(){
    composable(route = ProfileDestination.PROFILE_ROUTE){
        ProfileScreen()
    }
}