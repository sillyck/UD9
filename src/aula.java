
public class aula {

	protected int id;
	protected int aforo;
	protected Materia asignatura;
	protected static estudiantes alumnos[], chicos[], chicas[];
	protected static int contador = 0;

	// Constructor de aula
	public aula(int id, int aforo, Materia asignatura) {
		super();
		this.id = id;
		this.aforo = aforo;
		this.asignatura = asignatura;
		this.alumnos = new estudiantes[aforo];
		this.chicos = new estudiantes[aforo];
		this.chicas = new estudiantes[aforo];
	}

	// Añadimos los alumnos a una array vacia con un contador estatico
	public static void añadir(estudiantes a) {
		alumnos[contador] = a;
		contador++;
	}

	// Metodo para separa chicos y chicas
	public static void chicosChicas() {

		int contH = 0, contM = 0;
		for (int i = 0; i < alumnos.length; i++) {// Recorremos todos los alumnos
			if (alumnos[i] != null) {// Si la posicion de la array no esta vacia
				if (alumnos[i].sexo.contains("H")) {// Y si el sexo es Hombre
					chicos[contH] = alumnos[i];// Añadimos al alumno a una array nueva de solo chicos
					contH++;// Aumentamos el contador estatico de chicos
				} else {// o femenino
					chicas[contM] = alumnos[i];// Añadimos al alumno a una array nueva de solo chicas
					contM++;// Aumentamos el contador estatico de chicas
				}
			}
		}
		lista();// Llamamos al metodo lista
	}

	// Metodo para mostrar a los alumnos separados por sexo y solo los aprovados
	public static void lista() {

		System.out.println("Lista chicos:");
		for (int i = 0; i < chicos.length; i++) {// Recorremos todos los chicos
			if (chicos[i] != null) {// Si la posicion de la array no esta vacia
				if (chicos[i].calificacion >= 5) {// comprobamos que esten apovados
					System.out.println(chicos[i]);
				}
			}
		}

		System.out.println("\nLista chicas:");
		for (int i = 0; i < chicas.length; i++) {// Recorremos todos las chicas
			if (chicos[i] != null) {// Si la posicion de la array no esta vacia
				if (chicas[i].calificacion >= 5) {// comprobamos que esten apovadas
					System.out.println(chicas[i]);
				}
			}
		}
	}

	// comprobamos los alumnos que estan apuntados
	public static int asistencia() {
		int contador = 0;
		for (int i = 0; i < alumnos.length; i++) {// Recorremos todos los alumnos
			if (alumnos[i] != null) {// Si la posicion de la array no esta vacia
				contador++;
			}
		}
		return contador;
	}

	// Metodo para comprovar si se podra dar clase
	public static void darClase(profesor p1, aula a1) {

		if (p1.noDispo == true) {// Comprueba si esta disponible el profesor
			if (p1.materia.equals(a1.asignatura)) {// Comprueba si la asignatura es la correcta
				if (a1.aforo < (asistencia() * 2)) {// Y si la asistencia es mas de la mitad
					System.out.println("La clase se puede realizar");
					chicosChicas();
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

	// Metodo para mostrar toda la informacion los alumnos y la clase
	@Override
	public String toString() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i]);
		}
		return "aula [id=" + id + ", aforo=" + aforo + ", asignatura=" + asignatura + "]";

	}
}
