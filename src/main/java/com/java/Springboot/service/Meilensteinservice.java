package com.java.Springboot.service;

import com.java.Springboot.domain.Meilenstein;
import com.java.Springboot.repository.Meilensteinrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Meilensteinservice
{
    @Autowired
    private Meilensteinrepository meilensteinrepository;

    Meilensteinservice(){

    }
    public List<Meilenstein> listAll()
    {
        return meilensteinrepository.findAll();
    }
    public void delMeilenstein(Meilenstein meilenstein)
    {
        meilensteinrepository.delete(meilenstein);
    }

    public Meilenstein addMeilenstein(Meilenstein meilenstein)
    {
        Meilenstein meilenstein2 = new Meilenstein();
        meilenstein.setName(meilenstein.getName());

        return meilenstein2;
    }

}
