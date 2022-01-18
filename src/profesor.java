
public class profesor extends persona {
	protected String materia;
	protected boolean noDispo;
	
	public static boolean faltas() {
		double nrandom;
		nrandom = Math.random()*10+0;
		
		if(nrandom >= 0 && nrandom <=2) {
			return false;
			
		}else if(nrandom >=3 && nrandom <= 10){
			return true;
			
		}
		
		return true;
	}
	
	public profesor(String nombre,int edad,String sexo,String materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
		this.noDispo = faltas();
	}
	
	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", materia="+ materia+", noDispo= " + noDispo + "]";

	}
}
