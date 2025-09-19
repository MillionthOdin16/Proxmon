# APK Rebuild Instructions

## Quick Start
1. Install Android SDK and Java 8+
2. Set ANDROID_HOME environment variable
3. Run: `./gradlew assembleDebug`

## Testing the Rebuild
To verify the reverse engineering was successful:

```bash
cd android_project
chmod +x gradlew  # Make gradlew executable
./gradlew clean    # Clean previous builds
./gradlew assembleDebug  # Build debug APK
```

The built APK will be located at:
`android_project/app/build/outputs/apk/debug/app-debug.apk`

## Modifying the App
Since this is a Flutter app, the main logic is in the compiled Flutter engine. To make significant changes:

1. **For UI/Layout changes**: Modify resources in `app/src/main/res/`
2. **For permissions/manifest**: Edit `AndroidManifest.xml`
3. **For native Android code**: Modify `MainActivity.kt`
4. **For Flutter functionality**: Requires rebuilding with Flutter SDK

## Known Limitations
- Flutter Dart code is compiled to native code and not directly recoverable
- Some resources might need adjustment for different build environments
- Signing keys will need to be regenerated for production builds

## Troubleshooting
- If build fails, check Android SDK installation
- Ensure JAVA_HOME points to JDK 8 or higher
- Update Gradle version if compatibility issues arise