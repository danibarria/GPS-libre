package rutas;

public class Autoservicio extends PuntoInteres {
	String tipo;
	String marca;
	
	public Autoservicio(int kilometro, String tipo, String marca) {
		super(kilometro);
		this.tipo = tipo;
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
