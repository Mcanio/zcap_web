package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class juego {

	private String nombre;
	private String descripcion;
	private boolean aptoNinios;
	private int precio;
	private LocalDate fechaLanzamiento;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isAptoNinios() {
		return aptoNinios;
	}
	public void setAptoNinios(boolean aptoNinios) {
		this.aptoNinios = aptoNinios;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechaLanzamiento() {
		return fechaLanzamiento;
	}
	public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}
	
	}
