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
import com.example.appnfl.view.AFCView
import com.example.appnfl.view.BillsView
import com.example.appnfl.view.JetsView
import com.example.appnfl.view.DolphinsView
import com.example.appnfl.view.PatriotsView

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
        composable("AFC"){
            AFCView(navController)
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
        composable("Bills"){
            BillsView()
        }
        composable("Jets"){
            JetsView()
        }
        composable("Dolphins"){
            DolphinsView()
        }
        composable("Patriots"){
            PatriotsView()
        }
    }
}