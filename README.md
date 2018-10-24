# Fade-In TextView

![Release](https://jitpack.io/v/ChahatGupta/FadeInTextView-Android.svg)

<img src="Logotype primary.png" width="80%" height="80%" />

Say hi to Fade-In TextView! A custom TextView library which makes every character appear with a smooth alpha animation.

The Fade-In TextView library inherits its properties directly from the native TextView class, which means that all the native TextView methods are supported.
There are practically no limitations including multiline support. The library also has some of its own methods and attributes which offer full control over the View.

<img src='Fade-In TextView.gif'/>

## Installation

### Gradle

Step 1. Add the JitPack repository to your build file

```sh
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. Add the dependency

```sh
	dependencies {
	        implementation ('com.github.chtgupta:FadeInTextView-Android:2.1.0') {
          	     exclude module: 'app'
    		}
	}
```

### Maven

Step 1. Add the JitPack repository to your build file

```sh
	  <repositories>
          	<repository>
          		<id>jitpack.io</id>
	  		<url>https://jitpack.io</url>
	  	</repository>
	  </repositories>
```

Step 2. Add the dependency

```sh
	<dependency>
	    <groupId>com.github.chtgupta</groupId>
	    <artifactId>FadeInTextView-Android</artifactId>
	    <version>2.1.0</version>
	</dependency>
```

## Usage

### In the XML layout

```sh
	<believe.cht.fadeintextview.TextView
            android:id="@+id/textView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:textSize="30sp"
            android:textColor="@android:color/black"
		
            app:letterDuration="250"/>
```

### In the Java class

```sh
  believe.cht.fadeintextview.TextView textView = findViewById(R.id.textView);
  
  // setting a listener for tracking events (optional)
  textView.setListener(new TextViewListener() {
            @Override
            public void onTextStart() {
                Toast.makeText(getBaseContext(), "onTextStart() fired!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onTextFinish() {
                Toast.makeText(getBaseContext(), "onTextFinish() fired!", Toast.LENGTH_SHORT).show();
            }
        });
  
  textView.setLetterDuration(250); // sets letter duration programmatically
  textView.setText(); // sets the text with animation (Read "KNOWN BUGS" if it doesn't give desired results)
  textView.isAnimating(); // returns current boolean animation state (optional)
  
```

## Release History

* 2.1.0
	* Added TextViewListener
	* Created methods to implement TextViewListener in TextView
	* Implemented new additions in the demo app
	* Added new logo by @mansya to the demo app
* 1.1
	* Added preview text in demo app
* 1.0
	* Initial release
 
## Known Bugs

* The default android:text attribute to set the initial text doesn't seem to work, will be fixed in coming versions.
* If setText() doesn't give desired results, consider calling it from a method and not directly from onCreate().
* Facing issues cloning/running the project? See [this](https://stackoverflow.com/questions/34353220/android-studio-please-select-android-sdk). (Not really a bug, I guess)

## Meta

Chahat Gupta – [@chtgupta](https://chtgupta.github.io) – admin@speakapp.me

Distributed under the MIT license. See ``LICENSE`` for more information.

[https://github.com/chtgupta/FadeInTextView-Android/](https://github.com/chtgupta/FadeInTextView-Android/)

## Contributing

1. **Fork** it
2. **Clone** the project to your own machine
3. **Commit** changes to your own branch
4. **Push** your work back up to your fork
5. Submit a **Pull request** so that I can review changes

## Support

* Liked my work? **Star** it to show support!
* Used it in your app? Let me know and I'll include your app name, logo and link in this repository.
* Want to take this to another level? Read ``CONTRIBUTING`` again!

## License

```sh
MIT License

Copyright (c) 2018 Chahat Gupta

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
```
