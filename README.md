# GrayscaleUnicodeArt

## Video
[![Screenshot](https://raw.githubusercontent.com/JonathanRitchey03/GrayscaleUnicodeArt/master/UnicodeMovie.gif)](Video)

## Executing the jar file
1. Make sure the java SDK is installead and the java command is in your classpath.
1. In the project root directory type (make sure to capitalize the U and M). *Note: to stop press Control-C.*

```
java -jar UnicodeMovie.jar
```

## Handout
An instructional handout for the project suitable for workshops and teaching is at:

[https://github.com/JonathanRitchey03/GrayscaleUnicodeArt/raw/master/Handout.pdf](https://github.com/JonathanRitchey03/GrayscaleUnicodeArt/raw/master/Handout.pdf)

## Applications
1. This repo contains java code to support a grayscale canvas using unicode characters. It implements a scrolling animation using automata with an averaging method applied to each one, based on the neighbors above, which creates a smooth scrolling effect.
1. I think this project would be a great workshop for highschool kids and the handout has been created to be language independent(although the solution in this repo are in java).
1. Please feel free to fork the project for your projects as an instructor.
1. Also included is a demo jar file, which can be run without having to rebuild the project.

## Background
This repo accompanies the meetup event held on October 17, 2015:

http://www.meetup.com/Weekly-Tech-Interview-Study-Group/events/226064982/

The meetup received 4.5 out 5 stars and was a huge hit.

## Contents
- IntelliJ project with a grayscale unicode animation.
- Instructional handout in PDF and ODT format, with step by step problems and suggestions.
- JAR file.
- GIF capture(using gif brewery).

## Grayscale reference string
Use this string to map from 0 to N values (see attached handout):
```
"█▉▊▋▓▩▦▤▧▨◉▣◈▒░$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\|()1{}[]?-_+~<>i!lI;:,"^`'. "
```
