package com.example.composebottombar.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreens(
    val route : String,
    val title : String,
    val icon : ImageVector
){
    object Home : BottomBarScreens("home","Home",Icons.Default.Home)
    object News : BottomBarScreens("news","News",Icons.Default.Info)
    object Downloads : BottomBarScreens("downloads","Downloads",Icons.Default.PlayArrow)
    object Settings : BottomBarScreens("settings","Settings",Icons.Default.Settings)
}
