package com.gonzalezblanchard.jetpackcomposenavigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.gonzalezblanchard.jetpackcomposenavigation.navigations.AppScreens

@Composable
fun SecondScreen(navController: NavController) {
    Scaffold(/* ... */) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) {
            SecondBodyContent(navController)
        }
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Estas en la segunda pantalla")
        Button(onClick = {
            navController.navigate(route = AppScreens.FirstScreen.route)
        }) {
            Text(text = "Regresar a la primera")
        }
    }
}
