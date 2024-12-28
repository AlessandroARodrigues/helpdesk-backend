package com.alessandro.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.alessandro.helpdesk.domain.Chamado;
import com.alessandro.helpdesk.domain.Cliente;
import com.alessandro.helpdesk.domain.Tecnico;
import com.alessandro.helpdesk.domain.enums.Perfil;
import com.alessandro.helpdesk.domain.enums.Prioridade;
import com.alessandro.helpdesk.domain.enums.Status;
import com.alessandro.helpdesk.repositories.ChamadoRepository;
import com.alessandro.helpdesk.repositories.ClienteRepository;
import com.alessandro.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		

		Tecnico tec1 = new Tecnico(null, "Alessandro Rodrigues", "17749788816", "alessandroa15@hotmail.com", encoder.encode("123456"));
		tec1.addPerfil(Perfil.ADMIN);
		
		
		Cliente cli1 = new Cliente(null, "Simone Brunelli", "27487642852", "simone@hotmail.com", encoder.encode("123456"));
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
