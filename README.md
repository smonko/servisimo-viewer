[![Codacy Badge](https://app.codacy.com/project/badge/Grade/36ef77436d7841659c1637ababff1aac)](https://app.codacy.com/gh/smonko/servisimo-viewer/dashboard?utm_source=gh&utm_medium=referral&utm_content=&utm_campaign=Badge_grade)  

# Spring Boot Demo application  

## servisimo-viewer (Backend + API)

Simple Java demo app to simulate backend and API.  
Main functionality is to get tickets from DB and provide parametrized search

Front end is available at https://github.com/smonko/servisimo-frontend
Write backend is available at https://github.com/smonko/servisimo-putter
Catalog backend is available at https://github.com/smonko/servisimo-catalog

### Build with:
- SpringBoot 3.0.6
- Java JDK 17
- MySql
- H2


### How to use

Build with maven
```
$ mvn clean install -U 
```

Run
```
java -jar servisimo-viewer-0.0.1-SNAPSHOT.jar
```

Run with config
```
java -jar servisimo-viewer-0.0.1-SNAPSHOT.jar --spring.config.location=../config/application.yml
```

### Feature flags
Configuration options to simulate featurea flags and toogle some functionality

```
features:
  canaryflag: true
  expandedsearch: true
```

**canaryflag** - no real function. Just to demonstrate canary deployment. Check */feature-flags*  
**expandedsearch** - activate api for parametrized search
 

### API Endpoints
Show feature flags
```
@RequestMapping(path = "/feature-flags", produces="application/json")
```

Show all tickets
```
@RequestMapping("/tickets")
```

**expandedsearch** set to ***true***
Show tickets with specific parameter
```
    @RequestMapping("/ticketbyid/{id}")

    @RequestMapping("/ticketbyassignee/{assignee}")
 
    @RequestMapping("/ticketbyseverity/{severity}")

    @RequestMapping("ticketbyitem/{item}")

    @RequestMapping("ticketbystatus/{status}")
```

### Service Discovery
By default application will register to consul agent. To disable this function modify application.yml:
```
spring:
  ...
  cloud:
    consul:
      enabled: false
      ...
      discovery:
        enebled: false
        ...
```


### Copyrights
(C) Stefan Monko (stefan@stefanmonko.sk / monkos@posam.sk)