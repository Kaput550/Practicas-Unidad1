package com.example.appnfl.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.appnfl.view.CowboysView
import com.example.appnfl.view.GreenBayPackersView
import com.example.appnfl.view.HomeView
import com.example.appnfl.view.NFCView
import com.example.appnfl.view.NewYorkGiantsView
import com.example.appnfl.view.PanthersView
import com.example.appnfl.view.SplashScreen

@Composable
fun NavManager() {
    val navController = rememberNavController()
    val context=LocalContext.current

    NavHost(navController = navController,
        startDestination = "Splash"){
        composable("Home"){
            HomeView(navController)
        }
        composable("Splash"){
            SplashScreen(navController)
        }
        composable("NFC"){
            NFCView(navController)
        }
        composable("Panthers"){
            PanthersView()
        }
        composable("Cowboys"){
            CowboysView()
        }
        composable("Giants"){
            NewYorkGiantsView()
        }
        composable("Packers"){
            GreenBayPackersView()
        }
    }
}