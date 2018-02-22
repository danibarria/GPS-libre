package gps;

import java.util.ArrayList;

import puntos.*;
import rutas.*;

public class ProgramaGPS {

	public static void main(String[] args) {
		// Lista de ciudades o rotondas
		 ArrayList<Punto> listaCiudades = new ArrayList<Punto>();
		 //lista de rutas
		 ArrayList<Ruta> listaRutas = new ArrayList<Ruta>();
		 //lista de coincidencias
		 ArrayList<Ruta> matches = new ArrayList<Ruta>();
		 
		 Punto esquel = new Ciudad("Esquel", new Posicion(3,3),10100);
		 Punto trelew = new Ciudad("Trelew", new Posicion(3,3), 102000);
		 Punto gaiman = new Ciudad("Gaiman", new Posicion(3,3), 102000);
		 
		 Ruta esqueltrelew = new Ripio(esquel, trelew, new Distancia(3,3),null);
		 Ruta trelewesquel = new Pavimentada( trelew,esquel, new Distancia(3,3),null);
		 Ruta trelewesquel2 = new EnConstruccion( trelew,esquel, new Distancia(3,3),null);
		 
		 listaRutas.add(trelewesquel2);
		 listaRutas.add(trelewesquel);
		 listaRutas.add(esqueltrelew);
		 
		 matches = Ruta.existeRuta(listaRutas, esquel,trelew);

		 matches.forEach(item->System.out.println(item.toString()));
		 
		 matches = Ruta.existeRuta(listaRutas, esquel,gaiman);

		 matches.forEach(item->System.out.println(item.toString()));
	}

}
