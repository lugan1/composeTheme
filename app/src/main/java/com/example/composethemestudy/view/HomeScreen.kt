package com.example.composethemestudy.view

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.composethemestudy.ui.theme.ComposeThemeStudyTheme

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Home Screen", color = MaterialTheme.colorScheme.onBackground)
        Spacer(Modifier.height(16.dp))
        Button(
            colors = buttonColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            ),
            onClick = { navController.navigate("detail") }
        ) {
            Text(text = "Go to Detail Screen")
        }
    }
}


@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreview() {
    ComposeThemeStudyTheme(dynamicColor = false) {
        HomeScreen(navController = rememberNavController())
    }
}

@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun HomeScreenDarkPreview() {
    ComposeThemeStudyTheme(dynamicColor = false) {
        HomeScreen(navController = rememberNavController())
    }
}
