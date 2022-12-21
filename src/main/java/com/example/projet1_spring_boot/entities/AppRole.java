package com.example.projet1_spring_boot.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "approle")
public class AppRole {


    public AppRole(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public  AppRole(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<AppUser> getUsers() {
        return users;
    }

    public void setUsers(List<AppUser> users) {
        this.users = users;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column(name = "nom", nullable = false,length = 200)
    private  String nom;

    @ManyToMany(mappedBy = "roles")
    List<AppUser> users =new ArrayList<AppUser>();
}
