package com.java.Springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
//@Table(name="Projektaufgabe")
public class Projektaufgabe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "meilenstein_id")
    //@JsonIgnore
    private Meilenstein meilenstein;

    public Projektaufgabe()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public Meilenstein getMeilenstein() {
        return meilenstein;
    }

    public void setMeilenstein(Meilenstein meilenstein) {
        this.meilenstein = meilenstein;
    }

    public Projektaufgabe(String name, Meilenstein meilenstein){
        this.name = name;
        this.meilenstein = meilenstein;

    }

}
