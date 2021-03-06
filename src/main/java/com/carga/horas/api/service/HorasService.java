package com.carga.horas.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carga.horas.api.interfaces.I_HorasInterface;
import com.carga.horas.api.jpa.repository.I_HorasRepository;
import com.carga.horas.api.model.Hora;

@Service
public class HorasService implements I_HorasInterface{

	@Autowired
	private I_HorasRepository horaRepo;
	
	@Override
	public List<Hora> buscarTodas() {
		return horaRepo.findAll();
	}
	
	/*
	@Override
	public Hora buscarPorLegajo(int nLegajo) {
		return horaRepo.findByLegajo(nLegajo);
	}
	*/

	@Override
	public Hora buscarPorId(Integer idHora) {
		Optional<Hora> optional = horaRepo.findById(idHora);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Hora hora) {
		horaRepo.save(hora);
		
	}

	@Override
	public void eliminar(Integer idHora) {
		horaRepo.deleteById(idHora);
		
	}


}
