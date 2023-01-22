package com.example.SpringDemoProject.service;

import com.example.SpringDemoProject.entity.Department;

import java.util.List;

public interface DepartmentService {

   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department findDeptById(long departmentId);

   public void deleteDeptById(long departmentId);

   public Department fetchDepartmentByName(String departmentName);
}
