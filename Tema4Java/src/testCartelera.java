
public class testCartelera {

	public static void main(String[] args) {
		Cartelera c=new Cartelera(2);
		Pelicula p1=new Pelicula("hmm: the movie","drama",90);
		p1.agregar("bardem");
		p1.agregar("inma");
		Pelicula p2=new Pelicula("max","drama",80);
		c.agregarPelicula(p2, null);

	}

}
