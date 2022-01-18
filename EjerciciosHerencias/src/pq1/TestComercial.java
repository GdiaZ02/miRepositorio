package pq1;

public class TestComercial {

	public static void main(String[] args) {
		Comercial c1=new Comercial("Juan");
		System.out.println(c1.getCiudad());
		System.out.println(c1);
		
		Comercial c2=new Comercial("Pepa", 1234, 10000,"Barcelona","iphone,tableta,impresora");
		System.out.println(c2);
		System.out.println(c2.getCiudad());
		
		c2.vendeProductos("reloj");
		c2.sumarVenta(200.7f);
		System.out.println(c2);
		String[] ps= c2.getProductosVendidos();
		for (String string : ps) {
			System.out.println(string);
		}
	}

}
