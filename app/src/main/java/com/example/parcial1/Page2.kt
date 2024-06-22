package com.example.parcial1
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parcial1.ui.theme.Parcial1Theme
@Composable
fun Page2(modifier: Modifier = Modifier, navController: NavController) {
    Column(modifier = Modifier) {
        Text(
            text = "¡Bienvenido! Pedro Pe",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 40.sp,
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Page2Preview() {
    Parcial1Theme {
        val navController = rememberNavController()
        Page2(navController = navController)
    }
}