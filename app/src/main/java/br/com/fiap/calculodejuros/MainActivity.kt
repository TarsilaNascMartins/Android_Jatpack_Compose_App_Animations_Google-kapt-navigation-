package br.com.fiap.calculodejuros

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.calculodejuros.components.CaixaDeEntrada
import br.com.fiap.calculodejuros.ui.theme.CalculoDeJurosTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculoDeJurosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}
@Preview
@Composable
fun Greeting() {

    var capital by remember { mutableStateOf("") }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFBDC7EC))
        .padding(32.dp),
        contentAlignment = Alignment.Center

    ) {
        CaixaDeEntrada(
            label = "Valor Investimento",
            placeholder = "Quanto deseja investir? ",
            value = capital,
            keyboardType = KeyboardType.Number,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            capital = it
        }

        Spacer(modifier = Modifier.height(16.dp))

        CaixaDeEntrada(
            label = "Valor Investimento",
            placeholder = "Quanto deseja investir? ",
            value = capital,
            keyboardType = KeyboardType.Number,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp)
        ) {
            capital = it
        }

        Spacer(modifier = Modifier.height(16.dp))

        CaixaDeEntrada(
            label = "Valor Investimento",
            placeholder = "Quanto deseja investir? ",
            value = capital,
            keyboardType = KeyboardType.Number,
            modifier = Modifier.fillMaxWidth().padding(top = 16.dp),  atualizarValor = {
                capital = it
            }
        )

    }
}

