package puntos;

public class Rotonda extends Punto {
	static int autonumerico = 0;
	int numeroUnico;
	
	public Rotonda(String nombre, Posicion posicion, int numeroUnico) {
		super(nombre, posicion);
		this.numeroUnico = autonumerico;
		autonumerico++; 
	}

	public int getNumeroUnico() {
		return numeroUnico;
	}

	public void setNumeroUnico(int numeroUnico) {
		this.numeroUnico = numeroUnico;
	}
	
	
}
