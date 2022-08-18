package com.revature.controller;

import com.revature.entity.Employee;
import com.revature.service.EmployeeService;

import java.util.Scanner;

public class EmployeeController {

    public static void menu() {
        EmployeeService employeeService = new EmployeeService();

        Scanner numScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        while(true) {
            printOptions();

            int choice = numScanner.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("-------Register-------");
                    System.out.println("Enter a Username: ");
                    String username = stringScanner.nextLine();
                    System.out.println("Enter a Password: ");
                    String password = stringScanner.nextLine();
                    Employee employee = new Employee(username,password);
                    System.out.println(employeeService.insert(employee));
                    break;
                case 2:
                    break;
            }
        }
    }

    //print options
    public static void printOptions() {
        System.out.println("What would you like to do?");
        System.out.println("1 - Register");
        System.out.println("2 - Login");
    }
}
