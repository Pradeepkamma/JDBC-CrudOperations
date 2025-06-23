### **README.md**  

# **JDBC CRUD Operations using Methods** 

This project demonstrates **CRUD (Create, Read, Update, Delete) operations** in Java using JDBC and MySQL. The operations are implemented using **separate methods** for better reusability and code organization.  

## **How to Run the Project**  

### **1. Clone the Repository**  
```sh
git clone https://github.com/Pradeepkamma/JDBC-CrudOperations.git
```

### **2. Setup Database**  
Ensure you have a **MySQL database** named `jdbcdemo` with a table `student`:  
```sql
CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    email VARCHAR(100)
);
```

### **3. Update Database Credentials**  
Modify the **database URL, username, and password** in `CrudUsingMethods.java`:  
```java
private static final String url = "jdbc:mysql://localhost:3306/jdbcdemo";
private static final String username = "root";
private static final String password = "admin";
```

### **4. Run the Java Program**  
Execute `CrudUsingMethods.java` to perform **INSERT, UPDATE, and DELETE operations**.  

## **Operations in the Code**  
- **insert()** → Adds a new student record.  
- **update()** → Updates an existing student's name.  
- **delete()** → Deletes a student record.  

---

🚀 **Happy Coding!**
