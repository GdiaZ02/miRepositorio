package pq1;

public class Triangulo extends Forma2D {
	String style;

	double area() {
		return width * height / 2;
	}

	void showStyle() {
		System.out.println("Triangle is " + style);

	}

}
