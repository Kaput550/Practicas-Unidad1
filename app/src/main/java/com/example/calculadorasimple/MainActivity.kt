
package com.example.calculadorasimple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculadorasimple.ui.theme.CalculadoraSimpleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraSimpleTheme {

            Surface(modifier = Modifier.fillMaxSize()) {
                    CalculadoraUI()
                }
            }
        }
    }
}

@Composable
fun CalculadoraUI() {
    var input by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    fun onButtonClick(btn: String) {
        when (btn) {
            "C" -> {
                input = ""
                resultado = ""
            }
            "=" -> {
                resultado = calcular(input)
            }
            else -> {
                input += when (btn) {
                    "+", "-", "×", "÷" -> " $btn "
                    else -> btn
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Spacer(modifier = Modifier.height(40.dp)) // espacio para cámara/notch

        // Pantalla
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp),
            horizontalAlignment = Alignment.End
        ) {
            Text(
                text = input,
                fontSize = 32.sp,
                maxLines = 1,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
            Text(
                text = resultado,
                fontSize = 20.sp,
                color = Color.Gray,
                maxLines = 1,
                textAlign = TextAlign.End,
                modifier = Modifier.fillMaxWidth()
            )
        }

        // Botones
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            // Primera fila: 7, 8, 9, ÷
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "7",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("7")
                }
                
                CalculatorButton(
                    text = "8",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("8")
                }
                
                CalculatorButton(
                    text = "9",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("9")
                }
                
                CalculatorButton(
                    text = "÷",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("÷")
                }
            }

            // Segunda fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "4",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("4")
                }
                
                CalculatorButton(
                    text = "5",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("5")
                }
                
                CalculatorButton(
                    text = "6",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("6")
                }
                
                CalculatorButton(
                    text = "×",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("×")
                }
            }

            // Tercera fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "1",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("1")
                }
                
                CalculatorButton(
                    text = "2",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("2")
                }
                
                CalculatorButton(
                    text = "3",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("3")
                }
                
                CalculatorButton(
                    text = "-",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("-")
                }
            }

            // Cuarta fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                CalculatorButton(
                    text = "C",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("C")
                }
                
                CalculatorButton(
                    text = "0",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("0")
                }
                
                CalculatorButton(
                    text = ".",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick(".")
                }
                
                CalculatorButton(
                    text = "+",
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                ) {
                    onButtonClick("+")
                }
            }

            // Boton igual
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                CalculatorButton(
                    text = "=",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                ) {
                    onButtonClick("=")
                }
            }
        }
    }
}

// Hacer los botones funcionales
@Composable
fun CalculatorButton(
    text: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Button(onClick = onClick, modifier = modifier) {
        Text(
            text = text, 
            color = if (text.length == 1) Color.Yellow else Color.Green,
            fontSize = 20.sp
        )
    }
}

// Calculo
fun calcular(entrada: String): String {
    return try {
        val tokens = entrada.replace("×", "*").replace("÷", "/").split(" ")
        if (tokens.size < 3) return "Error"

        var resultado = tokens[0].toDoubleOrNull() ?: return "Error"
        var i = 1

        while (i < tokens.size) {
            val operador = tokens[i]
            val numero = tokens.getOrNull(i + 1)?.toDoubleOrNull() ?: return "Error"

            resultado = when (operador) {
                "+" -> resultado + numero
                "-" -> resultado - numero
                "*" -> resultado * numero
                "/" -> {
                    if (numero == 0.0) return "Error: División por 0"
                    resultado / numero
                }
                else -> return "Error"
            }
            i += 2
        }
        resultado.toString()
    } catch (_: Exception) {
        "Error"
    }

}