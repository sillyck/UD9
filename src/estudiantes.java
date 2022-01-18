
public class estudiantes extends persona {
	protected int calificacion;
	public estudiantes(String nombre,int edad,String sexo,int calificacion) {
		super(nombre,edad,sexo);
		this.calificacion=calificacion;
	}
	@Override
	public String toString() {
		return "estudiantes [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", califiacion="+ calificacion+"]";
	}

	
}
