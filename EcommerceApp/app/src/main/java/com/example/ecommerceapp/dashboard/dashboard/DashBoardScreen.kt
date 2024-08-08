package com.example.ecommerceapp.dashboard.dashboard

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.ecommerceapp.R
import com.example.ecommerceapp.app.noColor
import com.example.ecommerceapp.app.purple
import com.example.ecommerceapp.dashboard.ItemScreen.home.presentaion.HomeScreenDestination
import com.example.ecommerceapp.dashboard.ItemScreen.notification.presentation.NotificationDestination
import com.example.ecommerceapp.dashboard.ItemScreen.order.presentation.OrderDestination
import com.example.ecommerceapp.dashboard.ItemScreen.profile.presentation.ProfileDestination
import com.example.ecommerceapp.login.presentation.LoginDestination
import com.example.ecommerceapp.navGraph.NavGraph
import kotlinx.coroutines.launch

@Composable
fun DashBoardScreen(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    val dashItems = listOf(
        DashBoardItem(route = HomeScreenDestination.HOME_ROUTE, image = R.drawable.home),
        DashBoardItem(route = NotificationDestination.NOTIFICATION_ROUTE, image = R.drawable.notification),
        DashBoardItem(route = OrderDestination.ORDER_ROUTE, image = R.drawable.order),
        DashBoardItem(route = ProfileDestination.PROFILE_ROUTE, image = R.drawable.profile)
    )

    val scope = rememberCoroutineScope()
    val navBackStackEntry = navHostController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry.value?.destination?.route

    Scaffold(
        bottomBar = {
            if (currentDestination != LoginDestination.LOGIN_ROUTE) {
                BottomAppBar (
                    modifier = Modifier.height(80.dp)
                ){
                    NavigationBar(
                        modifier = Modifier
                            .height(80.dp)
                    ) {
                        dashItems.forEach { item ->
                            NavigationBarItem(
                                colors = NavigationBarItemDefaults.colors(
                                    selectedIconColor = purple,
                                    indicatorColor = noColor
                                ),
                                selected = currentDestination == item.route,
                                onClick = {
                                    scope.launch {
                                        navHostController.navigate(item.route) {
                                            popUpTo(navHostController.graph.startDestinationId)
                                            launchSingleTop = true
                                        }
                                    }
                                },
                                icon = {
                                    when (val icon = item.image) {
                                        is ImageVector -> Icon(imageVector = icon, contentDescription = null)
                                        is Int -> Icon(painter = painterResource(id = icon), contentDescription = null)
                                        else -> throw IllegalArgumentException("Unsupported icon type")
                                    }
                                }
                            )
                        }
                    }
                }
            }
        }
    ) {
        NavGraph(navHostController = navHostController, Modifier.padding(it))
    }
}