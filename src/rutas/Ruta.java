package rutas;

import java.util.*;

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
	 * 
	 * Dice cuanto tiempo tarda en llegar de origen a destino
	 * Verifica si existe alguna ruta la ruta
	 * @param listaRutas  arraylist
	 * @param puntoOrigen punto de origen
	 * @param puntoDestino punto de 
	 */
	public static void tiempoEnLlegar(ArrayList<Ruta> listaRutas,Punto puntoOrigen, Punto puntoDestino) {
		ArrayList<Ruta> aux = existeRuta(listaRutas, puntoOrigen,puntoDestino);
		if(aux.size()>0) {//si hay elementos
			aux.forEach(item->tiempo(item));
			//System.out.println("No existe ruta entre " +puntoOrigen.getNombre()+" y " + puntoDestino.getNombre());
		}else {
			System.out.println("No existe ruta entre " +puntoOrigen.getNombre()+" y " + puntoDestino.getNombre());
		}
		//float tiempo = dist.getLongitud() / dist.getVelocidadMaxima();
		
	}
	/**
	 * tiempo de una ruta para llegar de un origen a un destino
	 * @param ruta la ruta de 
	 */
	private static void tiempo(Ruta ruta) {
		float route = ruta.distancia.getLongitud(); // [km]
        float speed = ruta.distancia.getVelocidadMaxima(); // [km/h]
        float time =  route / speed;
        int hours = (int) time;
        int minutes = (int) (60 * (time - hours));

        System.out.println(hours + "h " + minutes + "m " );
	}
	/**
	 * Recibe una lista de rutas, un punto de origen y otro de destino, verifica si existe
	 * una o mas rutas hacia 
	 * @param listaRutas  lista de rutas disponibles
	 * @param puntoOrigen  punto de origen
	 * @param puntoDestino punto de destin
	 * @return una lista vacia si no existe, sino una lista con todas las rutas disponibles
	 */
	public static ArrayList<Ruta> existeRuta(ArrayList<Ruta> listaRutas,Punto puntoOrigen, Punto puntoDestino){
		ArrayList<Ruta> listaFinal = new ArrayList <Ruta>();
		listaRutas.forEach(item->{
			if((item.origen == puntoOrigen && item.destino== puntoDestino)
					|| (item.origen == puntoDestino && item.destino== puntoOrigen )) {
				listaFinal.add(item);
			}
		});		
		return listaFinal;
	}
}
