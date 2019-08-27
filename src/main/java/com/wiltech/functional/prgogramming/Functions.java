/*
 * (c) Midland Software Limited 2019
 * Name     : Functions.java
 * Author   : ferraciolliw
 * Date     : 27 Aug 2019
 */
package com.wiltech.functional.prgogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 */
public class Functions {

    public static void main(String[] args) {
        //define the function body
        Function<Employee, String> functionEmployeeToString = (Employee e) -> {
            return e.getName();
        };

        List<Employee> employees = Arrays.asList(
                new Employee("Wiliam", 34),
                new Employee("Maria", 28),
                new Employee("George", 4)
        );

        //call the function
        List<String> employeeNameList = convertEmployeeToNameList(employees, functionEmployeeToString);
        List<String> employeeNameList1 = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());

        //print them out
        employeeNameList.stream()
                .forEach(System.out::println);
        employeeNameList1.stream()
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

class Employee {

    private final String name;
    Integer age;

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}


