import java.util.Scanner;

public class pruebaCuenta {

	public static void main(String[] args) {
		Cuenta c1=new Cuenta("Gonzalo");
		Scanner sc=new Scanner(System.in);
		int op=-1;
		while (op!=4) {
			System.out.println("1.SALDO 2.INGRESAR 3.RETIRAR 4.SALIR");
			op=sc.nextInt();
		switch (op) {
		case 1:
			System.out.println("saldo actual: "+c1.getSaldo());
			break;
		case 2:
			System.out.println("Dime una cantidad a ingresar");
			double cantidad=sc.nextDouble();
			c1.ingresar(cantidad);
			break;
		case 3:
			System.out.println("Dime una cantidad a retirar");
			cantidad=sc.nextDouble();
			c1.retirar(cantidad);
			break;
		default:
			op=4;
			
			
		}
		}

	}

}
