package novalogics.android.androidcanvas.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import novalogics.android.androidcanvas.R
import novalogics.android.canvas_themes.material_canvas.MaterialCanvas

@Composable
fun ThemeDemoScreen() {
    val colorScheme = MaterialCanvas.orangeBlazeTheme.lightColorScheme
    val isLightMode = false
    val themeName = "Grayscale Theme"

    val currentMode = if (isLightMode) " ⚡ Light Mode" else " \uD83E\uDD87 Dark Mode"
    val imageRes = if (isLightMode) R.drawable.ic_light_mode else R.drawable.ic_night_mode

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
        ) {
            ThemeCard(
                colorScheme = colorScheme,
                currentMode = currentMode,
                themeName = themeName
            )
            Spacer(modifier = Modifier.height(24.dp))

            ButtonRow(
                colorScheme = colorScheme,
                imageRes = imageRes,
            )
            Spacer(modifier = Modifier.height(42.dp))

            SurfaceVariantSlider(colorScheme = colorScheme)
            Spacer(modifier = Modifier.height(24.dp))

            CardRow(colorScheme = colorScheme)
            OverlayBox(colorScheme = colorScheme)
        }
    }
}

@Composable
fun ThemeCard(colorScheme: ColorScheme, currentMode: String, themeName: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.onBackground),
    ) {
        Text(
            themeName,
            color = colorScheme.background,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            letterSpacing = 0.8.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )
        Text(
            currentMode,
            color = colorScheme.background,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            letterSpacing = 0.9.sp,
            fontWeight = FontWeight.W600,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        )
    }
}

@Composable
fun ButtonRow(colorScheme: ColorScheme, imageRes: Int) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        ButtonColumn(colorScheme = colorScheme)
        NightModeImage(colorScheme = colorScheme, imageRes = imageRes)
    }
}

@Composable
fun ButtonColumn(colorScheme: ColorScheme) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center
    ) {
        PrimaryButton(colorScheme = colorScheme)
        Spacer(modifier = Modifier.height(16.dp))

        SecondaryButton(colorScheme = colorScheme)
        Spacer(modifier = Modifier.height(16.dp))

        TertiaryButton(colorScheme = colorScheme)
    }
}

@Composable
fun PrimaryButton(colorScheme: ColorScheme) {
    Button(
        onClick = {},
        colors = buttonColors(containerColor = colorScheme.primary),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
    ) {
        Text(
            "Primary Button",
            color = colorScheme.onPrimary,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            fontFamily = FontFamily.Serif,
            letterSpacing = 0.8.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )
    }
}

@Composable
fun SecondaryButton(colorScheme: ColorScheme) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(containerColor = colorScheme.secondary),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
    ) {
        Text(
            "Secondary Button",
            color = colorScheme.onSecondary,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            fontFamily = FontFamily.Serif,
            letterSpacing = 0.8.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )
    }
}

@Composable
fun TertiaryButton(colorScheme: ColorScheme) {
    Button(
        onClick = {},
        colors = buttonColors(containerColor = colorScheme.tertiary),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp)
    ) {
        Text(
            "Tertiary Button",
            color = colorScheme.onTertiary,
            fontWeight = FontWeight.W500,
            fontSize = 18.sp,
            fontFamily = FontFamily.Monospace,
            letterSpacing = 0.3.sp,
            modifier = Modifier.padding(top = 4.dp, bottom = 4.dp)
        )
    }
}

@Composable
fun NightModeImage(colorScheme: ColorScheme, imageRes: Int) {
    Image(
        painter = painterResource(id = imageRes),
        contentDescription = null,
        modifier = Modifier
            .size(132.dp)
            .clip(CircleShape)
            .border(3.dp, colorScheme.surfaceVariant, CircleShape)
    )
}

@Composable
fun SurfaceVariantSlider(colorScheme: ColorScheme) {
    Text(
        "Surface Variant",
        color = colorScheme.onSurfaceVariant,
        fontWeight = FontWeight.W200,
        fontSize = 22.sp,
        fontFamily = FontFamily.Serif,
        letterSpacing = 1.2.sp,
    )
    Spacer(modifier = Modifier.height(2.dp))
    Slider(
        value = 0.5f,
        onValueChange = {},
        modifier = Modifier.fillMaxWidth(),
        colors = SliderDefaults.colors(
            thumbColor = colorScheme.onSurfaceVariant,
            activeTrackColor = colorScheme.surfaceVariant,
            inactiveTrackColor = colorScheme.outlineVariant
        )
    )
}

@Composable
fun CardRow(colorScheme: ColorScheme) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(4.dp)
    ) {
        FirstRow(colorScheme = colorScheme)
        SecondRow(colorScheme = colorScheme)
    }
}

@Composable
fun FirstRow(colorScheme: ColorScheme) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        CardItem(
            text = "Surface\nCard",
            icon = Icons.Filled.Favorite,
            surface = colorScheme.surface,
            onSurface = colorScheme.onSurface
        )
        CardItem(
            text = "Error\nBox",
            icon = Icons.Filled.Warning,
            surface = colorScheme.error,
            onSurface = colorScheme.onError
        )
    }
}

@Composable
fun SecondRow(colorScheme: ColorScheme) {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        CardItem(
            text = "Inverse\nSurface",
            icon = Icons.Filled.CheckCircle,
            surface = colorScheme.inverseSurface,
            onSurface = colorScheme.inverseOnSurface
        )
        CardItem(
            text = "Scrim\nCard",
            icon = Icons.Filled.PlayArrow,
            surface = colorScheme.scrim,
            onSurface = colorScheme.onPrimary
        )
    }
}

@Composable
fun CardItem(text: String, icon: ImageVector, surface: Color, onSurface: Color) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(160.dp)
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
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                letterSpacing = 0.5.sp
            )
        }
    }
}

@Composable
fun OverlayBox(colorScheme: ColorScheme) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.scrim.copy(alpha = 0.3f))
    ) {
        Text(
            "Scrim Overlay",
            color = colorScheme.onSurface,
            fontWeight = FontWeight.W500,
            fontSize = 16.sp,
            letterSpacing = 0.6.sp,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewColorDemoScreen() {
    ThemeDemoScreen()
}
