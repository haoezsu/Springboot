package com.java.Springboot.repository;

import com.java.Springboot.domain.Meilenstein;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Meilensteinrepository extends JpaRepository<Meilenstein,Integer> {

}
