
public class pruebaSobrecarga {

	public static void main(String[] args) {
		Sobrecarga sb=new Sobrecarga(4,5);
		System.out.println(sb.suma());
		System.out.println(sb.suma(4));
		String cad="hola caracola";
		String c1=cad.substring(0,4);
		String c2=cad.substring(5);
		System.out.println(c1);
		System.out.println(c2);
	}

}
