package rutas;

public class Distancia {
	float longitud;
	float velocidadMaxima;
	
	public Distancia(float longitud, float velocidadMaxima) {
		super();
		this.longitud = longitud;
		this.velocidadMaxima = velocidadMaxima;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
}
