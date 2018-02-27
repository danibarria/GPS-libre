package gps;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.LinkedList;
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
		 Grafo grafo = new Grafo(puntos,caminos);
		 Dijkstra dijkstra = new Dijkstra(grafo);
		 dijkstra.execute(puntos.get(2));
		 LinkedList<Vertice> path = dijkstra.getPath(puntos.get(0));
		 assertNotNull(path);
		 assertTrue(path.size() > 0);
		 
		 for(Vertice vertex : path) {
			 System.out.println(vertex);
		 }
	}

}
