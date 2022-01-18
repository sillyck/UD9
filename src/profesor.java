
public class profesor extends persona {
	protected String materia;

	public profesor(String nombre,int edad,String sexo,String materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
	}

	@Override
	public String toString() {
		return "profesor [materia=" + materia + "]";
	}
	
}
