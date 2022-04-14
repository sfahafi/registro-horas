package com.carga.horas.api.model;

import javax.persistence.*;

@Entity
@Table(name="perfiles")
public class Perfil {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String perfil;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="idUsuario", referencedColumnName = "id")
	private Usuario usuario;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + ", usuario=" + usuario + "]";
	}

	
	
	
	
}
