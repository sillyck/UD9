
public class aula {

	protected int id;
	protected int aforo;
	protected Materia asignatura;
	protected static estudiantes alumnos[], chicos[], chicas[];
	protected static int contador = 0;

	public aula(int id, int aforo, Materia asignatura) {
		super();
		this.id = id;
		this.aforo = aforo;
		this.asignatura = asignatura;
		this.alumnos = new estudiantes[aforo];
		this.chicos = new estudiantes[aforo];
		this.chicas = new estudiantes[aforo];
	}

	public static void añadir(estudiantes a) {
		alumnos[contador] = a;
		contador++;
	}

	public static void chicosChicas() {
		int contH = 0, contM = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				if (alumnos[i].sexo.contains("H")) {
					chicos[contH] = alumnos[i];
					contH++;
				} else {
					chicas[contM] = alumnos[i];
					contM++;
				}
			}
		}

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

	public static int asistencia() {
		int contador = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				contador++;
			}
		}
		return contador;
	}

	public static void darClase(profesor p1, aula a1) {

		if (p1.noDispo == true) {
			if (p1.materia.equals(a1.asignatura)) {
				if (a1.aforo < (asistencia() * 2)) {
					System.out.println("La clase se puede realicar");
				} else {
					System.out.println("La clase no tiene mas de un 50% de asistencia");
				}
			} else {
				System.out.println("La clase no corresponde a su asignatura");
			}
		} else {
			System.out.println("El profesor no esta disponible");
		}
	}

	@Override
	public String toString() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		return "aula [id=" + id + ", aforo=" + aforo + ", asignatura=" + asignatura + "]";

	}
}
