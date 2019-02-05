# ProgressButton

[![](https://jitpack.io/v/EldritchSoft/ProgressButton.svg)](https://jitpack.io/#EldritchSoft/ProgressButton)

Android Library for easy ProgressBar and Button integration.

# Download

Add this in your project's build.gradle:
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

And import the library like this:
```
dependencies {
    implementation 'com.github.EldritchSoft:ProgressButton:1.0.0'
}
```

# Usage

In your layout xml, add the view.
```
<com.eldritchsoft.progressbutton.ProgressButton
    android:id="@+id/progressButton"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

And then you can call it from your Java file.
```
ProgressButton progressButton = findViewById(R.id.progressButton);
```

# Attributes

Java
```
progressButton.startProgress(); // Shows progress bar
progressButton.stopProgress(); // Hides progress bar
progressButton.isInProgress(); // Returns a boolean. True if progress is showing, false if progress is hiding.
progressButton.setText(progressButton, String text);
progressButton.setTextColor(ProgressButton progressButton, int color);
progressButton.setTextColor(ProgressButton progressButton, ColorStateList colorStateList);
```

XML (with default values)
```
<com.eldritchsoft.progressbutton.ProgressButton
    ...
    app:text="" <!-- Button text -->
    app:textColor="colorAccent" <!-- Button text color. -->
    app:progress="false"/> <!-- Boolean for showing the progress bar. -->
```

# License

MIT License

Copyright (c) 2019 EldritchSoft

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
