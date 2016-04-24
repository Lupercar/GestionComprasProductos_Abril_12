package entidades;

public class Producto {
	private int codigo;
	private String nombre;
	private double precio;

	public Producto() {
		this(0, "", 0);
	}

	public Producto(int codigo, String nombre, double precio) {
		setCodigo(codigo);
		setNombre(nombre);
		setPrecio(precio);
	}

	public int getCodigo() {
		return this.codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[codigo=" + this.getCodigo() 
			+ ", nombre=" + this.getNombre() 
			+ ", precio=" + this.getPrecio() 
			+ "]";
	}

}
