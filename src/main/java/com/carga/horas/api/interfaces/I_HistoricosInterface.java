package com.carga.horas.api.interfaces;

import java.util.List;

import com.carga.horas.api.model.Historico;

public interface I_HistoricosInterface {

	void guardar(Historico historico);
	void eliminar(Integer idHistorico);
	List<Historico> buscarTodas();
	Historico buscarPorId(Integer idHistorico);
	
}
