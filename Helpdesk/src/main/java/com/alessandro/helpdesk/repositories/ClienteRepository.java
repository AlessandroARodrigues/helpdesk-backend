package com.alessandro.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alessandro.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
