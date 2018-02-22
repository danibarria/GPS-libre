package rutas;

import java.util.Date;

import puntos.Punto;

public abstract class Ruta {
	Punto origen;
	Punto destino;
	Distancia distancia;
	PuntoInteres puntoInteres;

	protected Ruta(Punto origen, Punto destino, Distancia distancia, PuntoInteres puntoInteres) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.distancia = distancia;
		this.puntoInteres = puntoInteres;
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public Punto getDestino() {
		return destino;
	}

	public void setDestino(Punto destino) {
		this.destino = destino;
	}

	public Distancia getDistancia() {
		return distancia;
	}

	public void setDistancia(Distancia distancia) {
		this.distancia = distancia;
	}
	//cambiar a lista ordenada
	public PuntoInteres getPuntoInteres() {
		return puntoInteres;
	}
	//cambiar a lista ordenada
	public void setPuntoInteres(PuntoInteres puntoInteres) {
		this.puntoInteres = puntoInteres;
	}
	/**
	 * Dice cuanto tiempo tarda en llegar de origen a destino
	 * @param la distancia de origen a destino
	 */
	public static void tiempoEnLlegar(Distancia dist) {
		float tiempo = dist.getLongitud() / dist.getVelocidadMaxima();
		//String t = String.valueOf(tiempo);
		/**
		 * @TODO Ver clase DATE o TIME
		 */
		System.out.println();
	}
	
}
