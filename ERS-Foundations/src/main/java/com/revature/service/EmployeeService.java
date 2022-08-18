package com.revature.service;

import com.revature.entity.Employee;
import com.revature.data.EmployeeDao;
import com.revature.data.EmployeeDaoImpl;

import java.util.List;

public class EmployeeService {

    //insert
    public Employee insert(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.insert(employee);
    }

    //getById
    public Employee getById(int id) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.getById(id);
    }

    //getAllEmployees
    public List<Employee> getAllEmployees() {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.getAllEmployees();
    }

    //update
    public Employee update(Employee employee) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.update(employee);
    }

    //delete
    public boolean delete(int id) {
        EmployeeDao employeeDao = new EmployeeDaoImpl();
        return employeeDao.delete(id);
    }
}
