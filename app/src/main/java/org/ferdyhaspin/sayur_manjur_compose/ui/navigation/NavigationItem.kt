package org.ferdyhaspin.sayur_manjur_compose.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector

/**
 * Created by ferdyhaspin on 16/12/22.
 */

data class NavigationItem(
    val title: String,
    val icon: ImageVector,
    val screen: Screen
)