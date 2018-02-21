package prueba;

import puntos.*;
import rutas.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Posicion p = new Posicion(0, 0);
		Distancia d = new Distancia(0, 0);
		PuntoInteres pInt1 = new Alojamiento(0, 0, null, false);
		PuntoInteres pInt2 = new Autoservicio(0, null, null);
		Ruta pavimentada = new Pavimentada(null, null, d, pInt2);
		Ruta construccion = new EnConstruccion(null, null, d, pInt2);
		Ruta ripio = new Ripio(null, null, d, pInt2);
		Punto ciudad = new Ciudad(null, p);
		Punto rotonda = new Rotonda(null, p, 0);
	}

}
