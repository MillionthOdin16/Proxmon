# ProxMon App Analysis - Reverse Engineering Results

## Application Overview
**ProxMon** is a comprehensive Proxmox Virtual Environment (PVE) monitoring and management application for Android devices.

## Key Features Discovered Through Reverse Engineering

### Core Functionality
- **Proxmox Server Management**: Add, edit, and manage multiple Proxmox servers
- **Virtual Machine Control**: Start, stop, restart, pause, resume, hibernate VMs
- **Container Management**: Full container lifecycle management
- **Resource Monitoring**: CPU, RAM, disk usage, network traffic monitoring
- **Task Management**: View and manage running tasks
- **Backup Management**: Take and restore backups and snapshots
- **Authentication**: Support for username/password and 2FA/OTP

### Internationalization
Support for 11 languages:
- English (en)
- German (de)
- Spanish (es) 
- French (fr)
- Italian (it)
- Dutch (nl)
- Polish (pl)
- Portuguese (pt)
- Russian (ru)
- Chinese Simplified (zh)
- Chinese Traditional (zh_Hant)

### Technical Architecture
- **Framework**: Flutter with native Android components
- **UI**: Material Design with custom Product Sans font family
- **Web Components**: In-app browser for Proxmox web interface
- **Storage**: Encrypted credential storage with keystore
- **Networking**: HTTPS with support for self-signed certificates

### Permissions & Security
- `INTERNET`: Required for server communication
- `FOREGROUND_SERVICE`: Background monitoring capabilities
- Cleartext traffic support for development/testing
- Certificate validation with self-signed certificate support

### Visual Design
- **Fonts**: Product Sans family (Regular, Bold, Italic, Bold Italic)
- **Icons**: Material Design Icons + custom icon set
- **Themes**: Light and dark theme support
- **Adaptive**: Responsive design for different screen sizes

### Resource Management Features
- **Power Management**: WoL (Wake-on-LAN), shutdown, restart operations
- **Storage Management**: Multiple storage types (LVM, ZFS, Directory, Ceph)
- **Network Management**: Bridge configuration, static/DHCP setup
- **Monitoring**: Real-time graphs and statistics
- **ACME/SSL**: Certificate management and renewal

### Data Management
- **Backups**: Scheduled backups with compression options (LZO, Gzip, Zstd)
- **Snapshots**: VM/CT snapshots with RAM inclusion options
- **Templates**: Container and VM template management
- **ISO Management**: Upload and manage installation media

### User Management
- **Authentication**: Multi-user support with role-based access
- **API Tokens**: Token-based authentication
- **Privilege Separation**: Fine-grained permission control
- **Domains**: Multiple authentication domain support

## Reverse Engineering Success Metrics
✅ **AndroidManifest.xml**: Complete recovery with all permissions and activities
✅ **Resources**: All layouts, strings, drawables, and styles recovered
✅ **Assets**: Flutter assets including fonts and translations fully extracted
✅ **Build System**: Gradle build files created for Android compilation
✅ **Project Structure**: Complete Android project ready for modification
✅ **Flutter Framework**: Basic Flutter app structure created with localization

## Limitations & Considerations
- **Dart Source Code**: Flutter Dart code compiled to native - not directly recoverable
- **Business Logic**: Core app logic must be reverse-engineered from UI/translations
- **API Communication**: Proxmox API integration needs to be reimplemented
- **Authentication Flow**: 2FA and OAuth flows need reconstruction
- **State Management**: App state and data persistence patterns unknown

## Development Readiness
The reverse-engineered project is now ready for:
1. **Modification**: Resources and manifest can be modified
2. **Rebuilding**: Android APK can be compiled from source
3. **Feature Addition**: New functionality can be added to existing structure
4. **UI Customization**: Layouts, themes, and styling can be customized
5. **Localization**: Additional languages can be added using existing patterns

## Next Development Steps
1. Set up Flutter development environment
2. Implement Proxmox API client based on discovered functionality
3. Recreate UI components using recovered resources as reference
4. Implement authentication and server management features
5. Add monitoring and control capabilities
6. Test with actual Proxmox servers

## Security Notes
- Review cleartext traffic settings for production use
- Implement proper certificate validation
- Secure credential storage implementation needed
- API token management security review required