
public class testInstituto {

	public static void main(String[] args) {
		String[]ense= {"grado superior", "grado medio"};
		Instituto i1=new Instituto("IES La Paloma","público",ense,"aa",2000);
		System.out.println(i1.toString());
		Instituto i2 =new Instituto("lope de vega","público","abc");
		System.out.println(i2.toString());
		i2.setNumAls(725);
		System.out.println(i2.toString());

	}

}
