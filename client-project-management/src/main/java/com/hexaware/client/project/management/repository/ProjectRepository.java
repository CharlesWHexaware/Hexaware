package com.hexaware.client.project.management.repository;

import com.hexaware.client.project.management.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository <Project,Integer> {
    Project findByName(String name);
}
