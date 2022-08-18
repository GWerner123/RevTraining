package com.revature.data;

import com.revature.entity.Employee;

import java.sql.*;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao {

    Connection connection;

    public EmployeeDaoImpl(){connection = ConnectionFactory.getConnection();}


    @Override
    public Employee insert(Employee employee) {

        String sql = "insert into employee (id,username,password) values (default,?,?);";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,employee.getUsername());
            preparedStatement.setString(2,employee.getPassword());

            int count = preparedStatement.executeUpdate();
            if(count == 1) {
                System.out.println("The account was successfully created.");

                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                resultSet.next();
                int generatedId = resultSet.getInt(1);
                employee.setId(generatedId);
            } else {
                System.out.println("Something went wrong with the account creation.");
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("Something went wrong...");
        }
        return employee;
    }

    @Override
    public Employee getById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
