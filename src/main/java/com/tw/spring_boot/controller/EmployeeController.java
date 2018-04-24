package com.tw.spring_boot.controller;

import com.alibaba.fastjson.JSON;
import com.tw.spring_boot.domain.Employee;
import com.tw.spring_boot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by 筱湮 on 2018/4/23 0023.
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //查询所有 Employee 的API接口，并返回一个包含所有Employee的JSON
    //要求使用Postman来向目标接口路径发送请求，获取Response
    @RequestMapping("/employees")
    public String employees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return JSON.toJSONString(employees);
    }
}


