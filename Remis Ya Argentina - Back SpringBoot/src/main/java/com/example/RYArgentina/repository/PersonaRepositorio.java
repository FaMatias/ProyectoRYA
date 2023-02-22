
package com.example.RYArgentina.repository;

import com.example.RYArgentina.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepositorio  extends JpaRepository <Persona,Long>{
    
}
