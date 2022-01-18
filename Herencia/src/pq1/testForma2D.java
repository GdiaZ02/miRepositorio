package pq1;

public class testForma2D {

	public static void main(String[] args) {
		Forma2D miforma=new Forma2D();
		miforma.height=1.3;
		miforma.width=12.5;
		miforma.showDim();
		Triangulo t1=new Triangulo();
		t1.height=2.3;
		t1.width=3.4;
		t1.style="doble continuo";
		t1.showDim();
		t1.showStyle();
		System.out.println(t1.area());

	}

}
