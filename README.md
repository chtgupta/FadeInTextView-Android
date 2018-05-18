# Fade-InTextView

![Release](https://jitpack.io/v/ChahatGupta/FadeInTextView-Android.svg)

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
	        implementation ('com.github.ChahatGupta:FadeInTextView-Android:1.0') {
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
	    <groupId>com.github.ChahatGupta</groupId>
	    <artifactId>FadeInTextView-Android</artifactId>
	    <version>1.0</version>
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
  believe.cht.fadeintextview.TextView textView = (believe.cht.fadeintextview.TextView) findViewById(R.id.textView);
  
  textView.setLetterDuration(250); // sets letter duration programmatically
  textView.isAnimating(); // returns current animation state (boolean)
  textView.setText(); // sets the text with animation
```

## Release History

* 1.0
    * Initial release
    
## Known Bugs

* the default android:text attribute to set the initial text doesn't seem to work, will be fixed in coming versions.

## Meta

Your Name – [@i_m_cht](https://twitter.com/i_m_cht) – admin@believe-labs.co

Distributed under the MIT license. See ``LICENSE`` for more information.

[https://github.com/yourname/github-link](https://github.com/dbader/)

## Contributing

1. **Fork** it (<https://github.com/ChahatGupta/FadeInTextView-Android/fork>)
2. **Clone** the project to your own machine
3. **Commit** changes to your own branch
4. **Push** your work back up to your fork
5. Submit a **Pull request** so that I can review changes

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
