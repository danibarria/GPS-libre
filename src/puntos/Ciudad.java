package puntos;

public class Ciudad extends Punto {
	int cantidadHabitantes;

	public Ciudad(String nombre, Posicion posicion) {
		super(nombre, posicion);
		// TODO Auto-generated constructor stub
	}
	
	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}
	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}
	
	
}
