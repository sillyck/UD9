
public class aulaApp {

	public static void main(String[] args) {
		profesor p1 = new profesor("Isma", 32, "H", Materia.filosofía);
		profesor p2 = new profesor("Manuel", 32, "H", Materia.física);
		profesor p3 = new profesor("Federico", 32, "H", Materia.matemáticas);
		System.out.println(p1);
		estudiantes e1 = new estudiantes("Paco", 24, "H", 1);
		estudiantes e2 = new estudiantes("Alba", 19, "M", 5);
		estudiantes e3 = new estudiantes("Jose", 22, "H", 6);
		estudiantes e4 = new estudiantes("Laura", 28, "H", 4);
		estudiantes e5 = new estudiantes("Maria", 18, "M", 8);
		estudiantes e6 = new estudiantes("Isabel", 19, "M", 9);
		int aforo = 10;
		aula a1 = new aula(1, aforo, Materia.física);
		a1.añadir(e1);
		a1.añadir(e2);
		a1.añadir(e3);
		a1.añadir(e4);
		a1.añadir(e5);
		a1.añadir(e6);
		aforo = 15;
		aula a2 = new aula(1, aforo, Materia.matemáticas);
		a2.añadir(e1);
		a2.añadir(e2);
		a2.añadir(e3);
		a2.añadir(e4);
		a2.añadir(e5);
		a2.añadir(e6);

		//System.out.println(a1);
		
		
		aula.darClase(p1, a1);
		aula.darClase(p2, a1);
		aula.darClase(p3, a1);
		aula.darClase(p1, a2);
		aula.darClase(p2, a2);
		aula.darClase(p3, a2);
	}

}
