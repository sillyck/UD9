/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class profesor extends persona {
	protected Materia materia;
	protected boolean noDispo;
	
	
	//Constructor de profesor
	public profesor(String nombre,int edad,String sexo,Materia materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
		this.noDispo = faltas();
	}
	
	//Comprobar si asite o no con el 20%
	public static boolean faltas() {
		double nrandom;
		nrandom = Math.random()*10+0;//Genera un numero random entre 0 y 10
		
		if(nrandom >= 0 && nrandom <=2) {
			return false;
			
		}else if(nrandom >=3 && nrandom <= 10){
			return true;	
		}
		return false;
	}
	
	
	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", materia="+ materia+", noDispo= " + noDispo + "]";

	}
}
