package puntos;

public class Ciudad extends Punto {
	int cantidadHabitantes;

	
	
	public Ciudad(String nombre, Posicion posicion, int cantidadHabitantes) {
		super(nombre, posicion);
		this.cantidadHabitantes = cantidadHabitantes;
	}
	public int getCantidadHabitantes() {
		return cantidadHabitantes;
	}
	public void setCantidadHabitantes(int cantidadHabitantes) {
		this.cantidadHabitantes = cantidadHabitantes;
	}
	
	
}
