package rutas;

public class Autoservicio extends PuntoInteres {
	TIPO tipo;
	String marca;
	
	public Autoservicio(int kilometro, TIPO tipo, String marca) {
		super(kilometro);
		this.tipo = tipo;
		this.marca = marca;
	}
	public TIPO getTipo() {
		return tipo;
	}
	public void setTipo(TIPO tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public static boolean isConGNC(Autoservicio auto) {
		return auto.tipo == TIPO.GNC  || auto.tipo == TIPO.NAFTAyGNC ; 
	}
	
	enum TIPO{
		GNC, NAFTA, NAFTAyGNC;
	}
}
