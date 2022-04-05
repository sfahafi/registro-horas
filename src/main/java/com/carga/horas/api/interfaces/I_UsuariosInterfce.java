package com.carga.horas.api.interfaces;

import java.util.List;

import com.carga.horas.api.model.Usuario;

public interface I_UsuariosInterfce {

	List<Usuario> buscarTodos();
	Usuario buscarPorId(Integer idUsuario);
	void guardar(Usuario usuario);
	void eliminar(Integer idUsuario);
	
}
