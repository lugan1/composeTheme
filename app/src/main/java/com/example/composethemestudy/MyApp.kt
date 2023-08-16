package com.example.composethemestudy

import androidx.compose.runtime.Composable
import com.example.composethemestudy.navigation.NavContainer
import com.example.composethemestudy.ui.theme.ComposeThemeStudyTheme

@Composable
fun MyApp() {
    ComposeThemeStudyTheme(dynamicColor = false) {
       NavContainer()
    }
}
