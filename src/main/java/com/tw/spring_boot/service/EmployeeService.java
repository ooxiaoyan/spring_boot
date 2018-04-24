package com.tw.spring_boot.service;

import com.tw.spring_boot.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 筱湮 on 2018/4/24 0024.
 */
@Service
public class EmployeeService {

    public List<Employee> getAllEmployees() {

        return createEmployees();
    }

    List<Employee> createEmployees() {
        Employee employee1 = new Employee("1","小明","18","男");
        Employee employee2 = new Employee("2","小红","17","女");
        Employee employee3 = new Employee("3","小智","18","男");
        Employee employee4 = new Employee("4","小霞","19","女");
        Employee employee5 = new Employee("5","小刚","19","男");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        return employees;
    }
}
