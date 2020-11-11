package com.java.Springboot.repository;

import com.java.Springboot.domain.Projektaufgabe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Projektaufgaberepository extends JpaRepository<Projektaufgabe, Integer> {

    //List<Projektaufgabe>findProjektaufgabenByMeilenstein(Meilenstein meilenstein);
}
