
public class Sobrecarga {
private int a;
private int b;
public Sobrecarga(int x1, int x2) {
	a=x1;
	b=x2;
}
public int suma() {
	return a+b;
}
public int suma(int c) {
	return a-b+c;
}
}
