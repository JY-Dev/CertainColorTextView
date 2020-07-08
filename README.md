# CertainColorTextView
Certain Word Change Color TextView CustomView.

### Library Version

Version v1.0.1

### minSdkVersion

minSdkVersion 21

### Edit Gradle

Edit `YourProject/build.gradle` like below.

#### JitPack
```gradle
allprojects {
    repositories {
        google()
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

Edit `app/build.gradle` like below.

```gradle
   implementation 'com.github.JY-Dev:CertainColorTextView:v1.0.1' 
```

## How To Use

##In Xml
```xml
<jaeyoung.kim.certaincolortextview.CertainColorTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hi I'am JY-Kim"
        app:certainText="JY-Kim"
        app:certainTextColor="#ff0000"/>
```
