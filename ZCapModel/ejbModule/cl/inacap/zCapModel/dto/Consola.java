package cl.inacap.zCapModel.dto;

import java.util.List;

public class Consola {
	
	private String nombre;
	private String marca;
	private int anioLanzamiento;
	private List<juego> juegos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAnioLanzamiento() {
		return anioLanzamiento;
	}
	public void setAnioLanzamiento(int anioLanzamiento) {
		this.anioLanzamiento = anioLanzamiento;
	}
	public List<juego> getJuegos() {
		return juegos;
	}
	public void setJuegos(List<juego> juegos) {
		this.juegos = juegos;
	}
	
}
