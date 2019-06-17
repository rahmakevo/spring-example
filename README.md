# Spring Boot - Example

Spring Boot example is a sample java microservice that is a RESTFUL Web Service. The web api has several endpoints. It is accessible and has been hosted on Cloud.

## Getting Started
```
Download Postman
We have several endpoints i.e
(i).   register
       This is not a secure endpoint
       Requires a json Body with params : username(String) and password(String)
(ii).  login
       This is not a secure endpoint
       Requires a json Body with params : username(String) and password(String)
       On successful authentication one will receive an access token
(iii). save
       This is a secure endpoint
       Requires a Header as "Authorization": "Bearer+" "+access token;
       Requires a json Body with paramas : title(String), description(String), rating(int) and watched(Boolean)
(iv).  all
       This is not a secure endpoint
       Returns all the movie descriptions saved
(v).   delete
       This is a secure endpoint
       Requires a Header as "Authorization": "Bearer+" "+access token;
       Requires a json Body with paramas : title(String)
(vi).  actuator/health
       This is a secure endpoint
       Requires a Header as "Authorization": "Bearer+" "+access token;
       No param is required for this endpoint
```
       
## Prerequisites

Requirements for the project

```
Java jdk
Maven
SpringBoot
```

## Author

* **Wafula Kevin Siundu**

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
