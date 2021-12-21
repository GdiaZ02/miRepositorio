package ejercicios;

public class pruebaMiString {

	public static void main(String[] args) {
		String cad="a á e é í i O Ó U Ú";
		String cad2="1234";
		System.out.println(MiString.alReves(cad));
		
		System.out.println(MiString.limpiaCaracteres(cad, " "));
		
		System.out.println(MiString.quitaTildes(cad));
		System.out.println(MiString.quitaTildes2(cad));
		System.out.println();
	}
}
