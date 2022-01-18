package pq1;

public class TestProvincia {

	public static void main(String[] args) {
		Provincia p1=new Provincia("Madrid","Madrid",5456,5589);
		System.out.println(p1);
		System.out.println("La densidad es "+p1.densidad());
		p1.muestra();
		ProvinciaCostera pc=new ProvinciaCostera("Almería","Andalucía",5000,1200,200);
		System.out.println(pc);
		pc.muestra();
		Provincia[] ps=new Provincia[2];
		ps[0]=p1;
		ps[1]=pc;
		for (Provincia p : ps) {
			p.muestra();
		}
		pc.getKmc();

	}

}
