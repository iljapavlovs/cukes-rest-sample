cukes-rest-sample
=======================

Example project using [cukes-rest](https://github.com/ctco/cukes-rest) tool. Project supports parallel exexcution using:
 * One "Runner" class per thread (use profile `parallel`)
 * Using [cucumber-jvm-parallel-plugin](https://github.com/temyers/cucumber-jvm-parallel-plugin) (use profile `parallelPlugin`)


### Command for execution
```
mvn clean verify -P [singleThreaded,parallel,parallelPlugin]
```

* Thread count can be set via `-Dthreads` argument


