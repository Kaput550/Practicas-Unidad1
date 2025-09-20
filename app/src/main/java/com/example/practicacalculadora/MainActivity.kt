package com.example.practicacalculadora

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicacalculadora.ui.theme.PracticaCalculadoraTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticaCalculadoraTheme {
                /*
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
                */
                Contenido()
            }
        }
    }
}

//Elementos
@Composable
fun Contenido(){
    //Variables
    val image = painterResource(R.drawable.sat)

    var cantidad by remember { mutableStateOf("") }
    var isr by remember { mutableStateOf("") }
    var neto by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp),
    verticalArrangement = Arrangement.Bottom,
    horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = image,
            contentDescription = null,
            //modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.padding(10.dp))

        TextField (
            value = cantidad ,
            onValueChange = { cantidad = it },
            label = { Text("Sueldo") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(10.dp))

        //Boton que reliza los calculos
        Button(onClick = {
            val sueldo = cantidad.toDoubleOrNull()
            if (sueldo != null) {
                val ISR = sueldo * 0.16
                val Neto = sueldo - ISR
                isr = "%.2f".format(ISR)
                neto = "%.2f".format(Neto)
            } else {
                isr = "ERROR DE ENTRADA"
                neto = "ERROR DE ENTRADA"
            }
        }) {
            Text("Calcular")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        //TextField para mostrar el calculo del isr
        TextField(
            value = isr,
            onValueChange = {isr=it},
            readOnly = true,
            placeholder = {Text("ISR")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.padding(10.dp))
        //TextField para mostrar el calculo del neto
        TextField(
            value = neto,
            onValueChange = {neto=it},
            readOnly = true,
            placeholder = {Text("neto")},
            modifier = Modifier.fillMaxWidth()
        )
    }
}

/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PracticaCalculadoraTheme {
        //Greeting("Android")
        Contenido()
    }
}