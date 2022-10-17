package com.hexaware.client.project.management.service;

import com.hexaware.client.project.management.entity.Client;
import com.hexaware.client.project.management.entity.Project;
import com.hexaware.client.project.management.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository repository;

    public Client saveClient (Client client){
        return repository.save(client);
    }

    public List<Client> saveClients(List<Client> clients) {
        return repository.saveAll(clients);
    }
    public List<Client> getClients(){
        return repository.findAll();
    }
    public Client getClientsById(int id){
        return repository.findById(id).orElse(null);
    }
    public Client getClientsByName(String name){
        return repository.findByName(name);
    }
    public String deleteClient(int id){
        repository.deleteById(id);
        return "Client " + id + "deleted Successfully";
    }

    public Client updateClient(Client client){
        Client existingClient = repository.findById(client.getId()).orElse(null);
        existingClient.setDateJoined(client.getDateJoined());
        existingClient.setAddress(client.getAddress());
        existingClient.setName(client.getName());
        return repository.save(existingClient);
    }
}
