package com.carga.horas.api.interfaces;

import java.util.List;

import com.carga.horas.api.model.Hora;

public interface I_HorasInterface {

	List<Hora> buscarTodas();
	Hora buscarPorLegajo(int nLegajo);
	Hora buscarPorId(Integer idHora);
	void guardar(Hora hora);
	void eliminar(Integer idHora);
	
}
