package com.gonzalezblanchard.jetpackcomposenavigation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.gonzalezblanchard.jetpackcomposenavigation.navigations.AppScreens

@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar() {
                Text(text = "First Screen")
            }
        }
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) {
            BodyContent(navController)
        }
    }
}

@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola navegación")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route + "/Este es un parametro")
        }) {
            Text(text = "Navega")
        }
    }
}
