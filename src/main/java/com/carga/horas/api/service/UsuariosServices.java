package com.carga.horas.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carga.horas.api.interfaces.I_UsuariosInterfce;
import com.carga.horas.api.jpa.repository.I_UsuariosRepository;
import com.carga.horas.api.model.Usuario;

@Service
public class UsuariosServices implements I_UsuariosInterfce{

	@Autowired
	private I_UsuariosRepository repoUsuarios;
	
	@Override
	public List<Usuario> buscarTodos() {
		return repoUsuarios.findAll();
	}

	@Override
	public Usuario buscarPorId(Integer idUsuario) {
		Optional<Usuario> optional = repoUsuarios.findById(idUsuario);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void guardar(Usuario usuario) {
		repoUsuarios.save(usuario);
		
	}

	@Override
	public void eliminar(Integer idUsuario) {
		repoUsuarios.deleteById(idUsuario);
		
	}

}
