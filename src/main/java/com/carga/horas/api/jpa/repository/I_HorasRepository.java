package com.carga.horas.api.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carga.horas.api.model.Hora;

public interface I_HorasRepository extends JpaRepository<Hora, Integer>{

	//Hora findByLegajo(int nLegajo);
	
}
