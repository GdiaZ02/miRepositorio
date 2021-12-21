
public class Circulo {
	private double rad;
/**
 * 
 * @param radio
 */
	public Circulo(double radio) {
		this.rad = radio;
	}

	public double getRad() {
		return rad;
	}
/**
 * 
 * @param rad
 */
	public void setRad(double rad) {
		this.rad = rad;
	}

	public void imprimir() {
		String color = "rojo";
		System.out.println("Diametro: " + 2 * rad);
		System.out.println("Color: " + color);
		double area = 2 * 3.1416 * rad * rad;
		System.out.println(area);
	}
/**
 * 
 * @param otro
 * @param conDecimales
 * @return
 */
	public boolean esIgual(Circulo otro, boolean conDecimales) {
		double radio1 = this.rad;
		double radio2 = otro.getRad();
		if (conDecimales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}
