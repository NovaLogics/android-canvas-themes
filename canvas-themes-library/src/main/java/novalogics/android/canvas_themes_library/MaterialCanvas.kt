package novalogics.android.canvas_themes_library


import androidx.compose.material3.ColorScheme
import novalogics.android.canvas_themes_library.handler.ThemeManager

class MaterialCanvas {
    private val themeManager: ThemeManager = ThemeManager

    fun getOrangeBlazeLightColors(): ColorScheme = themeManager.OrangeBlazeLightColors
}
