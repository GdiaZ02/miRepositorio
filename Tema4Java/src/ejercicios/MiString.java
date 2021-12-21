package ejercicios;

public class MiString {
public static String alReves(String cadena) {
		String cad1="";
	for (int i=cadena.length()-1;i >= 0 ; i--) {
		cad1=cad1 + cadena.charAt(i);
		}
	return cad1;
}
public static String limpiaCaracteres(String cadena, String exp) {
     String[] salida = cadena.split(exp);
     String sol="";
     for(int i=0;i < salida.length ; i++) {
    	 sol+=salida[i];
     }
     return sol;
}
public static String quitaTildes(String cadena) {
	cadena=cadena.replace("á", "a");
	cadena=cadena.replace("é", "e");
	cadena=cadena.replace("í", "i");
	cadena=cadena.replace("ó", "o");
	cadena=cadena.replace("ú", "u");
	cadena=cadena.replace("Á", "A");
	cadena=cadena.replace("É", "E");
	cadena=cadena.replace("Í", "I");
	cadena=cadena.replace("Ó", "O");
	cadena=cadena.replace("Ú", "U");
	
	return cadena;
}
public static String quitaTildes2(String cadena) {
	String tildes= "áéíóúÁÉÍÓÚ";
	
	String sintildes="aeiouAEIOU";
	
	String cad="";
	
	char que;
	int pos;
	
	for (int i = 0; i < cadena.length(); i++) {
		pos=tildes.indexOf(cadena.charAt(i));
		tildes.indexOf(i);
		if(pos>-1) {
			cad+=sintildes.charAt(pos);
		}else {
			cad+=cad.charAt(i);
		}
	}
	
	return cad;
}
public boolean esPalindromo(String cad) {
	if (cad.equals(alReves(cad))) {
		return true;
	}
	return false;
}
public boolean esNumero(String cad) {
	char c;
	int contadorp=0;
	for (int i = 0; i < cad.length(); i++) {
		c=cad.charAt(i);
		if(i==0 && c!=45 && c!=43 && c!=46 && (c>47 || c<58)) {
			return false;
		}else if(i!=0) {
			if((c<47 || c>58) && c!=46) {
				return false;
			}
		}
		if(c==46) contadorp++;
		if (contadorp>1) {
			return false;
		}
	}
	return true;
}
}