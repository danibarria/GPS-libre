package gps;

import java.util.ArrayList;
import java.util.List;

import configuracion.CargaXML;
import puntos.*;
import rutas.*;
import grafo.*;

public class ProgramaGPS {

	public static void main(String[] args) {
		//lista de ciudades y puntos
		//Punto.getListaCiudades();
		 //lista de rutas
		//Ruta.getListaRutas();
		 //lista de coincidencias
		 //ArrayList<Ruta> matches = new ArrayList<Ruta>();
		 List<Vertice> puntos = new ArrayList<Vertice>();
		 List<Arista> caminos = new ArrayList<Arista>();
		 //los puntos y rutaas se generan por archivos xml
		 //CargaXML.abrirXMLRutas();
		 //CargaXML.abrirXMLPuntos();
		 //matches = Ruta.existeRuta(listaRutas, esquel,trelew);
		 //Ruta.tiempoEnLlegar(listaRutas, trelew, esquel);
		 //matches.forEach(item->System.out.println(item.toString()));
		 
		 //matches = Ruta.existeRuta(listaRutas, esquel,gaiman);
		 
		 //CargaXML.abrirXMLRutas();
		 //matches.forEach(item->System.out.println(item.toString()));
		 CargaXML.cargarXMLPuntos(puntos);
		 CargaXML.cargarXMLAristas(caminos);
		 //puntos.forEach(item->System.out.println(item.toString()));
		 caminos.forEach(tiem->System.out.println(tiem.toString()+" "+tiem.getDestination().getName()
				 + tiem.getSource().getId()
				 ));
		 
	}

}
