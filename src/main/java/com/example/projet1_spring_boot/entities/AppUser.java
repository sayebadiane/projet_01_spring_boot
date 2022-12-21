package com.example.projet1_spring_boot.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "appuser")
public class AppUser  implements Serializable {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom", nullable = false,length = 200)
    private  String nom;
    @Column(name = "prenom", nullable = false,length = 200)
    private  String prenom;
    @Column(name = "email", nullable = false,length = 200,unique = true )
    private  String email;
    @Column(name = "password", nullable = false,length = 200)
    private  String password;


    public AppUser() {
    }

    @ManyToMany(fetch = FetchType.EAGER)
    List<AppRole> roles=new ArrayList<AppRole>();
}
