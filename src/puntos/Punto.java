package puntos;

import java.util.ArrayList;

public abstract class Punto {
	String nombre;
	Posicion posicion;
	
	protected Punto(String nombre, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	// Lista de ciudades o rotondas
	static ArrayList<Punto> listaCiudades = new ArrayList<Punto>();

	public static ArrayList<Punto> getListaCiudades() {
		return listaCiudades;
	}
	/**
	 * revisar
	 * @param listaCiudades
	 */
	public static void setListaCiudades(ArrayList<Punto> listaCiudades) {
		Punto.listaCiudades = listaCiudades;
	}

	
}
