package com.codebuffer.department.controller;

import com.codebuffer.department.entity.Department;
import com.codebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        //log.info("inside");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{Id}")
    public Department findDepartmentById(@PathVariable("Id") Long departmentId){
        return departmentService.findDepartmentById(departmentId);
    }
    
}
