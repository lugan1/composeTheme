package com.example.composethemestudy.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composethemestudy.ui.theme.ComposeThemeStudyTheme

@Composable
fun DetailScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.surface,
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
        shape = MaterialTheme.shapes.extraSmall
    ) {
        Column(
            modifier = Modifier.background(MaterialTheme.colorScheme.background).fillMaxWidth().height(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "title large",
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "body large",
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(Modifier.height(16.dp))
            Text(
                text = "label small",
                style = MaterialTheme.typography.labelSmall
            )
            Spacer(Modifier.height(16.dp))

            Button(
                onClick = {},
                colors = buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                shape = MaterialTheme.shapes.small
            ) {
                Text(
                    text = "Button Click",
                    style = MaterialTheme.typography.labelSmall
                )
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun DetailScreenPreview() {
    ComposeThemeStudyTheme(dynamicColor = false) {
        DetailScreen()
    }
}

@Preview(showSystemUi = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DetailScreenDarkPreview() {
    ComposeThemeStudyTheme(dynamicColor = false) {
        DetailScreen()
    }
}
