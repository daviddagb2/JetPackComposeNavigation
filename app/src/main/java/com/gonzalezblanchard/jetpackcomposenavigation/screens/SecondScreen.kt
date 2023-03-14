package com.gonzalezblanchard.jetpackcomposenavigation.screens

import android.widget.Space
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.gonzalezblanchard.jetpackcomposenavigation.navigations.AppScreens

@Composable
fun SecondScreen(navController: NavController, text:String?) {
    Scaffold(
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back Arrow",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    }
                )
                Spacer(modifier = Modifier.padding(8.dp))
                Text(text = "Second Screen")
            }
        }
    ) { contentPadding ->
        // Screen content
        Box(modifier = Modifier.padding(contentPadding)) {
            SecondBodyContent(navController, text)
        }
    }
}

@Composable
fun SecondBodyContent(navController: NavController, text:String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Estas en la segunda pantalla")
        text?.let {
            Text(text = it)
        }
        Button(onClick = {
            //navController.navigate(route = AppScreens.FirstScreen.route)
            navController.popBackStack()
        }) {
            Text(text = "Regresar a la primera")
        }
    }
}
