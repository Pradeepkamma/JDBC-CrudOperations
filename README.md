# JDBC-CrudOperations

This repository demonstrates **CRUD (Create, Read, Update, Delete) operations** in Java using JDBC. It includes three different implementations to handle database connections and queries efficiently.  

## **Project Structure**  
The repository is divided into three folders, each showcasing a different approach to performing CRUD operations:  

```
JDBC-CrudOperations/
│── Method1/  → JDBC CRUD using Try-With-Resources  
│── Method2/  → JDBC CRUD using Finally Block  
│── Method3/  → JDBC CRUD using Separate Methods  
│── README.md  
```

---

## **1️⃣ Method1: JDBC CRUD using Try-With-Resources**  
This implementation uses **Try-With-Resources**, which **automatically closes the database connection and statements**, ensuring efficient resource management.  

🔹 **File:** `CurdOperationsTryWithResources.java`  


## **2️⃣ Method2: JDBC CRUD using Finally Block**  
This implementation manually closes the database connection using the **finally block** to ensure that resources are released properly.  

🔹 **File:** `JDBC-CrudOperationsUsingFinally.java`  


## **3️⃣ Method3: JDBC CRUD using Methods**  
This implementation organizes **CRUD operations into separate methods**, making the code reusable and modular.  

🔹 **File:** `CrudUsingMethods.java`  

## **🚀 Contributing**  
Feel free to submit pull requests or report any issues!  
