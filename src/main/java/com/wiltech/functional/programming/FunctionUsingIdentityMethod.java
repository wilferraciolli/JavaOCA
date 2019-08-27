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

/**
 *
 */
public class FunctionUsingIdentityMethod {

    public static void main(String[] args) {
        //define the function body toi get the employee's name
        Function<Employee, String> functionEmployeeToName = (Employee e) -> {
            return e.getName();
        };

        List<Employee> employees = Arrays.asList(
                new Employee("Wiliam", 34),
                new Employee("Maria", 28),
                new Employee("George", 4)
        );

        //call the function, this will get the employee name and then get the first letter of their names
        List<Employee> employeeNameList = applyIdentityToEmpList(employees, Function.identity());
        //        List<String> employeeFirstLetterNameList = employees.stream()
        //                .map(employee -> employee.getName())
        //                .map(name -> name.substring(0, 1))
        //                .collect(Collectors.toList());

        //print them out
        employeeNameList.stream()
                .forEach(System.out::println);

        //        employeeFirstLetterNameList.stream()
        //                .forEach(System.out::println);

    }

    public static List<Employee> applyIdentityToEmpList(List<Employee> employeeList, Function<Employee, Employee> functionEmployeeToString) {
        //create a list of strings to hold the employee names
        List<Employee> employees = new ArrayList<>();

        for (Employee emp : employeeList) {
            //call a function on each object to transform,
            employees.add(functionEmployeeToString.apply(emp));
        }

        return employees;
    }

}



