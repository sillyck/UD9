
public class aula {
	protected int id;
	protected int aforo;
	protected Materia asignatura;
	protected static estudiantes alumnos[];
	protected static int contador=0;
	
	public aula(int id, int aforo, Materia asignatura) {
		super();
		this.id = id;
		this.aforo = aforo;
		this.asignatura = asignatura;
		this.alumnos=new estudiantes[aforo];
	}
	public static void añadir(estudiantes a) {
		alumnos[contador]=a;
		contador++;
	}
	@Override
	public String toString() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		return "aula [id=" + id + ", aforo=" + aforo + ", asignatura=" + asignatura + "]";
		
	}
	
}
