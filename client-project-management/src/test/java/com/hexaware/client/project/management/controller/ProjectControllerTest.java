package com.hexaware.client.project.management.controller;

import com.hexaware.client.project.management.entity.Project;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ProjectControllerTest {
    ProjectController controller = new ProjectController();

    @Test
    void addProject() throws Exception {
        Project testProject = new Project();
        testProject.setName("testAWS");
        testProject.setClient("testBezos");
        testProject.setPrice(350);
        controller.addProject(testProject);
    }

    @Test
    void addProjects() {
        Project testProject = new Project();
        testProject.setName("testPrime");
        testProject.setClient("testJeff");
        testProject.setPrice(350);

        Project testProject2 = new Project();
        testProject2.setName("testDell");
        testProject2.setClient("testLarry");
        testProject2.setPrice(350);


        List<Project> projects = new ArrayList<>();
        projects.add(testProject);
        projects.add(testProject2);
        controller.addProjects((List<Project>) projects);
    }

    @Test
    void findAllProjects() {
    }

    @Test
    void findProjectById() {
    }

    @Test
    void findProjectByName() {
    }

    @Test
    void updateProject() {
    }

    @Test
    void deleteProject() {
    }
}