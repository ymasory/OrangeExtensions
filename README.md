# OrangeExtensions #
## A pluggable jar for the Apple Java Extensions, updated for Java 5 & 6##

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

