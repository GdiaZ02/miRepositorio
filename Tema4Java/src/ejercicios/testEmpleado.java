package ejercicios;

public class testEmpleado {

	public static void main(String[] args) {
		Empleado e1=new Empleado("69");
		System.out.println("El empleado: "+e1.getNombre()+". Con número de teléfono: "+e1.getTelefono());
		Empleado e2=new Empleado("Juana","420");
		System.out.println(e2);
		System.out.println("Hay "+Empleado.getNumEmpleados()+" empleados");
		if(e1.sonIguales(e2)) {
			System.out.println("Son el mismo empleado");
		}else {
			System.out.println(e1.getNombre()+" y "+e2.getNombre()+" son distintos empleados");
		}
	}

}
