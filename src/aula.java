
public class aula {

	protected int id;
	protected int aforo;
	protected Materia asignatura;
	protected static estudiantes alumnos[], chicos[], chicas[];
	protected static int contador=0;
	
	public aula(int id, int aforo, Materia asignatura) {
		super();
		this.id = id;
		this.aforo = aforo;
		this.asignatura = asignatura;
		this.alumnos=new estudiantes[aforo];
		this.chicos=new estudiantes[aforo];
		this.chicas=new estudiantes[aforo];
	}
	public static void añadir(estudiantes a) {
		alumnos[contador]=a;
		contador++;
	}
	
	public static void chicosChicas() {
		int contH=1, contM=1;
		
		for(int i=0;i<alumnos.length;i++) {
			if(alumnos[i].sexo.contains("H")) {
				chicos[contH]=alumnos[i];
				contH++;
			}else {
				chicas[contM]=alumnos[i];
				contM++;
			}
		}
		
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		return "aula [id=" + id + ", aforo=" + aforo + ", asignatura=" + asignatura + "]";
		
	}
	
	public static void lista() {
		
		System.out.println("Lista chicos:");
		for (int i = 0; i < chicos.length; i++) {
			System.out.println(chicos[i]);
		}
		
		System.out.println("\nLista chicas:");
		for (int i = 0; i < chicas.length; i++) {
			System.out.println(chicas[i]);
		}
	}
}
