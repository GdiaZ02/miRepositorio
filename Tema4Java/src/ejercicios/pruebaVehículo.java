package ejercicios;

public class pruebaVehículo {

	public static void main(String[] args) {
		Vehículo moto=new Vehículo(2,150,200);
		Vehículo coche=new Vehículo(4,200,1450);
		Vehículo camion=new Vehículo(16,130,3550);
		Vehículo fantasma=new Vehículo(0,0,0);

		System.out.println(moto.información());
		System.out.println(coche.información());
		System.out.println(camion.información());
		
		if (moto.esigual(camion)) {
			System.out.println("Me quedo con la moto");
		}else {
			System.out.println("Me quedo con el camión");
		}
		
		fantasma.copia2(moto);
		if (moto.esigual(fantasma)) {
			System.out.println("Me quedo con la moto");
		}else {
			System.out.println("Me quedo con el camión");
		}
		Vehículo avion =moto.copia3();
		
		System.out.println(avion.información());
		
		Vehículo z=avion;
		
		z.setNumRuedas(100);
		
		System.out.println(avion.información());
	}

}
