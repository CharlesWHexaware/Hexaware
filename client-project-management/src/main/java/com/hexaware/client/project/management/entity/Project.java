package com.hexaware.client.project.management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PROJECT_TBL")
public class Project {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int price;
    private String client;
}
