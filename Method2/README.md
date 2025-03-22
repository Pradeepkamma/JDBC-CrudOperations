

# JDBC-CrudOperationsUsingFinally

## Overview
This project demonstrates how to perform CRUD (Create, Read, Update, Delete) operations in Java using JDBC and MySQL. It ensures proper resource handling by closing connections in the `finally` block.

## Technologies Used
- Java
- JDBC
- MySQL

## Prerequisites
- Install [MySQL](https://www.mysql.com/downloads/)
- Install [Java JDK](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- Add MySQL JDBC Driver (`mysql-connector-java.jar`) to the project classpath

## Database Setup
1. Create a MySQL database:
   ```sql
   CREATE DATABASE jdbcdemo;
   ```
2. Create a table:
   ```sql
   CREATE TABLE employees2 (
       id INT PRIMARY KEY,
       name VARCHAR(50),
       designation VARCHAR(50),
       salary DOUBLE
   );
   ```

## How to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/Pradeepkamma/JDBC-CrudOperations.git
   ```
2. Navigate to the project folder and compile the Java program:
   ```sh
   javac CrudOperationsFinally.java
   ```
3. Run the program:
   ```sh
   java CrudOperationsFinally
   ```

## CRUD Operations Explained
### 1. Create (Insert Data)
```java
insertData(1, "Pradeep", "Software Engineer", 60000.0);
insertData(2, "Dharani", "Product Manager", 75000.0);
```
### 2. Read (Retrieve Data)
```java
retrieveData();
```
### 3. Update (Modify Data)
```java
updateData(2, "Dharanii", "Senior Product Engineer", 80000.0);
```
### 4. Delete (Remove Data)
```java
deleteData(3);
```

## License
This project is open-source and available under the MIT License.

---

