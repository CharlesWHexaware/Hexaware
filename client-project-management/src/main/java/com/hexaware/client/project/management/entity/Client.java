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
@Table(name = "CLIENT_TBL")
public class Client {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private String dateJoined;
}
