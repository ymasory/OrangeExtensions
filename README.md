# OrangeExtensions #
## A pluggable jar for the Apple Java Extensions, updated for Java 5 & 6##

Please see the [project homepage](http://yuvimasory.com/software/orange-extensions/) for more information.

## Build ##
[Note: Although I'm using sbt for compilation and deployment, this project does not use or depend on Scala in any way.]

Install [sbt](https://github.com/harrah/xsbt/wiki/Getting-Started-Setup) 0.12.0.

```sh
$ cd OrangeExtensions
$ sbt
> package
```

Your jar is in `target/scala-2.9.2/orange-extensions_2.9.2-1.0.0.jar`. Drop it into your project's classpath.
