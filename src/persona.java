
public class persona {
	protected String nombre;
	protected int edad;
	protected String sexo;
	public persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
}
