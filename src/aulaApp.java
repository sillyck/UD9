
public class aulaApp {

	public static void main(String[] args) {
		persona p1 = new profesor("paco",32,"H","Matematicas");
		System.out.println(p1);
		persona e1 = new estudiantes("paco",32,"H",1);
		System.out.println(e1);
		aula a1 = new aula(1,15,Materia.física);
		System.out.println(a1);
	}

}
