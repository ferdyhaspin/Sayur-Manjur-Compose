package org.ferdyhaspin.sayur_manjur_compose.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.ferdyhaspin.sayur_manjur_compose.ui.navigation.Screen
import org.ferdyhaspin.sayur_manjur_compose.ui.screen.favourite.FavouriteScreen
import org.ferdyhaspin.sayur_manjur_compose.ui.screen.home.HomeScreen
import org.ferdyhaspin.sayur_manjur_compose.ui.screen.home.detail.DetailScreen
import org.ferdyhaspin.sayur_manjur_compose.ui.screen.profile.ProfileScreen

/**
 * Created by ferdyhaspin on 27/12/22.
 */

@Composable
fun sayurManjurNavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Screen.Home.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(Screen.Home.route) {
            HomeScreen(navigateToDetail = { vegetableId ->
                navController.navigate(Screen.DetailVegetable.createRoute(vegetableId))
            })
        }
        composable(Screen.Favourite.route) {
            FavouriteScreen()
        }
        composable(Screen.Profile.route) {
            ProfileScreen()
        }
        composable(
            route = Screen.DetailVegetable.route,
            arguments = listOf(navArgument("vegetableId") { type = NavType.IntType }),
        ) {
            val id = it.arguments?.getInt("vegetableId") ?: -1
            DetailScreen(
                vegetableId = id,
                navigateBack = {
                    navController.navigateUp()
                },
                navigateToFavourite = {
                    navController.popBackStack()
                    navController.navigate(Screen.Favourite.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}