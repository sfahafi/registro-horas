package com.carga.horas.api.model;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="horas")
public class Hora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Temporal(TemporalType.TIME)
	private Date horaEntrada;
	
	@Temporal(TemporalType.TIME)
	private Date horaSalida;
	
	@Temporal(TemporalType.TIME)
	private Date horaExtra;
	
	private String estatus;
	private String comentario;
	private String comentarioSup;
	
	@ManyToOne
	@JoinColumn(name="nLegajo")
	private Usuario usuario;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Date getHoraEntrada() {
		return horaEntrada;
	}
	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public Date getHoraSalida() {
		return horaSalida;
	}
	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}
	public Date getHoraExtra() {
		return horaExtra;
	}
	public void setHoraExtra(Date horaExtra) {
		this.horaExtra = horaExtra;
	}
	public String getEstatus() {
		return estatus;
	}
	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getComentarioSup() {
		return comentarioSup;
	}
	public void setComentarioSup(String comentarioSup) {
		this.comentarioSup = comentarioSup;
	}


	@Override
	public String toString() {
		return "Hora [id=" + id + ", fecha=" + fecha + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida
				+ ", horaExtra=" + horaExtra + ", estatus=" + estatus + ", comentario=" + comentario
				+ ", comentarioSup=" + comentarioSup + ", usuario=" + usuario + "]";
	}
	
}
