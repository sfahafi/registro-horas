package com.carga.horas.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carga.horas.api.model.Hora;
import com.carga.horas.api.service.HorasService;

@RestController
@RequestMapping("/api")
public class HorasController {

	@Autowired
	private HorasService hs;
	
	@GetMapping("/horas")
	public List<Hora> buscarTodas() {
		return hs.buscarTodas();
	}
	
	@PostMapping("/horas")
	public Hora guardar(@RequestBody Hora hora) {
		hs.guardar(hora);
		return hora;
	}
	
	@PutMapping("/horas")
	public Hora modificar(@RequestBody Hora hora) {
		hs.guardar(hora);
		return hora;
	}
	
	@DeleteMapping("/horas/{id}")
	public String eliminar(@PathVariable("id") int idHora) {
		hs.eliminar(idHora);
		return "Registro eliminado";
	}
	
	
	
}
