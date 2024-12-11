package novalogics.android.androidcanvas.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ThemeDemoScreen() {
    // Extracted color variables
//    val primary = MaterialCanvas.grayscaleTheme.lightColorScheme.primary
//    val onPrimary = MaterialCanvas.grayscaleTheme.lightColorScheme.onPrimary
//    val secondary = MaterialCanvas.grayscaleTheme.lightColorScheme.secondary
//    val onSecondary = MaterialCanvas.grayscaleTheme.lightColorScheme.onSecondary
//    val error = MaterialCanvas.grayscaleTheme.lightColorScheme.error
//    val onError = MaterialCanvas.grayscaleTheme.lightColorScheme.onError
//    val surface = MaterialCanvas.grayscaleTheme.lightColorScheme.surface
//    val onSurface = MaterialCanvas.grayscaleTheme.lightColorScheme.onSurface
//    val background = MaterialCanvas.grayscaleTheme.lightColorScheme.background
//    val onBackground = MaterialCanvas.grayscaleTheme.lightColorScheme.onBackground

    Text("Primary")

}

@Preview(showBackground = true)
@Composable
fun PreviewColorDemoScreen() {
    ThemeDemoScreen()
}
