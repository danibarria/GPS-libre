package gps;

import java.util.ArrayList;

import configuracion.CargaXML;
import puntos.*;
import rutas.*;

public class ProgramaGPS {

	public static void main(String[] args) {
		//lista de ciudades y puntos
		Punto.getListaCiudades();
		 //lista de rutas
		Ruta.getListaRutas();
		 //lista de coincidencias
		 ArrayList<Ruta> matches = new ArrayList<Ruta>();
		 
		 //los puntos y rutaas se generan por archivos xml
		 CargaXML.abrirXMLRutas();
		 CargaXML.abrirXMLPuntos();
		 //matches = Ruta.existeRuta(listaRutas, esquel,trelew);
		 //Ruta.tiempoEnLlegar(listaRutas, trelew, esquel);
		 //matches.forEach(item->System.out.println(item.toString()));
		 
		 //matches = Ruta.existeRuta(listaRutas, esquel,gaiman);
		 
		 //CargaXML.abrirXMLRutas();
		 //matches.forEach(item->System.out.println(item.toString()));
		 
	}

}
