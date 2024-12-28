package com.alessandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alessandro.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
