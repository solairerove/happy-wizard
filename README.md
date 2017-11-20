# spring-boot-k8s-hello-world
Spring Boot k8s Hello World starter template

### Kubernetes

[k8s doc](https://github.com/solairerove/spring-boot-k8s-hello-world/blob/master/k8s/doc/k8s.adoc)

### Env Prerequisites:
``` bash
✗ java -version
java version "1.8.0_152"
Java(TM) SE Runtime Environment (build 1.8.0_152-b16)
Java HotSpot(TM) 64-Bit Server VM (build 25.152-b16, mixed mode)

✗ kotlin -version
Kotlin version 1.1.60 (JRE 1.8.0_152-b16)

✗ gradle -v
  
------------------------------------------------------------
Gradle 4.0.1
------------------------------------------------------------
  
Build time:   2017-07-07 14:02:41 UTC
Revision:     38e5dc0f772daecca1d2681885d3d85414eb6826
  
Groovy:       2.4.11
Ant:          Apache Ant(TM) version 1.9.6 compiled on June 29 2015
JVM:          1.8.0_152 (Oracle Corporation 25.152-b16)
OS:           Mac OS X 10.13.1 x86_64

✗ docker -v
Docker version 17.09.0-ce, build afdb6d4

✗ docker-compose -v
docker-compose version 1.16.1, build 6d1ac21
```

### How to start:

* `./gradlew bootRun`
* `./gradlew clean build && java -jar build/libs/*.jar`

or

* `kubectl apply -f ./k8s/greeting`

### How on container:

* `./gradlew clean build`
* `docker-compose build`
* `docker-compose up`
