package com.viscaya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viscaya.entities.Servicios;
import com.viscaya.repository.IServiciosRepository;



@RestController
@RequestMapping("/api")
public class ServiciosController {
	
	
	@Autowired
	private IServiciosRepository service;
	
	
	@GetMapping("/byIdApp/{idApp}")
	public List<Servicios> personabyId(@PathVariable(value = "idApp") Long idApp) {
		return service.findByIdApp(idApp);
	}

}
