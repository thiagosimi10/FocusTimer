# Add project specific ProGuard rules here.
# By default, the build uses the ProGuard configuration from
# the Android Gradle plugin. For more details, see
# http://developer.android.com/guide/developing/tools/proguard.html

# Keep the Room generated classes
-keep class androidx.room.RoomMasterTable { *; }

# Keep annotations
-keepattributes *Annotation*