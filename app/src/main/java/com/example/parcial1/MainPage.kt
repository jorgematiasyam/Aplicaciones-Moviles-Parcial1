package com.example.parcial1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcial1.Page1
import com.example.parcial1.ui.theme.Parcial1Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Istea - Aplicaciones móviles - Parcial 1"
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                ),
            )
        }
    ) {
        NavHost(
            navController = navController,
            modifier = Modifier.padding(it),
            startDestination = "Page1"
        ) {
            composable("page1"){Page1(navController = navController)}
            composable("page2"){Page2(navController = navController)}
        }
    }
}



/*
    Column(


        Text(
            text = "¡Bienvenido!",modifier = modifier
            .padding(vertical = 30.dp)
            .align(Alignment.CenterHorizontally)
            .height(30.dp),
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.primary

        )

        Text(text = "Ingrese su correo electrónico")
        TextField(value = "email", onValueChange = {})
        Spacer(modifier = modifier.height(30.dp))
        Text(text = "Ingrese su contraseña")
        TextField(value = "password", onValueChange = {})
        Button(
            onClick = {},
            modifier
                .align(Alignment.CenterHorizontally)
                .padding(10.dp)
        ) {
            Text(
                text = "Ingresar",
                modifier = modifier.padding(horizontal = 10.dp)
            )

        }
)
    }
)

*/



@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    Parcial1Theme {
        MainPage()
    }
}