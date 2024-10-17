# **Bug Tracker**
This project is a Bug Tracking System backend built using Spring Boot and Java. It manages bug tracking for software development projects, allowing users to create, update, and track the progress of bugs. The data is persisted in a MySQL database.



# **Features**
* **User Authentication and Authorization**: Secure user registration and login using Spring Security.
* **Role-Based Access Control**: Admin and developer roles with different privileges.
* **CRUD Operations**: Create, Read, Update, and Delete operations for bugs, projects, and users.
* **Bug Assignment**: Bugs can be assigned to developers and tracked by status.
* **Project Management**: Manage different projects and associate bugs with projects.
* **RESTful APIs**: Exposes APIs to handle bug-related requests.
* **Database**: Data persistence using MySQL database.



### **Technologies Used**
1. **Spring Boot**: Framework for building Java applications.
2. **Spring Security**: For handling authentication and authorization.
3. **MySQL**: Relational database for storing data.
4. **Hibernate**: ORM framework for mapping Java objects to database tables.
5. **Java**: Core language used for backend development.
6. **Maven**: Dependency management and build tool.
7. **Postman**: For API testing and development.



### **Setup and Installation**
##### Prerequisites
1. Java 11 or higher
2. MySQL database installed
3. Maven for managing dependencies
4. An IDE like IntelliJ IDEA or Eclipse



### **Steps to Run the Project**
1. Clone the repository:

```
git clone https://github.com/stephenombuya/bugtracker
```

2. Navigate to the project directory:

```
cd bugtracker
```

3. **Create a MySQL Database**: Log into MySQL and create a new database.

```
CREATE DATABASE bugtracker;
```

4. **Configure Database Connection**: Update your database credentials in the src/main/resources/application.properties file:

```
spring.datasource.url=jdbc:mysql://localhost:3306/bugtracker
spring.datasource.username=your-username
spring.datasource.password=your-password
```
5. **Install Dependencies**: Use Maven to install all necessary dependencies:

```
mvn clean install
```

6. **Run the Application**: Start the application using the following Maven command:

```
mvn spring-boot:run
```

Alternatively, run the BugTrackerApplication.java file directly from your IDE.

7. **Test the Application**: Use Postman or curl to test the API endpoints. For example, to create a new bug, send a POST request to /api/bugController.



### **Folder Structure**

```
bug-tracker-backend/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.example.bugtracker/
│   │   │       ├── controller/   # API Controllers
│   │   │       ├── model/        # Entity Models
│   │   │       ├── repository/   # Spring Data Repositories
│   │   │       └── service/      # Service layer for business logic
│   │   ├── resources/
│   │       └── application.properties  # Application configuration
│   └── test/                         # Test cases for the application
│
├── pom.xml        # Maven dependencies
└── README.md      # Project documentation
```



### **Database Structure**
The MySQL database contains the following tables:

1. **Users**: Stores user data (username, password, role).
2. **Projects**: Stores project details.
3. **Bugs**: Stores bug reports, including bug description, status, priority, and associated project and developer.
4. **Roles**: Defines roles for access control (e.g., admin, developer).



### **Security**
This project uses Spring Security for authentication and authorization:

- JWT Tokens are used for secure API authentication.
- Role-based access control ensures that certain actions (e.g., creating projects or assigning bugs) are restricted to authorized users (e.g., admins).



### **Future Enhancements**
1. **Email Notifications**: Notify users via email when a bug is assigned or updated.
2. **Bug History**: Track changes to bug status and assignments over time.
3. **User Management**: Provide a UI to manage users and roles.
4. **Front-End Integration**: Build a React or Angular front-end to consume the backend APIs.



### **Contributing**
Contributions are welcome! If you have ideas for improvements or new features, feel free to open a pull request or issue.



### **License**
This project is licensed under the GNU License. See the [LICENSE](https://github.com/stephenombuya/bugtracker/blob/main/LICENSE) file for details.

