<h1 align="center">
CustomColor ✨
</h1>
<p align="center">
Custom Color for text
</p>

<h2>
Setup ⚙️
</h2>


Add it in your root `build.gradle` at the end of repositories:

```groovy
allprojects {
    repositories {
        //...omitted for brevity
        maven { url 'https://jitpack.io' }
    }
}
```

Add the dependency

```groovy
dependencies {
     implementation 'com.github.Arsh069.CustomColor-Android:final:0.1.3'
}
```

## Usage 📱
Sample implementation [here](app/) 
-
#### Changing text color
```kotlin
   CustomColor.ColorName("text", Start Index, End Index, Text id)
```
In the above sample you have to add a String text, start index and end index for giving range  of text you want to be colored and the id of textview where you want to set it. 




