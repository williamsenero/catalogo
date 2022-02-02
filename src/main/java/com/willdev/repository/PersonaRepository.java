package com.willdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.willdev.domain.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
