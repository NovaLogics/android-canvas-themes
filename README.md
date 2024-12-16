<h1 align="center" >Android Canvas Themes <br>♨ [ ᴀɴᴅʀᴏɪᴅ ʟɪʙʀᴀʀʏ ] ♨</h1>

## ɪ  ⁃  ᴀʙᴏᴜᴛ ᴀɴᴅʀᴏɪᴅ ʟɪʙʀᴀʀʏ

Android Canvas Themes is a Kotlin library that offers a range of Material Design inspired color themes for Android apps. It includes multiple ready to use themes and supports both light and dark modes, making it easy for developers to design visually appealing user interfaces.
<br>

<div align="center">

⁃ ᴄᴏɴᴛᴇɴᴛꜱ ⁃

[ɪɴꜱᴛᴀʟʟᴀᴛɪᴏɴ](#ɪɪ--ɪɴꜱᴛᴀʟʟᴀᴛɪᴏɴ)
| [ʟɪʙʀᴀʀʏ ᴜꜱᴀɢᴇ](#ɪɪɪ--ʟɪʙʀᴀʀʏ-ᴜꜱᴀɢᴇ)
| [ᴠɪꜱᴜᴀʟ ᴘʀᴇꜱᴇɴᴛᴀᴛɪᴏɴ](#ɪᴠ--ᴠɪꜱᴜᴀʟ-ᴛᴏᴜʀ-ᴏꜰ-ᴛʜᴇ-ʟɪʙʀᴀʀʏ-ᴜꜱᴀɢᴇ)
| [ᴘʀᴏᴊᴇᴄᴛ ʙʀᴀɴᴄʜᴇꜱ](#ᴠ--ᴘʀᴏᴊᴇᴄᴛ-ʙʀᴀɴᴄʜᴇꜱ)
| [ᴅᴇᴠ ꜰᴇᴀᴛᴜʀᴇꜱ](#ᴠɪ--ʙᴇʜɪɴᴅ-ᴛʜᴇ-ᴄᴏᴅᴇ-ᴅᴇᴠ-ꜰᴇᴀᴛᴜʀᴇꜱ)
| [ᴘʀᴏᴊᴇᴄᴛ ɴᴏᴛᴇꜱ](#ᴠɪɪ--ᴘʀᴏᴊᴇᴄᴛ-ɴᴏᴛᴇꜱ)

[![Platform](https://img.shields.io/badge/-Android-2E8B57?logo=android&logoColor=white&style=for-the-badge)](#)
[![Language](https://img.shields.io/badge/-Kotlin-%2307405e?logo=kotlin&logoColor=white&style=for-the-badge)](#)
[![License: MIT](https://img.shields.io/badge/-LICENSE%20|%20MIT-1C1E24?logo=maas&logoColor=00C7B7&style=for-the-badge)](./LICENSE)
<br>
<br>

<img src="./_archive/screenshots/screenshot_green_blaze_dark.png" width="220" height="480" />

<br>

</div>

## ɪɪ ⁃ ɪɴꜱᴛᴀʟʟᴀᴛɪᴏɴ


[![Jitpack Releases](https://img.shields.io/badge/-Jitpack%20|%201.0.0-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)

Add the following to your project's settings.gradle to enable JitPack:

```md
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
```
Then, add the dependency to your build.gradle file:
```md
dependencies {
    implementation 'com.github.novalogics:android-canvas-themes:0.0.7'
}
```

<br>

## ɪɪɪ ⁃ ʟɪʙʀᴀʀʏ ᴜꜱᴀɢᴇ

### ⭓ Accessing Themes

You can use the predefined themes available in the **MaterialCanvas** object. Each theme provides` lightColors, darkColors, lightColorScheme, and darkColorScheme` for customization.

```kotlin
val lightColorScheme = MaterialCanvas.amberBlazeTheme.lightColorScheme

val darkColorScheme = MaterialCanvas.greenBlazeTheme.darkColorScheme
```

#
#### Example: Applying Colors
Use the colors directly in your components:
```kotlin
val primaryColor = MaterialCanvas.greenBlazeTheme.lightColors.primary

val darkBackground = MaterialCanvas.purpleBlazeTheme.darkColors.background
```

#
#### Example: Applying a Theme

**Applying Light and Dark Mode**  
The library makes it easy to dynamically apply light and dark mode themes using MaterialTheme from Material3. Here’s an example:

```kotlin
@Composable
fun AppTheme(
  // Automatically detect system dark mode
    darkTheme: Boolean = isSystemInDarkTheme(), 
    content: @Composable () -> Unit
) {
  // ** Applying Green Blaze Theme > Light & Dark **
    val colorScheme = if (darkTheme) {
        MaterialCanvas.greenBlazeTheme.darkColorScheme
    } else {
        MaterialCanvas.greenBlazeTheme.lightColorScheme
    }

    // Edge-to-edge configuration
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            setUpEdgeToEdge(view, darkTheme)
        }
    }

    // Apply Material Theme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
```

**Usage in Your App**

```kotlin
@Composable
fun MyApp() {
    AppTheme { // Automatically adapts to system's light or dark mode
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Text(
                text = "Welcome to Android Canvas Themes!",
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
}
```

#
### ⭓ Library Features

- **Material Design Color Themes**: Includes a range of themes inspired by Material Design principles.

- **Predefined Themes**: Ready to use themes such as ***Grayscale, Amber Blaze, Orange Blaze, Blue Blaze, Green Blaze, Purple Blaze, Red Blaze, and Teal Blaze***

- **Light and Dark Mode Support**: All themes provide `lightColors` and `darkColors` for seamless transitions between modes.

- **Easy Integration**: Simple API for accessing color schemes and palettes.

- **JitPack Compatibility**: Easily add the library to your project using JitPack.

##
### ⭓ Requirements

[![MIN API LEVEL](https://img.shields.io/badge/-MIN%20SDK%20|%2024-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)
[![Target Version](https://img.shields.io/badge/-Target%20SDK%20|%2034-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)

- **Minimum SDK Version**: 24

<hr>

## ɪᴠ ⁃ ᴠɪꜱᴜᴀʟ ᴛᴏᴜʀ ᴏꜰ ᴛʜᴇ ʟɪʙʀᴀʀʏ ᴜꜱᴀɢᴇ

<p align="center">
<img 
  src="./_archive/screenshots/screenshot_green_blaze.png" 
   width="210" height="460" 
  />
<img 
  src="./_archive/screenshots/screenshot_green_blaze.png" 
  width="210" height="460" 
  />
<img
    src="./_archive/screenshots/screenshot_green_blaze.png" 
    width="210" height="460"
  />
<img
     src="./_archive/screenshots/screenshot_green_blaze.png" 
    width="210" height="460"
  />
  <img
    src="./_archive/screenshots/screenshot_green_blaze.png" 
    width="210" height="460"
  />
<img
     src="./_archive/screenshots/screenshot_green_blaze.png" 
    width="210" height="460"
  />
</p>


#
<div align="center">


![forthebadge](https://forthebadge.com/images/badges/built-with-love.svg)
![ForTheBadge GIT](https://forthebadge.com/images/badges/uses-git.svg)

<br>

<kbd>[&nbsp; ⮝ &nbsp;  BACK TO TOP  &nbsp;&nbsp;&nbsp;](#ɪ----ᴘʀᴏᴊᴇᴄᴛ-ɪɴꜰᴏ) </kbd>
</div>


#
## ᴠ ⁃ ᴘʀᴏᴊᴇᴄᴛ ʙʀᴀɴᴄʜᴇꜱ

<!-- Main / Master / Production Branch -->

> <samp> **PRODUCTION BRANCH :**  </samp>  
> Stable code for deployment  
> ➲ [main][branch-main]

> <samp> **STAGING BRANCH :**  </samp>  
> `FLOW | Staging → Production`  
> For pre-release testing, which ensures that the code is stable, bug-free, and ready for deployment.
<!--   
> ➲ [staging][branch-staging]
> -->

> <samp> **DEVELOPMENT BRANCH :**  </samp>  
> `FLOW | Development → Release → Staging → Production`  
> Active codebase for ongoing development efforts  (New features, bug fixes, and improvements..)  
> ➲ [development][branch-development]



> <samp> **FEATURE BRANCHES :** N/A  </samp>  
> `FLOW | Feature → Development → Release → Staging → Production`  
<!-- 
> <samp> **FEATURE BRANCHES :**  </samp>  
> For Isolated feature development (Ensures changes are tested and reviewed before merging into the main workflow)  
>   
> feature/  
> ➲ dark-theme  
> ➲ offline-db-impl
-->


> <samp> **RELEASE BRANCHES :** N/A  </samp>  
> `FLOW | Release → Staging → Production`  
<!-- 
> <samp> **RELEASE BRANCHES :**  </samp>  
> Prepares the code for final testing and deployment in a new version release.
>   
> release/  
> ➲ version-number
-->



> <samp> **HOTFIX BRANCHES :** N/A  </samp>  
> `FLOW | Hotfix → Staging → Production`  
<!-- 
> <samp> **HOTFIX BRANCHES :**  </samp>  
> Handles critical fixes in production that need immediate resolution.
>   
> hotfix/  
> ➲ main-screen-crash 
-->


> <samp> **BUGFIX BRANCHES :** N/A  </samp>  
> `FLOW | Bugfix → Development → Release → Staging → Production` 
<!-- 
> <samp> **BUGFIX BRANCHES :**  </samp>  
> Addresses specific bugs identified during development and testing.
>   
> bugfix/  
> ➲ main-screen-error
-->

<!-- 
> <samp> **EXPERIMENTAL BRANCHES :** N/A  </samp>  

> <samp> **EXPERIMENTAL BRANCHES :**  </samp>  
> Facilitates trial and error to test new ideas and concepts.
>   
> experiment/  
> ➲ main-screen-change-colours
-->
<!-- Experimental → Feature → Development → Release → Staging → Main/Production   -->


[branch-main]:  https://github.com/NovaLogics/android-canvas-themes/tree/main
[branch-development]:  https://github.com/NovaLogics/android-canvas-themes/tree/development
[branch-staging]:  https://github.com/NovaLogics/android-canvas-themes/tree/staging

[branch-feature-NAME]:  https://github.com/NovaLogics/android-canvas-themes/tree/staging

[branch-hotfix-NAME]:  https://github.com/NovaLogics/android-canvas-themes/tree/staging

[branch-bugfix-NAME]:  https://github.com/NovaLogics/android-canvas-themes/tree/staging

<br>  







#
## ᴠɪ ⁃ ʙᴇʜɪɴᴅ ᴛʜᴇ ᴄᴏᴅᴇ: ᴅᴇᴠ ꜰᴇᴀᴛᴜʀᴇꜱ

#
### ⭓ Project Documents

#
### ⭓ App Dependencies/Libraries Overview

#
### ⭓ Features

1. Project Resources &nbsp;|&nbsp; 



#
# ᴠɪɪ ⁃ ᴘʀᴏᴊᴇᴄᴛ ɴᴏᴛᴇꜱ


<br>
