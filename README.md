# ProxMon - Reverse Engineered Flutter Application

## Overview
ProxMon is a proxy monitoring Flutter application that has been successfully reverse engineered from the APK file. This repository now contains all the necessary components to rebuild and modify the application.

## Application Details
- **Package Name**: dev.reimu.proxmon
- **Version**: 1.0.0-beta13 (Build 343)
- **Framework**: Flutter with Android native components
- **Target SDK**: 29
- **Min SDK**: 20

## Reverse Engineering Results

### What was recovered:
1. **Android Project Structure**: Complete Android app structure with Gradle build files
2. **AndroidManifest.xml**: All permissions, activities, and metadata
3. **Resources**: Icons, layouts, styles, themes, and drawable resources
4. **Assets**: Flutter assets including fonts, translations, and app bundles
5. **Native Code**: Decompiled Java/Kotlin classes (minimal due to Flutter architecture)

### Project Structure:
```
├── android_project/           # Buildable Android project
│   ├── app/
│   │   ├── build.gradle      # App-level build configuration
│   │   └── src/main/
│   │       ├── AndroidManifest.xml
│   │       ├── kotlin/       # Main Activity (Kotlin)
│   │       ├── res/          # Android resources
│   │       └── assets/       # Flutter assets and bundles
│   └── build.gradle          # Project-level build configuration
├── decompiled_apk/           # Raw APK decompilation (apktool)
├── decompiled_source/        # Java source decompilation (JADX)
└── dev.reimu.proxmon.apk     # Original APK file
```

## Features Discovered
Based on the reverse engineering analysis, ProxMon includes:
- Multi-language support (11 languages: EN, DE, ES, FR, IT, NL, PL, PT, RU, ZH, ZH_Hant)
- Custom Product Sans font family
- In-app web browser capabilities
- Internet and foreground service permissions
- Material Design components

## Building and Development

### Prerequisites
1. **Flutter SDK** (required for full app development)
2. **Android Studio** or **Android SDK**
3. **Java JDK 8+**

### Setup Instructions

1. **Install Flutter**: 
   ```bash
   # Follow official Flutter installation guide
   # https://flutter.dev/docs/get-started/install
   ```

2. **Setup Android Project**:
   ```bash
   cd android_project
   ./gradlew build  # Build the Android project
   ```

3. **For Full Flutter Development**:
   - The Flutter source code needs to be reconstructed as it's compiled into native bytecode
   - The assets and structure provide a foundation for recreating the Flutter app
   - Use the translation files and assets as reference for rebuilding

### Rebuild Process

#### Option 1: Android-only modifications
```bash
cd android_project
./gradlew assembleDebug  # Build debug APK
./gradlew assembleRelease  # Build release APK
```

#### Option 2: Full Flutter development
1. Create a new Flutter project: `flutter create proxmon_rebuilt`
2. Copy assets from `android_project/app/src/main/assets/flutter_assets/`
3. Use translation files to recreate internationalization
4. Implement UI based on recovered resources and layouts

## Reverse Engineering Tools Used
- **apktool v2.9.3**: APK resource extraction and rebuilding capability
- **JADX v1.5.0**: Java bytecode decompilation
- **Android SDK tools**: APK analysis and validation

## Development Notes
- The app uses Flutter's platform channels for native Android integration
- Custom fonts (Product Sans) are included in assets
- Extensive internationalization support suggests a user-facing application
- In-app browser functionality via flutter_inappwebview plugin

## Security Considerations
- App requests INTERNET permission (expected for proxy monitoring)
- FOREGROUND_SERVICE permission for background operation
- Uses cleartext traffic (may need security review for production)

## Next Steps for Modification
1. Analyze existing functionality through the recovered assets
2. Set up Flutter development environment
3. Recreate core proxy monitoring functionality
4. Enhance or add new features as needed
5. Test thoroughly on target devices

## Legal Notice
This reverse engineering was performed for legitimate purposes of application modification and enhancement. Ensure compliance with applicable laws and original software licenses before redistribution.