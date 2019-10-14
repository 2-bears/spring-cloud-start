###environment configuration: ###
in win7, config HOSTS file:  
127.0.0.1 localhost1  
127.0.0.1 localhost2  
127.0.0.1 localhost3  
simulate three nodes of the register server and provider server.  

###description of the modules:###
**spring-cloud-start:** parent project of maven  
**eureka-register-server:** maven module, a server include Eureka server as register center.   
**service-provider:** maven module, a server include Eureka client as provider services.  
**client-consumer:** maven module, simulate client using Feign, which connect to the register center to find provide service.Feign integrates Hystrix, it can implement fallback easy.  
spring cloud encapsulate the service well,  all we need to do is to implement our bussiness requirement.  

###test steps:###
- 1 **start register server:**  
   a. write 3 application.yml with suffix "-devserverN" (N=1,2,3), which configure different ports.  
   b. compile the service into jar packs.  
   c. start the server as follows:  
```
java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver1
java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver2
java -jar eureka-register-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=devserver3   
```
	 d. we can visit the register server in the browser using http://127.0.0.1:port.

- 2 **start provider service：**   
    similar as the register server, wirite 3 application.yml with different ports, then compile the service, start the  server, at last visit the service in the browser.
![register-server](https://raw.githubusercontent.com/2-bears/spring-cloud-start/master/screenshot/screenshot_register-server.png)

- 3 **start the client server:**  
    start the client server, and visit http://127.0.0.1:port/hello?name=guest, we can see the right response.  
    when we stop the register server or provider service to see what will happen, we find that the client will have a right response unless all of the register server and provider service are closed, at that case it will response the fallback response. 
![register-server](https://raw.githubusercontent.com/2-bears/spring-cloud-start/master/screenshot/screenshot_client.png)
