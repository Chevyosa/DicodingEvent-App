package com.chev.dicodingeventapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.chev.dicodingeventapp.ui.navigations.NavGraph
import com.chev.dicodingeventapp.ui.navigations.Navigation
import com.chev.dicodingeventapp.ui.screen.home.HomeScreen
import com.chev.dicodingeventapp.ui.theme.DicodingEventAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DicodingEventAppTheme {
                Navigation()
            }
        }
    }
}
