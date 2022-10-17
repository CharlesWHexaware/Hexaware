package com.hexaware.client.project.management.service;

import com.hexaware.client.project.management.entity.Project;
import com.hexaware.client.project.management.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository repository;

    public Project saveProject(Project project) {
     return repository.save(project);
    }
    public List<Project> saveProjects(List<Project> projects) {
        return repository.saveAll(projects);
    }
    public List<Project> getProjects(){
        return repository.findAll();
    }
    public Project getProjectsById(int id){
        return repository.findById(id).orElse(null);
    }
    public Project getProjectsByName(String name){
        return repository.findByName(name);
    }
    public String deleteProject(int id){
       repository.deleteById(id);
       return "Project " + id + "deleted Successfully";
    }
    public Project updateProject(Project project){
        Project existingProject = repository.findById(project.getId()).orElse(null);
        existingProject.setClient(project.getClient());
        existingProject.setPrice(project.getPrice());
        existingProject.setName(project.getName());
        return repository.save(existingProject);
    }


}
