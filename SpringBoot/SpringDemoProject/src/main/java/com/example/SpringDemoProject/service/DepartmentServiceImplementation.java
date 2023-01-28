package com.example.SpringDemoProject.service;

import com.example.SpringDemoProject.ErrorHandling.DepartmentNotFoundException;
import com.example.SpringDemoProject.entity.Department;
import com.example.SpringDemoProject.repository.DepartmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImplementation implements DepartmentService{


    @Autowired
    private DepartmentRepo departmentRepo;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepo.findAll();
    }

    @Override
    public Department findDeptById(long departmentId)
            throws DepartmentNotFoundException {
        Optional<Department> department =
                departmentRepo.findById(departmentId);
        if (department.isEmpty()){
            throw new DepartmentNotFoundException("Department Not Found!");
        }
        return department.get();
    }

    @Override
    public void deleteDeptById(long departmentId) {
        departmentRepo.deleteById(departmentId);

    }

    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepo.findByDepartmentName(departmentName);
    }



}


