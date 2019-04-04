### SpringBoot-Microservices-Workshop
This repository contains working sets of spring cloud samples with spring cloud dependencies of Dalston version

### Projects :

<table>
 <tr>
    <th style="text-align:left">Name</th>
    <th style="text-align:left">Port</th> 
    <th style="text-align:left">Description</th>
  </tr>
  <tr>
    <td><a href="https://github.com/BarathArivazhagan/springboot-microservices-workshop/tree/master/eureka-server"> eureka-server</a></td>
    <td>9001</td>
    <td>Eureka service registration server </td>
  </tr>
  <tr>
    <td><a href="https://github.com/BarathArivazhagan/springboot-microservices-workshop/tree/master/user-service">eureka-client-app1</a></td>
    <td>9000</td>
    <td>Eureka service discovery client registered with eureka-server</td>
  </tr>
  <tr>
    <td><a href="https://github.com/BarathArivazhagan/springboot-microservices-workshop/tree/master/fork-join-demo">eureka-client-app2</a></td>
    <td>4200</td>
    <td>Eureka service discovery client registered with eureka-server</td>
  </tr>
  <tr>
    <td><a href="https://github.com/BarathArivazhagan/springboot-microservices-workshop/tree/master/api-gateway">zuul-proxy</a></td>
    <td>9500</td>
    <td>Zuul reverse proxy server acting as reverse proxy pass to other microservices</td>
  </tr>

  <tr>
    <td><a href="https://github.com/BarathArivazhagan/springboot-microservices-workshop/tree/master/api-gateway">config-server</a></td>
    <td>9500</td>
    <td>Configuration server acting as a hub for centralized configuration</td>
  </tr>
  


## Compatability Matrix

choose the branch based on below maintained versions.

<table>
 <tr>
    <th style="text-align:left">Branch/Version</th>
    <th style="text-align:left">Spring Boot</th>
    <th style="text-align:left">Spring Cloud</th>
  </tr>
  <tr>
    <td>master</td>
    <td>1.5.10.RELEASE</td>
    <td>Dalston.RELEASE</td>
  </tr>
  <tr>
    <td>1.0.x</td>
    <td>1.5.10.RELEASE</td>
    <td>Dalston.RELEASE</td>
  </tr>
  <tr>
    <td>1.1.x</td>
    <td>1.5.12.RELEASE</td>
    <td>Edgware.RELEASE</td>
  </tr>
  <tr>
    <td>2.0.x</td>
    <td>1.5.12.RELEASE</td>
    <td>Finchley.RELEASE</td>
  </tr>
  <tr>
    <td>2.1.x</td>
    <td>2.1.13.RELEASE</td>
    <td>Greenwich.RELEASE</td>
  </tr> 
  
</table>

### Spring Boot Version :

```
<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>1.5.10.RELEASE</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
  
  ```

### How to run the project ? 

Download all the projects. 

- <b>eureka-server</b> : start the eureka server at port 8080
- <b>eureka-client-app1</b> : start the eureka client app1 listening at port 8081
- <b>eureka-client-app2</b> : start the eureka client app2 listening at port 8082

#### Test the clients registration by going to eureka :
 
 http://localhost:8080/ 
 
  <b>Test the clients </b> : 
 
 <b>Client 1</b>: http://localhost:8081/ 
 
 <b>Client 2</b>: http://localhost:8082/ 
 
  <b>Test the clients through zuul proxy </b>: 
 
 Client 1: http://localhost:8085/app1/ --> routed to --> http://localhost:8081/
 
 Client 2: http://localhost:8085/app2/ --> routed to -->  http://localhost:8082/ 
 
 
