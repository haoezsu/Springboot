package com.java.Springboot.service;


import com.java.Springboot.domain.Projektaufgabe;
import com.java.Springboot.repository.Projektaufgaberepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Projektaufgabeservice
{
    @Autowired
    private Projektaufgaberepository repository;

    Projektaufgabeservice()
    {

    }
    public List<Projektaufgabe> listAll()
    {
        return repository.findAll();
    }


}
