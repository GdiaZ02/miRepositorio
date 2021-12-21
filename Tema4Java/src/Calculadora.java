
public class Calculadora {

private int op1;
private int op2;

public Calculadora () {
}
public void setop1(int nuevo) {//setter
	op1=nuevo;
}
public void setop2(int nuevo) {//setter
	op2=nuevo;
}
public void setop1op2(int nuevo1, int nuevo2) {
	op1=nuevo1;
	op2=nuevo2;
}
public int getop1() {//getter
	return op1;
}
public int getop2() {//getter
	return op2;
}
public int suma() {
	return op1+op2;
}
public int resta() {
	return op1-op2;
}
public int multiplicacion() {
	return op1*op2;
}
public String toString() {
	return "Los números actualmente son: ["+op1+" "+op2+"]";
}
}
