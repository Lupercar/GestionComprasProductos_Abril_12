package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * RepositorioCompras aplica el patrón JavaBeans Propiedades privadas
 * Constructor sin parámetros Getter-setter públicos
 * 
 * @author JLGG
 *
 */
public class RepositorioCompras {
	private List<Producto> productos = new ArrayList<Producto>(); // con Java6
																	// es
																	// obligatorio
	private List<Compra> compras = new ArrayList<>();

	public RepositorioCompras() {
	}

	public List<Producto> getProductos() {
		return this.productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Compra> getCompras() {
		return this.compras;
	}

	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}

	public void addCompra(Producto producto, Date fecha, int cantidad) {
		Compra compra = new Compra(nuevoCodigoCompra(), cantidad, fecha, producto); // nos
																					// falta
																					// el
																					// código
		addCompra(compra);
	}

	private int nuevoCodigoCompra() {
		int codigo = 0;
		if (compras.isEmpty()) // comprobamos si lista vacía, me lo puedo
								// ahorrar
			codigo++;
		else {
			// 1. Recorrer compras buscando el valor de código máximo
			for (Compra p : compras) { // for ampliado o bucle for each

				if (p.getCodigo() > codigo) // Si el código del producto es
											// superior
											// al que tenemos, actualizamos el
											// valor.
					codigo = p.getCodigo();

			}
			// 2. Sumamos uno a ese valor de código máximo.
			codigo++; // equivalente a -> codigo = codigo + 1;

		}
		// 3. Retornamos el valor del código
		return codigo;
	}

	private void addCompra(Compra compra) {
		compras.add(compra);
	}

	public void addProducto(Producto producto) {
		// comprobar que el producto sea válido (que apunte a algún sitio o sea
		// != null)
		if (producto != null) {

			// miramos que no exista ya
			if (!existeProducto(producto)) {
				// Sino existe añado el Producto
				productos.add(producto);
			} else
				System.err.println("Producto ya existe."); //err canal de error
		} else
			System.err.println("Producto no válido.");//err texto en color rojo
	}

	private boolean existeProducto(Producto producto) {
		boolean retorno = false;

		for (Producto p : productos) {
			if (producto.getCodigo() == p.getCodigo())
				retorno = true; // si son iguales existe por tanto es true
		}
		return retorno;
	}
}
