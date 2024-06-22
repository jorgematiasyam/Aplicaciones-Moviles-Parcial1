package com.example.parcial1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcial1.ui.theme.Parcial1Theme

@Composable
fun Page1(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val usuarioPruebaEmail = "pedro@pe.com.ar"
    val usuarioPruebaPassword = "abc123"
    val usuarioPruebaNombre = "Pedro Pe"

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

    ) {
        Spacer(
            modifier = modifier
                .height(30.dp)
        )
        Text(
            text = "Ingrese su correo electrónico"
        )
        TextField(
            value = email,
            onValueChange = { email = it })
        Spacer(modifier = modifier.height(30.dp))

        Text(
            text = "Ingrese su contraseña"
        )
        TextField(value = password,
            onValueChange = { password = it })

        if (usuarioPruebaEmail == email && usuarioPruebaPassword == password) {
            Button(
                onClick = { navController.navigate("page2") },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Ingresar",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
        } else {
            Button(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(10.dp)
            ) {
                Text(
                    text = "Ingresar",
                    modifier = modifier.padding(horizontal = 10.dp)
                )
            }
            Text(
                text = "Datos incorrectos",
                modifier = modifier.padding(horizontal = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {
    Parcial1Theme {
        val navController = rememberNavController()
        Page1(navController = navController)
    }
}