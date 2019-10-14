环境： windows7
配置HOST:
127.0.0.1 localhost1
127.0.0.1 localhost2
127.0.0.1 localhost3

1. 启动注册中心
   将服务打成jar包。分别执行三个server：
   java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver1
   java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver2
   java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver3

2. 增加eureka服务提供模块