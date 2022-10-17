package com.hexaware.client.project.management.repository;

import com.hexaware.client.project.management.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {
    Client findByName(String name);
}
