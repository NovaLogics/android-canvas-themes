package novalogics.android.androidcanvas.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.*
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import novalogics.android.canvas_themes.material_canvas.MaterialCanvas

@Composable
fun ThemeDemoScreen() {
    val colorScheme = MaterialCanvas.grayscaleTheme.darkColorScheme
    val primary = colorScheme.primary
    val onPrimary = colorScheme.onPrimary
    val secondary = colorScheme.secondary
    val onSecondary = colorScheme.onSecondary
    val error = colorScheme.error
    val onError = colorScheme.onError
    val surface = colorScheme.surface
    val onSurface = colorScheme.onSurface
    val background = colorScheme.background
    val onBackground = colorScheme.onBackground

    // Column to arrange components vertically
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {
            // Title
            Text(
                "Material Canvas \nGrayscale Theme Demo",
                color = onBackground,
                style = MaterialTheme.typography.titleLarge,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Primary Button
            Button(
                onClick = {},
                colors = buttonColors(containerColor = primary),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
            ) {
                Text(
                    "Primary Button",
                    color = onPrimary,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Serif,
                    letterSpacing = 0.8.sp,
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            // Secondary Button
            Button(
                onClick = { /*TODO*/ },
                colors = buttonColors(containerColor = secondary),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
            ) {
                Text(
                    "Secondary Button",
                    color = onSecondary,
                    fontWeight = FontWeight.W500,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.SansSerif,
                    letterSpacing = 0.8.sp,
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))

            // Tertiary Button
            Button(
                onClick = { },
                colors = buttonColors(containerColor = colorScheme.tertiary),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 8.dp)
            ) {
                Text(
                    "Tertiary Button", color = colorScheme.onTertiary,
                    fontWeight = FontWeight.W500,
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Monospace,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier.padding(
                        top = 4.dp,
                        bottom = 4.dp,
                    )
                )
            }
         
            Spacer(modifier = Modifier.height(32.dp))

            // Sliders to show the surfaceVariant and outline
            Text(
                "Surface Variant",
                color = colorScheme.surfaceVariant,
                fontWeight = FontWeight.W500,
                fontSize = 16.sp,
                letterSpacing = 0.6.sp,
            )
            Spacer(modifier = Modifier.height(2.dp))
            Slider(
                value = 0.5f,
                onValueChange = { },
                modifier = Modifier.fillMaxWidth(),
                colors = SliderDefaults.colors(
                    thumbColor = colorScheme.surfaceVariant,
                    activeTrackColor = colorScheme.surfaceVariant,
                    inactiveTrackColor = colorScheme.outlineVariant
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
            ) {
                // First Row (2 Cards)
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    // First Card
                    CardItem(
                        text = "Surface Card",
                        icon = Icons.Filled.Favorite,
                        surface = surface,
                        onSurface = onSurface
                    )
                    // Second Card
                    CardItem(
                        text = "Error Box ",
                        icon = Icons.Filled.Warning,
                        surface = error,
                        onSurface = onError
                    )
                }

                // Second Row (2 Cards)
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                ) {
                    // Third Card
                    CardItem(
                        text = "Inverse Surface",
                        icon = Icons.Filled.CheckCircle,
                        surface = colorScheme.inverseSurface,
                        onSurface = colorScheme.inverseOnSurface
                    )
                    // Fourth Card
                    CardItem(
                        text = "Scrim Overlay",
                        icon = Icons.Filled.PlayArrow,
                        surface = colorScheme.scrim.copy(alpha = 0.3f),
                        onSurface = colorScheme.onSurface
                    )
                }
            }


            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(colorScheme.scrim.copy(alpha = 0.3f))
            ) {
                Text(
                    "Scrim Overlay",
                    color = onSurface,
                    fontWeight = FontWeight.W500,
                    fontSize = 16.sp,
                    letterSpacing = 0.6.sp,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }
}

@Composable
fun CardItem(text: String, icon: ImageVector, surface: Color, onSurface: Color) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(120.dp)
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = surface)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = onSurface,
                modifier = Modifier.size(32.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = text,
                color = onSurface,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W500,
                fontSize = 16.sp,
                letterSpacing = 0.5.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewColorDemoScreen() {
    ThemeDemoScreen()
}
