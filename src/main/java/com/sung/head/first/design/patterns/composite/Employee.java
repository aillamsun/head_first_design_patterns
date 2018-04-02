package com.sung.head.first.design.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sungang on 2018/4/2.
 * 通常，这种类需要定义 add(node)、remove(node)、getChildren() 这些方法。
 */
public class Employee {

    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates; //下属


    // constructor
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString(){
        return ("Employee :[ Name : " + name + ", dept : " + dept + ", salary :" + salary+" ]");
    }
}
