# Library Gateway
Spring Cloud gateway that routes the **sf-rest-library** microservices.

### Services
<table>
    <tr>
        <th style="text-align:left">Name</th>
        <th style="text-align:left">Port</th> 
        <th style="text-align:left">Description</th>
    </tr>
    <tr>
        <td><a href="https://github.com/Gustavo-de-Paula/sf-rest-library-gateway">sf-rest-library-gateway</a></td>
        <td>8080</td>
        <td>Spring Cloud gateway router</td>
    </tr>
    <tr>
        <td><a href="https://github.com/Gustavo-de-Paula/sf-rest-library">sf-rest-library</a></td>
        <td>8085</td>
        <td>Library management service</td>
    </tr>
</table>

### Technologies

- Java
- Spring Boot
- Spring Cloud
- Spring Security
- Maven
- Docker

### Build and Run

 ```
   $ git clone 
   $ cd sf-rest-library-gateway
   $ ./mvnw clean install
   $ docker-compose up
 ```

## References
* [spriing-cloud](http://projects.spring.io/spring-cloud/)
* [spring-cloud-gateway](https://cloud.spring.io/spring-cloud-gateway/)