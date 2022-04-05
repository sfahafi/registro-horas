package com.carga.horas.api.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carga.horas.api.model.Usuario;

public interface I_UsuariosRepository extends JpaRepository<Usuario, Integer>{

}
