package recursividad;

public class Numeros {
	public static int calculaPotenciaR(int base, int exp) { // >=0
		int sol;
		if (exp == 0) {
			return 1;
		}
		sol = base * calculaPotenciaR(base, exp - 1);
		return sol;
	}

	public static String inversoR(String pal) {
		String sol="";
		String aux;
		if(pal.length()==0||pal.length()==1) {
			sol=pal;
		}else {
			aux=pal.substring(pal.length()-1,pal.length());
			sol=aux+inversoR(pal.substring(0,pal.length()-1));
		}
		return sol;
	}
}
