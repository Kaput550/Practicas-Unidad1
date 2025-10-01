package com.example.appnfl.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.appnfl.components.ActionButton
import com.example.appnfl.components.ButtonWithIcon
import com.example.appnfl.components.Space
import com.example.appnfl.components.TextView
import com.example.appnfl.components.TitleBar
import com.example.appnfl.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("NFL news") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(0xFF013369)
                )
            )
        },

    ){
        ContentHomeView(navController)
    }
}
@Composable
fun ContentHomeView(navController: NavController){
    val id=10;
    Column(
        modifier = Modifier.fillMaxSize().background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Column(
            modifier = Modifier.fillMaxHeight(0.27f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Space(espacio = 40)
            ButtonWithIcon(
                name="",
                iconResId = R.drawable.afc,
                size = 300
            ){
                navController.navigate("AFC")
            }

        }

        Space(espacio = 40)

        Text(text = "Selecciona una conferencia",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black //Color nfl
        )

        Space(espacio = 40)

        Column(
            modifier = Modifier.fillMaxHeight(0.40f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ButtonWithIcon(
                name="",
                iconResId = R.drawable.nfc,
                size = 300
            ){
                navController.navigate("NFC")
            }

        }
    }
}