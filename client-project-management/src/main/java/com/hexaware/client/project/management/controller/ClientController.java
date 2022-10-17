package com.hexaware.client.project.management.controller;

import com.hexaware.client.project.management.entity.Client;
import com.hexaware.client.project.management.entity.Project;
import com.hexaware.client.project.management.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    private ClientService service;

    @PostMapping("/addclient")
    public Client addClient(@RequestBody Client client){
        return service.saveClient(client);
    }

    @PostMapping("/addclients")
    public List<Client> addClients(@RequestBody List<Client> clients){
        return service.saveClients(clients);
    }

    @GetMapping("/clients")
    public List<Client> findAllClients(){
        return service.getClients();
    }

    @GetMapping("/clients/{id}")
    public Client findClientById(@PathVariable int id){
        return service.getClientsById(id);
    }

    @GetMapping("/clients/{name}")
    public Client findClientByName(@PathVariable String name){
        return service.getClientsByName(name);
    }

    @PutMapping("/updateclient")
    public Client updateClient(@RequestBody Client client){
        return service.updateClient(client);
    }

    @DeleteMapping("/deleteclient/{id}")
    public String deleteClient(@PathVariable int id){
        return service.deleteClient(id);
    }

}
