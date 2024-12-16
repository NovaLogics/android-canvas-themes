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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import novalogics.android.androidcanvas.R
import novalogics.android.canvasthemes.MaterialCanvas


val colorScheme = MaterialCanvas.amberBlazeTheme.darkColorScheme

@Composable
fun ThemeDemoScreen() {
    val isLightMode = false
    val themeName = "Amber Blaze Theme"

    val currentMode = if (isLightMode) " ✦ Light Mode ✦" else " ✧ Dark Mode ✧"
    val imageRes = if (isLightMode) R.drawable.ic_light_mode else R.drawable.ic_night_mode


    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp, bottom = 12.dp, end = 12.dp, top = 38.dp)
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
    val cardShape = RoundedCornerShape(topStart = 16.dp, bottomEnd = 16.dp)
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(
                elevation = 2.dp,
                shape = cardShape,
                clip = false
            )
            .border(2.dp, colorScheme.background.copy(alpha = 0.5f), cardShape),
        shape = cardShape,
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = colorScheme.tertiary),
    ) {
        Text(
            text = themeName,
            color = colorScheme.onSecondary,
            fontSize = 22.sp,
            letterSpacing = 0.8.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp)
        )

        Text(
            text = currentMode,
            color = colorScheme.surface,
            fontSize = 20.1.sp,
            letterSpacing = 0.8.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(bottom = 12.dp, top = 8.dp)
                .fillMaxWidth()
                .offset(1.dp, 1.dp) // Offset to simulate a border
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
            onSurface = colorScheme.secondary
        )
    }
}

@Composable
fun CardItem(text: String, icon: ImageVector, surface: Color, onSurface: Color) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(160.dp)
            .padding(8.dp)
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(12.dp),
                clip = false
            )
            .border(4.dp, onSurface.copy(alpha = 0.4f), RoundedCornerShape(12.dp)),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = surface),

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
