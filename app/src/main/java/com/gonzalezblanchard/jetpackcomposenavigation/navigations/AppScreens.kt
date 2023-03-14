package com.gonzalezblanchard.jetpackcomposenavigation.navigations

sealed class AppScreens(val route:String){
    object FirstScreen:AppScreens("fist_screen")
    object SecondScreen:AppScreens("second_screen")
}
