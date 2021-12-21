
public class FDemo {
	int x;
	
	FDemo(int y){
		x=y;
		System.out.println("creado objeto"+x);
	}
	protected void finalize() {
		System.out.println("Finalizing"+x);
	}

}
