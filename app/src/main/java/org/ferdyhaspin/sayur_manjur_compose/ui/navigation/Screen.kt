package org.ferdyhaspin.sayur_manjur_compose.ui.navigation

/**
 * Created by ferdyhaspin on 16/12/22.
 */


sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Favourite : Screen("favourite")
    object Profile : Screen("profile")
    object DetailVegetable : Screen("home/{vegetableId}") {
        fun createRoute(vegetableId: Int) = "home/$vegetableId"
    }
}