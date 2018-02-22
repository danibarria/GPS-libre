package rutas;

public class Alojamiento extends PuntoInteres {
	int estrellas;
	String nombre;
	boolean cochera;
	
	public Alojamiento(int kilometro, int estrellas, String nombre, boolean cochera) {
		super(kilometro);
		this.estrellas = estrellas;
		this.nombre = nombre;
		this.cochera = cochera;
	}
	public int getEstrellas() {
		return estrellas;
	}
	public void setEstrellas(int estrellas) {
		this.estrellas = estrellas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCochera() {
		return cochera;
	}
	public void setCochera(boolean cochera) {
		this.cochera = cochera;
	}
	
	
}
