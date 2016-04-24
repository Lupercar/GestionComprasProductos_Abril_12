package entidades;

import java.util.Date;

public class Compra {
	private int codigo;
	private int cantidad;
	private Date fecha;
	private Producto producto;

	public Compra() {
	}

	public Compra(int codigo, int cantidad, Date fecha, Producto producto) {
		setCodigo(codigo);
		setCantidad(cantidad);
		setFecha(fecha);
		setProducto(producto);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public double getPrecioCompra() {
		return this.cantidad * this.producto.getPrecio();
	}
}
