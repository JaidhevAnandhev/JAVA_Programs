package com.example.SpringDemoProject.service;

import com.example.SpringDemoProject.ErrorHandling.DepartmentNotFoundException;
import com.example.SpringDemoProject.entity.Department;
import com.example.SpringDemoProject.repository.DepartmentRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    private DepartmentService departmentService;
    @MockBean
    private DepartmentRepo departmentRepo;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder().
                        departmentId(1L)
                        .departmentName("Microsoft")
                        .departmentCode("9001-2008")
                        .departmentAddress("SunValley")
                        .build();

        Mockito.when(departmentRepo.findByDepartmentName("Microsoft"))
                .thenReturn(department);
    }

    @Test
    public void whenValidDeptFound_TellDeptFound() throws DepartmentNotFoundException {
        String deptName = "Microsoft";
        Department found = departmentService.fetchDepartmentByName(deptName);

        assertEquals(deptName, found.getDepartmentName());

    }
}