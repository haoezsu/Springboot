package com.java.Springboot.controller;

import com.java.Springboot.domain.Meilenstein;
import com.java.Springboot.service.Meilensteinservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/meilenstein")
@RestController
public class Controller
{
    private final Meilensteinservice meilenstein1;

    @Autowired
    public Controller(Meilensteinservice meilenstein)
    {
        this.meilenstein1= meilenstein;
    }

    //@Getmapping()
    @RequestMapping
    public List<Meilenstein> getallMeilenstein()
    {
        return meilenstein1.listAll();
    }


    //@RequestMapping("/edit/{id}")
    //public ModelAndView showEditProductPage(@PathVariable(name = "id") int id)
    @RequestMapping("/{id}")
    public Meilenstein getspecificMeilenstein(@PathVariable(name = "id") Meilenstein test)
    {
        return test;
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteMeilenstein(@PathVariable(name = "id") Meilenstein test)
    {
        meilenstein1.delMeilenstein(test);
        return new ResponseEntity<>("Hallo", HttpStatus.OK);
    }

}