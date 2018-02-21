package rutas;

public abstract class PuntoInteres {
	//en q kilometro se encuentra el ppunto
	int kilometro;

	public int getKilometro() {
		return kilometro;
	}

	public void setKilometro(int kilometro) {
		this.kilometro = kilometro;
	}

	protected PuntoInteres(int kilometro) {
		super();
		this.kilometro = kilometro;
	}

	
	
}
