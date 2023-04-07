package com.example.composebottombar.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.composebottombar.screens.downloads.DownloadsScreen
import com.example.composebottombar.screens.home.HomeScreen
import com.example.composebottombar.screens.news.NewsScreen
import com.example.composebottombar.screens.settings.SettingsScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = BottomBarScreens.Home.route){
        composable(route = BottomBarScreens.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreens.News.route){
            NewsScreen()
        }
        composable(route = BottomBarScreens.Downloads.route){
            DownloadsScreen()
        }
        composable(route = BottomBarScreens.Settings.route){
            SettingsScreen()
        }
    }
}