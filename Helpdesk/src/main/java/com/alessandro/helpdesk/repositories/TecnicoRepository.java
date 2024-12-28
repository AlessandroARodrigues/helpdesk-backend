package com.alessandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alessandro.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
