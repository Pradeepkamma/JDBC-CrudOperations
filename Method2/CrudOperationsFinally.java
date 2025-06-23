
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CrudOperationsFinally { 

    private static final String DB_URL = "jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String USER = "root";
    private static final String PASSWORD = "admin";

    // CREATE operation (Insert)
    public static void insertData(int id, String name, String designation, double salary) {
        String insertSQL = "INSERT INTO employees2 (id, name, designation, salary) VALUES (" 
                            + id + ", '" + name + "', '" + designation + "', " + salary + ")";

        Connection connection = null;
        Statement statement = null;

        try {
        	System.out.println("insertSQL: "+insertSQL);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(insertSQL);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
        } finally {
            // Close resources directly in finally block
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    // READ operation (Select)
    public static void retrieveData() {
        String selectSQL = "SELECT * FROM employees2";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet=null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
             resultSet = statement.executeQuery(selectSQL);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String designation = resultSet.getString("designation");
                double salary = resultSet.getDouble("salary");
                System.out.println("ID: " + id + " Name: " + name + " Designation: " + designation + " Salary: " + salary);
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data: " + e.getMessage());
        } finally {
            // Close resources directly in finally block
            try {
            	if(resultSet!=null) {
            		resultSet.close();
            	}
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    // UPDATE operation
    public static void updateData(int id, String newName, String newDesignation, double newSalary) {
        String updateSQL = "UPDATE employees2 SET name = '" + newName + "', designation = '" 
                            + newDesignation + "', salary = " + newSalary + " WHERE id = " + id;

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(updateSQL);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
        } finally {
            // Close resources directly in finally block
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    // DELETE operation
    public static void deleteData(int id) {
        String deleteSQL = "DELETE FROM employees2 WHERE id = " + id;

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            statement = connection.createStatement();
            int rowsAffected = statement.executeUpdate(deleteSQL);
            System.out.println("Rows affected: " + rowsAffected);
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
        } finally {
            // Close resources directly in finally block
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }

    // Main method to demonstrate CRUD operations
    public static void main(String[] args) {
        // Insert data
        System.out.println("Inserting data...");
        insertData(1, "Pradeep", "Software Engineer", 60000.0);
        insertData(2, "Dharani", "Product Manager", 75000.0);
        insertData(3, "Mahi", "Product Manager", 35000.0);

        // Retrieve data
        System.out.println("\nRetrieving data...");
        retrieveData();

        // Update data
        System.out.println("\nUpdating data...");
        updateData(2, "Dharanii", "Senior Product Engineer", 80000.0);

        // Retrieve data again to see the update
        System.out.println("\nRetrieving data after update...");
        retrieveData();

        // Delete data
        System.out.println("\nDeleting data...");
        deleteData(3);

        // Retrieve data again to see the deletion
        System.out.println("\nRetrieving data after deletion...");
        retrieveData();
    }
}
