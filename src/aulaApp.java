
public class aulaApp {

	public static void main(String[] args) {
		profesor p1 = new profesor("paco",32,"H","Matematicas");
		System.out.println(p1);
		estudiantes e1 = new estudiantes("paco",32,"H",1);
		estudiantes e2 = new estudiantes("a",32,"H",1);
		estudiantes e3 = new estudiantes("paaaaco",32,"H",1);
		estudiantes e4 = new estudiantes("pasdadco",32,"H",1);
		estudiantes e5 = new estudiantes("pddsfsadfaco",32,"H",1);
		estudiantes e6 = new estudiantes("pasafsdafsco",32,"H",1);
		int aforo=10;
		aula a1 = new aula(1,aforo,Materia.f�sica);
		a1.a�adir(e1);
		a1.a�adir(e2);
		a1.a�adir(e3);
		a1.a�adir(e4);
		a1.a�adir(e5);
		a1.a�adir(e6);
		
		System.out.println(a1);
		
		a1.chicosChicas();
		a1.lista();
	}

}
