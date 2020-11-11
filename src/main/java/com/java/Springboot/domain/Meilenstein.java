package com.java.Springboot.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name = "/Meilenstein")
public class Meilenstein
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @OneToMany(
            mappedBy = "meilenstein",
            cascade = CascadeType.ALL,
            orphanRemoval =  true
            //fetch = FetchType.EAGER
    )
    private List<Projektaufgabe> projektaufgaben = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Projektaufgabe> getProjektaufgaben() {
        return projektaufgaben;
    }

    public Meilenstein()
    {

    }
    public Meilenstein(String name) {
        this.name = name;
    }

    public void setProjektaufgaben(List<Projektaufgabe> projektaufgaben) {
        this.projektaufgaben = projektaufgaben;
    }
}
