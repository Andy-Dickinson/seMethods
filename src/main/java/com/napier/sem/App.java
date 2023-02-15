package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Test method to print all employees first names
        a.getEmployees();

        // Disconnect from database
        a.disconnect();
    }

    /**
     * Method to select all employees from database
     * and print all first names
     */
    public void getEmployees() {
        try {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect = "SELECT * FROM employees";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information

            while (rset.next()) {
                String name = rset.getString("first_name");
                System.out.println(name);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get salary details");
        }
    }

    /**
     * A method to return an employee
     */
    public Employee getEmployee(int ID)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT emp_no, first_name, last_name "
                            + "FROM employees "
                            + "WHERE emp_no = " + ID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("emp_no");
                emp.first_name = rset.getString("first_name");
                emp.last_name = rset.getString("last_name");
                return emp;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get employee details");
            return null;
        }
    }

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000); // Change delay to 30000 before pushing to GitHub, set to 0 when db up and running and testing locally
                // Connect to database
                //docker use db:3306
                //local use localhost:30060
                con = DriverManager.getConnection("jdbc:mysql://db:3306/employees?useSSL=false", "root", "example");
//                con = DriverManager.getConnection("jdbc:mysql://localhost:33060/employees?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + i);
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }
}