package pq1;

public class PruebaEmpleado {

	public static void main(String[] args) {
		Empleado[] emps=new Empleado[5];
		emps[0]= new Empleado("Pepe");
		Empleado e1=new Empleado("juan",69);
		emps[1]=e1;
		Programador p1=new Programador("Jc",222,"java","python");
		emps[2]=p1;
		Programador p2=new Programador("Marc",420);
		emps[3]=p2;
		emps[4]=new Programador("María",1234,"php","prolog","java","c#");
		for (Empleado e : emps) {
			System.out.println(e);
		}
		Programador[] misprog=new Programador[4];

	}

}
