package org.example.Classes;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Client {
    private String name;
    public Client(){

    }
    private Client(String name){
        this.name = name;
    }

    public List<Client> generateFiveClient(){
        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Mark"));
        clients.add(new Client("Steve"));
        clients.add(new Client("John"));
        clients.add(new Client("Mary"));
        clients.add(new Client("Tony"));
        return clients;
    }
}
