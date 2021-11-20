# HelloWorldSpringBoot

Maven application "HelloWorldSpringBoot" is intended to show in browser
simple greeting using hello() method

## framework for WEB
Spring boot, version 2.5.1

#Docker
1) build image:
   docker build -t spring-boot/my-hello-world .

2) run image:
docker run -p 8080:8080 spring-boot/my-hello-world

3) run app:
   http://localhost:8080/hello - > Hello Mike!
   http://localhost:8080/hello&name=Bob -> Hello Bob!
