package configuracion;
import java.io.File;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class CargaXML {
	/**
	 * Abre el archivo de rutas y carga las rutas como aristas en el grafo
	 */
	public static void abrirXMLRutas() {			
		try {
			File xmlRutas = new File("src/rutas.xml");
			//cargar y parsear el arcchivo xml
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document document = dBuilder.parse(xmlRutas);
			//obtiene el root
			document.getDocumentElement().normalize();
			//obtiene todos los puntos
			NodeList listaRutas = document.getElementsByTagName("Ruta"); 
		    //System.out.println("cantidad de rutas: "+listaRutas.getLength());			
			//por cada Ruta en la lista de Rutas
			for(int temp =0; temp<listaRutas.getLength();temp++) {
				Node nNode = listaRutas.item(temp);
				//si es un nodo
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					//creamos un elemento
					Element eElement = (Element) nNode;
					// @TODO definir si es PAVIMENTADA, RIPIO o EN CONSTRUCCION
					
					//mostramos cada propiedad y valro
					System.out.println("Origen : " 
						    + eElement.getElementsByTagName("Origen").item(0).getTextContent());
						System.out.println("Destino : " 
						    + eElement.getElementsByTagName("Destino").item(0).getTextContent());
						System.out.println("Distancia.Velocidad : " 
						    + eElement.getElementsByTagName("Velocidad").item(0).getTextContent());
						System.out.println("Distancia.Longitud : " 
						    + eElement.getElementsByTagName("Longitud").item(0).getTextContent());
						System.out.println("PuntoInteres: " 
						    + eElement.getElementsByTagName("PuntoInteres").item(0).getTextContent());

				}
			}

		}catch (Exception e){
			e.printStackTrace();
		}	

	}
	/**
	 * Abre el archivo de puntos y carga los puntos como vertices del grafo
	 */
	public static void abrirXMLPuntos() {
		try {
			File xmlPuntos = new File("src/puntos.xml");
			//cargar y parsear el arcchivo xml
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		    DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
		    Document document = documentBuilder.parse(xmlPuntos);
		    //obtiene el root
		    document.getDocumentElement().normalize();
		    //obtiene todos los puntos
		    NodeList listaPuntos = document.getElementsByTagName("Punto");
		    //System.out.println("cantidad de puntos: "+listaPuntos.getLength());
		    //por cada Punto en la lista de puntos
		    for(int temp = 0;temp<listaPuntos.getLength();temp++) {
		    	 //creamos un nodo desde este item
		    	 Node nNode = listaPuntos.item(temp);
		         //System.out.println("\nCurrent Element :" + nNode.getNodeName());
		    	 //si es un nodo
		    	 if(nNode.getNodeType() == Node.ELEMENT_NODE) {
		    		 //creamos un elemento
		    		 Element eElement = (Element) nNode;
		    		 //@TODO si es CIUDAD o ROTONDA
	    			 
		    		 //mostramos cada propiedad y valor de ese elemento
		    		 System.out.println("Nombres : " 
		                     + eElement.getElementsByTagName("Nombre").item(0).getTextContent());
		    		 System.out.println("Posicion.Latitud : " 
		                     + eElement.getElementsByTagName("Latitud").item(0).getTextContent());
		    		 System.out.println("Posicion.Longitud : " 
		                     + eElement.getElementsByTagName("Longitud").item(0).getTextContent());
		    		 System.out.println("Poblacion: " 
		                     + eElement.getElementsByTagName("CantidadHabitantes").item(0).getTextContent());
		    	 }
		    }
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
