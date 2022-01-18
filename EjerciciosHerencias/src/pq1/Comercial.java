package pq1;

public class Comercial extends Empleado{

	private float totalVentas;
	private String ciudad;
	private String productosVendidos;
	
	public Comercial(String nombre, int telefono, float totalVentas, String ciudad, String productosVendidos) {
		super(nombre, telefono);
		this.totalVentas = totalVentas;
		this.ciudad = ciudad;
		this.productosVendidos = productosVendidos;
	}

	public Comercial(String nombre) {
		super(nombre);
		
	}
	public String getCiudad() {
		if(ciudad==null) {
			ciudad="Ciudad desconocida";
		} 
		return ciudad;
	}
	public void sumarVenta(float importe) {
		totalVentas+=importe;
	}
	
	public float getTotalVentas() {
		return totalVentas;
	}
	
	public void vendeProductos(String producto) {
		if(productosVendidos==null) {
			productosVendidos=producto;
		}else {
			productosVendidos+=","+producto;
		}
	}
	
	public String[] getProductosVendidos() {
		return productosVendidos.split(",");
	}

	@Override
	public String toString() {
		return "nombre="+super.getNombre()+" Comercial [totalVentas=" + totalVentas + ", ciudad=" + ciudad + ", productosVendidos="
				+ productosVendidos + "]";
	}
	

}
