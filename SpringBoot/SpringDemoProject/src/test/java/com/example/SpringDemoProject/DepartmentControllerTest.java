package com.example.SpringDemoProject;

import com.example.SpringDemoProject.entity.Department;
import com.example.SpringDemoProject.service.DepartmentService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DepartmentService departmentService;

    private Department department;

    @BeforeEach
    void setup(){

        // Customized manual department values
        // Here when we create dept details of ID = 1L

        department = Department.builder()

                .departmentId(1L)
                .departmentName("Google")
                .departmentCode("2003")
                .departmentAddress("SouthValley")
                .build();
    }
    @Test
    void fetchDeptById() throws Exception {

        // Use manually created department when there is a DB Call
        // Here when we select dept details of ID = 1L
        Mockito.when(departmentService.findDeptById(1L))
                .thenReturn(department);

        mockMvc.perform(get("/departments/1")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$departmentName")
                        .value(department.getDepartmentName()));
    }


    @Test
    void saveDepartment() throws Exception {
        Department inputDepartment = Department.builder()
                .departmentId(1L)
                .departmentName("Google")
                .departmentCode("2003")
                .departmentAddress("SouthValley")
                .build();

        Mockito.when(departmentService.saveDepartment(inputDepartment))
                .thenReturn(department);

        mockMvc.perform(post("/departments")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "    \"departmentId\": 1,\n" +
                        "    \"departmentName\": \"Microsoft\",\n" +
                        "    \"departmentAddress\": \"SunValley\",\n" +
                        "    \"departmentCode\": \"2023\"\n" +
                        "}"))
                .andExpect(status().isOk());

    }

}