
public class estudiantes extends persona {
	protected int calificacion;
	protected boolean novillos;

	public estudiantes(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
		this.novillos = novillosM();
	}

	public static boolean novillosM() {
		double numero = Math.floor(Math.random()*10+ 0);
		//System.out.println(numero);

		if (numero >= 0 && numero <= 5) {
			return false;
		} else if (numero > 5 && numero <= 10) {
			return true;
		}
		return false;
		
	}

	public String toString() {
		return "estudiantes [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", califiacion=" + calificacion
				+ ", novillos="+novillos +"]";
	}

}
