## School Dashboard Demo Project
### Spring Boot + MySQL + Junit 5 + CircleCI & Swagger UI Integration

School Dashboard is demo project which explain spring boot framework basic setup along with Swagger UI 
and Circle CI integratopm where we can execute Junit test cases to verify build quality. 

### Overview:

### Project Layers:

| Layers | Available | Technology |
| ------ | ------ | ------ |
| Client side layer | Yes | Javascript & Bootstrap |
| Server Web layer | Yes | Spring Boot |
| Service layer | Yes | Core Java & Spring |
| Database layer | Yes | MySQL |

### Technology Stack :

| Technology | Version |
| ------- | ------- |
| Core Java | Adopt Open JDK 8 |
| Bootstrap | 3.0 |
| Spring Boot | 2.3.0.RELEASE|
| JUnit | 5.0 |
| MySQL | 5.7.30 |

### Tools :

| Tool | Version |
| ------- | ------- |
| Maven | Apache Maven 3.5.0 |
| Editor  | Spring Tool Suite 4 |
| CI Env | Circle CI |

### Project Description:

- Dashboard
  - Showing school location
  - Latest news of current academic year
  - Current academic year statistics for students staffs etcs
  - Todays administrative schedule with timeline.
- Notice List
  - Display all notices
  - Drill-down functionality from notice list to check notice details
- Gallery
  - School function gallery
  - Anual function gallery
  - Festival gallery
- New Notice high-ligher

### Architecture Overview:

  ![Overview](images/school-dashboard-blockdiagram.png)

### Tool configuration:
 - Edit **_application.properties**_ file
```markdown
#spring mvc configutation
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp

#spring database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/school-dashboard
spring.datasource.username=school-dashboard
spring.datasource.password=school-dashboard
spring.datasource.tomcat.max-wait=20000
spring.datasource.tomcat.max-active=50
spring.datasource.tomcat.max-idle=20
spring.datasource.tomcat.min-idle=15 

#server port
server.port=8080

#application context path
server.servlet.context-path=/school-dashboard

#spring related configuration
spring.application.name=school-dashboard
```
 - Database table creation script - ${project.home}\src\main\resources\create-table.sql
 
 - Sample data population script - ${project.home}\src\main\resources\populate-sample-data
 

### Important Links:

| Description | Link |
| -------- | -------- |
| Source Code | <span style="color: green;font-weight: bold;"><a href="https://github.com/ravaan-techky/school-dashboard/archive/master.zip"><i class="fa fa-download"></i></a></span> |
| Circle CI <If Available> | Not Available |
| Documentation | <span style="color: green;font-weight: bold;"><a href="https://ravaan-techky.github.io/school-dashboard/"><i class="fa fa-folder-open"></i></a></span> |
  
### Application Gallery:

| Page | Link |
| -------- | -------- |
| School Dashboard Page | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |
| Notice List Page | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |
| Notice Details Page | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |
| School Gallery Page | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |
| About Us | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |
| Feedback Page | <span style="color: green;font-weight: bold;"><a href="images/dashboard.jpg"><i class="fa fa-picture-o"></i></a></span> |

### Developer Information:

| Description | Github Profile Link  | LinkedIn Profile Link | Email Address
| -------- | -------- | -------- | -------- |
| Vaishali Patil | [<i class="fa fa-external-link"></i>](https://github.com/ravaan-techky/) | [<i class="fa fa-external-link"></i>](https://www.linkedin.com/in/vaishali-patil-4a6679143/) | [ravaan.techky@gmail.com](mailto:ravaan.techky@gmail.com) |

<br/><br/>
[<i class="fa fa-arrow-left"></i> **Back**](/documentation/)
