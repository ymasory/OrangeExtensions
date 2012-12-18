# OrangeExtensions #

[![Build Status](http://ci.yuvimasory.com/job/OrangeExtensions/badge/icon)](http://ci.yuvimasory.com/job/OrangeExtensions/)

## A pluggable jar for the Apple Java Extensions, updated for Java 5 &  6##

Please see the [project homepage](http://ymasory.github.com/OrangeExtensions/) for more information.

## Build ##
[Note: Although I'm using sbt for compilation and deployment, this project does not use or depend on Scala in any way.]

Install [sbt](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup) 0.12.0.

```sh
$ cd OrangeExtensions
$ sbt
> package
```

Your jar is in `target/orange-extensions-x.x.x.jar`, where `x.x.x` is the version number.

## Install ##

### Automatically ###
OrangeExtensions is hosted on [Maven Central](http://central.maven.org/maven2/com/yuvimasory/orange-extensions/).
Add this to your pom.xml:

```xml
<dependency>
  <groupId>com.yuvimasory</groupId>
  <artifactId>orange-extensions</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Manually ###
Build the jar with the instructions above, then drop the resulting jar in your classpath.
