package com.example.ecommerceapp.login.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.ecommerceapp.dashboard.ItemScreen.home.presentaion.HomeScreenDestination

@Composable
fun LoginScreen(
    navHostController: NavHostController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { navHostController.navigate(HomeScreenDestination.HOME_ROUTE)}) {
            Text(text = "Login Screen")
        }
    }
}