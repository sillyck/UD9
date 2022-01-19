
public class estudiantes extends persona {
	protected int calificacion;
	protected boolean novillos;

	//Contructor de estudiantes
	public estudiantes(String nombre, int edad, String sexo, int calificacion) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
		this.novillos = novillosM();
	}
	
	//Metodo para compobar si asistira a clase o no con el 50%
	public static boolean novillosM() {
		double numero = Math.floor(Math.random()*10+ 0);//Genera numero random
		//System.out.println(numero);

		if (numero >= 0 && numero <= 5) {
			return false;
		} else if (numero > 5 && numero <= 10) {
			return true;
		}
		return false;	
	}
	
	//Filtrado de edad Estudiantes
	public boolean edad() {
		if (edad >= 18 && edad <= 30) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "estudiantes [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", califiacion=" + calificacion
				+ ", novillos="+novillos +"]";
	}

}
