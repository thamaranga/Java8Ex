package com.hasitha;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaComparatorEx {

    public static void main(String[] args) {

        List<Employee> employees= Arrays.asList(
                new Employee("sanath", "jayasuriya",29,100000),
                new Employee("lasith", "malinga",27,85000),
                new Employee("kumar", "sangakkara",31,150000),
                new Employee("mahela", "jayawardhana",33,75000),
                new Employee("kusal", "mendis",24,50000)

                );

        sortWithLamda(employees);
    }

    public static void sortWithoutLamda(List<Employee> employees){

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary().compareTo(e2.getSalary()) ;
            }
        });

        employees.forEach(i-> System.out.println(i));


    }

    public static void sortWithLamda(List<Employee> employees){

        Collections.sort(employees, (e1,e2)-> e1.getSalary().compareTo(e2.getSalary()) );

        employees.forEach(i-> System.out.println(i));


    }
}
