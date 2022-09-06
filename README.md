
## spring-webflux-reactive-with-mongo

> This is a sample application that shows how to build a web application using
- Spring Boot 2
- Spring Webflux
- Spring Reactive Data MongoDB
- Spring Security Reactive Webflux

<br/>

### Running

* In application.properties, configure appropriate values.
<br/>
<br/>
Run this using using the gradle wrapper included

```
./mvn run
```

And then go to http://localhost:8080 to test the APIs.


## cURL Commands

You can try the following API's once the server is running.

>GET __/person__

```
 curl http://localhost:8080/person -v -u tom:password
```
> GET __/person/{id}__
```
 curl http://localhost:8080/person/{id} -v -u tom:password
 ```
> POST __/person__
```
 curl -X POST -d '{"name":"skt deepu","age":20}' -H "Content-Type: application/json" http://localhost:8080/person -v -u skt:password
 ```