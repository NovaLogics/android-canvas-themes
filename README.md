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

<img src="./_archive/screenshots/screenshot_green_blaze.png" width="220" height="480" />

<br>

</div>

## ɪɪ ⁃ ɪɴꜱᴛᴀʟʟᴀᴛɪᴏɴ


[![Jitpack Releases](https://img.shields.io/badge/-Jitpack%20|%200.0.7-1C1E24?logo=planetscale&logoColor=00C7B7&style=for-the-badge)](#)

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

The library provides multiple pre-built themes, accessible through the MaterialCanvas object. Each theme contains both lightColorScheme and darkColorScheme.

```md
MaterialCanvas.greenBlazeTheme.darkColorScheme
MaterialCanvas.amberBlazeTheme.lightColors.primary
```

#### Example: Applying a Theme
To apply a theme in your composables, use the MaterialTheme and pass the desired color scheme.

```md
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.example.android.canvasthemes.MaterialCanvas

@Composable
fun MyApp() {
MaterialTheme(colorScheme = MaterialCanvas.amberBlazeTheme.lightColorScheme) {
// Your UI components go here
}
}
```

### ⭓ Library Features

- **Predefined Themes**: Includes multiple color themes such as Amber Blaze, Green Blaze, Purple Blaze, and more.

- **Light and Dark Modes**: Each theme comes with predefined color schemes for light and dark modes.

- **Material Design Standards**: Fully compatible with Material Design guidelines.

- **Easy Integration**: Available on JitPack for quick integration.

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
