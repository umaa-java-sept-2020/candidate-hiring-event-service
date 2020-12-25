package com.uuv.candidatehiringeventservice.controller;


import com.uuv.candidatehiringeventservice.model.Department;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @GetMapping("/department")
    public List<Department> getAllAddressList(){
        return null;
    }
    @GetMapping("/department/{uuid}")
    public Department getDepartmentById(@PathVariable ("uuid") String uid){
        return null;
    }
    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department){
        return null;
    }
    @PutMapping("/department/{uuid}")
    public Department updateDepartment(@RequestBody Department department ,@PathVariable ("uuid") String uid){
        return null;
    }
    @DeleteMapping("/department/{uuid}")
    public Department deleteDepartment(@PathVariable("uuid") String uid){
        return null;
    }
}
