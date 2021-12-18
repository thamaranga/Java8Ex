package com.hasitha;

public class Employee {

    private String firstname;
    private String lastName;
    private int age;
    private Integer salary;

    public Employee(String firstname, String lastName, int age, Integer salary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.salary=salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [firstname = "+firstname+" lastName = "+lastName+" age "+age +" salary "+salary+"]";
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
