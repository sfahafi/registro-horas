package com.carga.horas.api.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carga.horas.api.model.Historico;

public interface I_HistoricosRepository extends JpaRepository<Historico, Integer> {

}
