# service-registry and discovery client Eureka server

Service Registration
When you have multiple processes working together they need to find each other. If you have ever used Java’s RMI mechanism you may recall that it relied on a central registry so that RMI processes could find each other. Microservices has the same requirement.

The developers at Netflix had this problem when building their systems and created a registration server called Eureka (“I have found it” in Greek). Fortunately for us, they made their discovery server open-source and Spring has incorporated into Spring Cloud, making it even easier to run up a Eureka server. 


 Service Discovery

Acts as a guide to Microservices to find the route of communication between them as it maintains a list of services on which nodes are located.


Steps:

1. Import the client selector service application in IntelliJ
2. Make sure Zull proxy is running 
3. Zull proxy running on 9090
4. Spring Service is running on the 8090 port
5. Import postman collection in postman.
6. All APIs are feeded in the file.
7. Just run and show.
