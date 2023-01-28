package com.example.SpringDemoProject.service;

import com.example.SpringDemoProject.ErrorHandling.DepartmentNotFoundException;
import com.example.SpringDemoProject.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department findDeptById(long departmentId) throws DepartmentNotFoundException;

   public void deleteDeptById(long departmentId);

   public Department fetchDepartmentByName(String departmentName);
}
