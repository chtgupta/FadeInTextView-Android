# Fade-InTextView
> Not just another typewriter library.

![Release](https://jitpack.io/v/ChahatGupta/FadeInTextView-Android.svg)

Say hi to Fade-In TextView! A custom TextView library which makes every character appear with a smooth alpha animation.

The Fade-In TextView library inherits its properties directly from the native TextView class, which means that all the native TextView methods are supported.
There are practically no limitations including multiline support. The library also has some of its own methods and attributes which offer full control over the View.

<img height="450" src='screencast/Fade-In TextView.gif'/>

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
	        implementation 'com.github.ChahatGupta:FadeInTextView-Android:1.0'
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
  believe.cht.fadeintextview.TextView textView textView = (believe.cht.fadeintextview.TextView) findViewById(R.id.textView);
  
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
