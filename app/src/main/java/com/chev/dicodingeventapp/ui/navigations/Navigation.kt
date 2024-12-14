package com.chev.dicodingeventapp.ui.navigations

import android.annotation.SuppressLint
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Navigation() {
    val navHostController = rememberNavController()

    Scaffold(
        bottomBar = { BottomBar(navHostController) }
    ){
        NavGraph(navController = navHostController)
    }
}