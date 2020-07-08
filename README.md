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

### In Xml
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center">

    <jaeyoung.kim.certaincolortextview.CertainColorTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hi I'am JY-Kim"
        app:certainText="JY-Kim"
        app:certainTextColor="#ff0000"/>

</LinearLayout>
```

#### To set the specific word you choose 
```xml
app:certainText="JY-Kim"
```

#### To set the specific word Color
```xml
app:certainTextColor="#ff0000"
```

### In Code

#### To set the specific word you choose 
```
certain_text.setCertainTv("Hi I'am JY-Kim")
```

#### To set the specific word Color
```
certain_text.setCertainColor("#ff0000")
```

##In application
![](https://github.com/JY-Dev/CertainColorTextView/blob/master/sampleImg.jpg)
