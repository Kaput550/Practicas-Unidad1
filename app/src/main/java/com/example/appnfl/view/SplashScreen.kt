package com.example.appnfl.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import com.example.appnfl.R

@Composable
fun SplashScreen(navController: NavController) {
    var screen :String by remember{mutableStateOf("")}
    screen="Home"

    LaunchedEffect(key1 = true) {
        delay(1000)
        navController.navigate(screen) {
            popUpTo(0) {
            }
        }
    }
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.logonfl),
            contentDescription = "Logo"
        )
    }
}