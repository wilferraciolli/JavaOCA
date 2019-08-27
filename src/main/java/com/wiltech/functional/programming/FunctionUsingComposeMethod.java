/*
 * (c) Midland Software Limited 2019
 * Name     : Functions.java
 * Author   : ferraciolliw
 * Date     : 27 Aug 2019
 */
package com.wiltech.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 */
public class FunctionUsingComposeMethod {

    public static void main(String[] args) {
        //define the function body toi get the employee's name
        Function<Employee, String> functionEmployeeToName = (Employee e) -> {
            return e.getName();
        };

        //define a function to get the first name of the employee
        Function<Employee, Employee> employeeFirstNameFunction = (Employee e) -> {
            int index = e.getName().indexOf(" ");
            String firstName = e.getName().substring(0, index);
            e.setName(firstName);

            return e;
        };

        List<Employee> employees = Arrays.asList(
                new Employee("Wiliam Ferraciolli", 34),
                new Employee("Maria Georgiou", 28),
                new Employee("George Ferraciolli", 4)
        );

        List<Employee> employees2 = Arrays.asList(
                new Employee("Wiliam Ferraciolli", 34),
                new Employee("Maria Georgiou", 28),
                new Employee("George Ferraciolli", 4)
        );

        //call the function, this will get the employee name and then get the first letter of their names
        List<String> employeeNameList = convertEmployeeToNameList(employees, functionEmployeeToName.compose(employeeFirstNameFunction));
        List<String> employeeFirstNameList = employees2.stream()
                .map(employee -> employee.getName())
                .map(name -> name.substring(0, name.indexOf(" ")))
                .collect(Collectors.toList());

        //print them out
        employeeNameList.stream()
                .forEach(System.out::println);

        employeeFirstNameList.stream()
                .forEach(System.out::println);

    }

    public static List<String> convertEmployeeToNameList(List<Employee> employeeList, Function<Employee, String> functionEmployeeToString) {
        //create a list of strings to hold the employee names
        List<String> employeeNames = new ArrayList<>();

        for (Employee emp : employeeList) {
            //call a function on each object to transform,
            employeeNames.add(functionEmployeeToString.apply(emp));
        }

        return employeeNames;
    }

}



