package com.hexaware.client.project.management.controller;

import com.hexaware.client.project.management.entity.Project;
import com.hexaware.client.project.management.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.OnError;
import java.util.List;

@RestController
public class ProjectController {
    @Autowired
    private ProjectService service;

    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project){
        return service.saveProject(project);
    }

    @PostMapping("/addprojects")
    public List<Project> addProjects(@RequestBody List<Project> projects){
        return service.saveProjects(projects);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/projects")
    public List<Project> findAllProjects(){
        return service.getProjects();
    }

    @GetMapping("/projects/{id}")
    public Project findProjectById(@PathVariable int id){
        return service.getProjectsById(id);
    }

    @GetMapping("/projects/{name}")
    public Project findProjectByName(@PathVariable String name){
        return service.getProjectsByName(name);
    }

    @PutMapping("/updateproject")
    public Project updateProject(@RequestBody Project project){
        return service.updateProject(project);
    }

    @DeleteMapping("/deleteproject/{id}")
    public String deleteProject(@PathVariable int id){
        return service.deleteProject(id);
    }


}
