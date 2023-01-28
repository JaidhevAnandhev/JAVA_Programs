package com.example.SpringDemoProject;


import com.example.SpringDemoProject.ErrorHandling.DepartmentNotFoundException;
import com.example.SpringDemoProject.entity.Department;
import com.example.SpringDemoProject.service.DepartmentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger LOGGER=
            Logger.getLogger(String.valueOf(DepartmentController.class));

    @GetMapping("/getdepartment")
    public List <Department> fetchDepartmentList(){
        LOGGER.info("Inside fetchDepartmentList of DepartmentController = ");
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDeptById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
        return departmentService.findDeptById(departmentId);
    }

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController = ");
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/deletedept/{Id}")
    public String delDeptById(@PathVariable("Id") long departmentId){
        departmentService.deleteDeptById(departmentId);
        return "Deleted {departmentId}!!";
    }

   @GetMapping("departments/name/{name}")
    public Department fetchDeptByName(@PathVariable("name") String departmentName ){
        return departmentService.fetchDepartmentByName(departmentName);
   }

}
