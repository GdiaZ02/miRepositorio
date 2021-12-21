package ejercicios;

public class pruebaVeh�culo {

	public static void main(String[] args) {
		Veh�culo moto=new Veh�culo(2,150,200);
		Veh�culo coche=new Veh�culo(4,200,1450);
		Veh�culo camion=new Veh�culo(16,130,3550);
		Veh�culo fantasma=new Veh�culo(0,0,0);

		System.out.println(moto.informaci�n());
		System.out.println(coche.informaci�n());
		System.out.println(camion.informaci�n());
		
		if (moto.esigual(camion)) {
			System.out.println("Me quedo con la moto");
		}else {
			System.out.println("Me quedo con el cami�n");
		}
		
		fantasma.copia2(moto);
		if (moto.esigual(fantasma)) {
			System.out.println("Me quedo con la moto");
		}else {
			System.out.println("Me quedo con el cami�n");
		}
		Veh�culo avion =moto.copia3();
		
		System.out.println(avion.informaci�n());
		
		Veh�culo z=avion;
		
		z.setNumRuedas(100);
		
		System.out.println(avion.informaci�n());
	}

}
