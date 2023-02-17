package com.napier.sem;

import java.util.ArrayList;
import java.sql.*;

public class App
{
    /* Ensure set to false before pushing to GitHub or for running via docker-compose.
       If setting to true and testing locally, start db first before running app. Will ONLY be able to run via App main()
    */
    private Boolean test_on_localhost = false;

    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Get Employee by ID
        Employee emp = a.getEmployee(255530);
        // Display results
        a.displayEmployee(emp);

        // Extract employee salary information
        ArrayList<Employee> employees = a.getAllSalaries();
        // Test the size of the returned data - should be 240124
        System.out.println("Size of returned data for employees: " + employees.size());
        a.printSalaries(employees);

        // Test method to print all employees first names
//        a.getEmployees();

        // Disconnect from database
        a.disconnect();
    }

    /**
     * Prints a list of employees.
     * @param employees The list of employees to print.
     */
    public void printSalaries(ArrayList<Employee> employees)
    {
        // Print header
        System.out.println(String.format("%-10s %-15s %-20s %-8s", "Emp No", "First Name", "Last Name", "Salary"));
        // Loop over all employees in the list
        for (Employee emp : employees)
        {
            String emp_string =
                    String.format("%-10s %-15s %-20s %-8s",
                            emp.emp_no, emp.first_name, emp.last_name, emp.salary);
            System.out.println(emp_string);
        }
    }

    /**
     * Gets all the current employees and salaries.
     * @return A list of all employees and salaries, or null if there is an error.
     */
    public ArrayList<Employee> getAllSalaries()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT employees.emp_no, employees.first_name, employees.last_name, salaries.salary "
                            + "FROM employees, salaries "
                            + "WHERE employees.emp_no = salaries.emp_no AND salaries.to_date = '9999-01-01' "
                            + "ORDER BY employees.emp_no ASC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract employee information
            ArrayList<Employee> employees = new ArrayList<Employee>();
            while (rset.next())
            {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("employees.emp_no");
                emp.first_name = rset.getString("employees.first_name");
                emp.last_name = rset.getString("employees.last_name");
                emp.salary = rset.getInt("salaries.salary");
                employees.add(emp);
            }
            return employees;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get salary details");
            return null;
        }
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
                    "select employees.emp_no, employees.first_name, employees.last_name, t.title, s.salary, d.dept_name, dm.emp_no as dm\n"
                    + "from employees\n"
                    + "join salaries s on employees.emp_no = s.emp_no\n"
                    + "join titles t on employees.emp_no = t.emp_no\n"
                    + "join dept_emp de on employees.emp_no = de.emp_no\n"
                    + "join departments d on de.dept_no = d.dept_no\n"
                    + "join dept_manager dm on d.dept_no = dm.dept_no\n"
                    + "WHERE t.to_date = '9999-01-01'\n"
                    + "and s.to_date = '9999-01-01'\n"
                    + "and dm.to_date = '9999-01-01' and employees.emp_no = " + ID;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new employee if valid.
            // Check one is returned
            if (rset.next())
            {
                Employee emp = new Employee();
                emp.emp_no = rset.getInt("employees.emp_no");
                emp.first_name = rset.getString("employees.first_name");
                emp.last_name = rset.getString("employees.last_name");
                emp.title = rset.getString("t.title");
                emp.salary = rset.getInt("s.salary");
                emp.dept_name = rset.getString("d.dept_name");
                emp.manager = rset.getString("dm");
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
     * Method to display employee by ID
     * @param emp
     */
    public void displayEmployee(Employee emp)
    {
        if (emp != null)
        {
            System.out.println(
                    emp.emp_no + " "
                            + emp.first_name + " "
                            + emp.last_name + "\n"
                            + "Title: " + emp.title + "\n"
                            + "Salary: " + emp.salary + "\n"
                            + "Department: " + emp.dept_name + "\n"
                            + "Manager: " + emp.manager + "\n");
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
                int delay = 30000;
                String port = "db:3306";
                if (test_on_localhost) {
                    delay = 0;
                    port = "localhost:33060";
                }
                // Wait a bit for db to start
                Thread.sleep(delay); // Change delay to 30000 before pushing to GitHub, set to 0 when db up and running and testing locally
                // Connect to database
                //docker use db:3306
                //local use localhost:30060
                con = DriverManager.getConnection("jdbc:mysql://" + port + "/employees?useSSL=false", "root", "example");
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