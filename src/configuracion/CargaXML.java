package configuracion;

import grafo.*;

import java.io.File;
import java.util.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class CargaXML {
	
	public static List<Arista> cargarXMLAristas(List<Arista> aristas){
		try {
			File xmlPuntos = new File("src/rutas.xml");
			//cargar y parsear el archivo xml
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(xmlPuntos);
			//obtiene nodo root
			document.getDocumentElement().normalize();
			//obtiene todos los puntos
			NodeList listaPuntos = document.getElementsByTagName("Ruta");
			//por caa Punto en la lista de puntos
			for(int temp =0;temp<listaPuntos.getLength();temp++) {
				//creamos un nodo desde este item
				Node nodo = listaPuntos.item(temp);
				//si es un nodo
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					//creamos elemento
					Element elemento = (Element) nodo;
					Arista camino = new Arista(
							"Ruta:" +
							elemento.getElementsByTagName("Origen").item(0).getTextContent()+"-"+
							elemento.getElementsByTagName("Destino").item(0).getTextContent(),
							
							new Vertice(elemento.getElementsByTagName("Origen").item(0).getTextContent()
									,elemento.getElementsByTagName("Origen").item(0).getTextContent()
									), 
							new Vertice(elemento.getElementsByTagName("Destino").item(0).getTextContent()
									,elemento.getElementsByTagName("Destino").item(0).getTextContent()
									),
							
							Integer.valueOf(elemento.getElementsByTagName("Longitud").item(0).getTextContent())
							
									 
							);
					aristas.add(camino);					
				}
			}
			return aristas;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return aristas;
	}
	
	
	public static List<Vertice> cargarXMLPuntos(List<Vertice> nodos) {
		//List<Vertice> lNodos = null ;
		try {
			File xmlPuntos = new File("src/puntos.xml");
			//cargar y parsear el archivo xml
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(xmlPuntos);
			//obtiene nodo root
			document.getDocumentElement().normalize();
			//obtiene todos los puntos
			NodeList listaPuntos = document.getElementsByTagName("Punto");
			//por caa Punto en la lista de puntos
			for(int temp =0;temp<listaPuntos.getLength();temp++) {
				//creamos un nodo desde este item
				Node nodo = listaPuntos.item(temp);
				//si es un nodo
				if(nodo.getNodeType() == Node.ELEMENT_NODE) {
					//creamos elemento
					Element elemento = (Element) nodo;
					Vertice punto = new Vertice(elemento.getElementsByTagName("Nombre").item(0).getTextContent(), elemento.getElementsByTagName("Nombre").item(0).getTextContent());
					nodos.add(punto);					
				}
			}
			return nodos;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return nodos;
	}
	
}
