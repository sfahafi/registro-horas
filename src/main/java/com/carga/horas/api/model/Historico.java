package com.carga.horas.api.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="historicos")
public class Historico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String descripcion;
	private Date fecha;
	
	@ManyToOne
	@JoinColumn(name="idHoras")
	private Hora hora;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Hora getHora() {
		return hora;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Historico [id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", hora=" + hora + "]";
	}
	
	
	
}
