/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class persona {
	protected String nombre;
	protected int edad;
	protected String sexo;

	//Constructor persona
	public persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
}
