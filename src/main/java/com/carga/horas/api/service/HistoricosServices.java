package com.carga.horas.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carga.horas.api.interfaces.I_HistoricosInterface;
import com.carga.horas.api.jpa.repository.I_HistoricosRepository;
import com.carga.horas.api.model.Historico;

@Service
public class HistoricosServices implements I_HistoricosInterface{

	
	@Autowired
	private I_HistoricosRepository histoRepo;
	
	@Override
	public void guardar(Historico historico) {
		histoRepo.save(historico);
		
	}

	@Override
	public void eliminar(Integer idHistorico) {
		histoRepo.deleteById(idHistorico);
		
	}

	@Override
	public List<Historico> buscarTodas() {
		return histoRepo.findAll();
	}

	@Override
	public Historico buscarPorId(Integer idHistorico) {
		Optional<Historico> optional = histoRepo.findById(idHistorico);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

}
