import java.util.Scanner;

public class pruebaCalculadora {

	public static void main(String[] args) {

		Calculadora c=new Calculadora();
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int opcion=0;
		do {
			System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Salir");
			opcion=sc.nextInt();
			n1=(int)(Math.random()*100);
			n2=(int)(Math.random()*100);
			c.setop1op2(n1, n2);
			switch (opcion) {
			case 1:
				System.out.println(c.toString());
				System.out.println();
				System.out.println(c.suma());
				System.out.println();
				break;
			case 2:
				System.out.println(c.toString());
				System.out.println();
				System.out.println(c.resta());
				System.out.println();
				break;
			case 3:
				System.out.println(c.toString());
				System.out.println();
				System.out.println(c.multiplicacion());
				System.out.println();
				break;
			case 4:
				System.out.println("El programa ha terminado");
				break;
			default:
				System.out.println("El número introducido no es una de las opciones");
				System.out.println();
					
			}
		}while(opcion!=4);

	}

}
