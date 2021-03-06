/**
 * PAQUETE CONSOLA = PARTE VISUAL
 */
package consola;

import java.util.Date;

import entidades.Compra;
import entidades.Producto;
import entidades.RepositorioCompras;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String cadena = "Hola, mundo!!";
//		System.out.println(cadena);
//
//		// Producto p1 = new Producto();
//		// p1.setCodigo(1);
//		// p1.setNombre("Producto 1");
//		// p1.setPrecio(2.00);
//
//		Producto p1 = new Producto(1, "Producto 1", 2.00);
//
//		Producto p2 = new Producto();
//		p2.setCodigo(2);
//		p2.setNombre("Producto 2");
//		p2.setPrecio(3.00);
//
//		System.out.println("Nombre del producto 1: " + p1.getNombre());
//		System.out.println("Nombre del producto 2: " + p2.getNombre());
//
//		Compra c1 = new Compra(1, 2, new Date(), p1);
//		System.out.println("Compra - ID: " + c1.getCodigo());
//		System.out.println("Compra - CANTIDAD: " + c1.getCantidad());
//		System.out.println("Compra - FECHA: " + c1.getFecha());
//		System.out.println("Compra - PRODUCTO: " + c1.getProducto());
//		System.out.println("Compra - PRECIO COMPRA: " + c1.getPrecioCompra()+"�");
		
		//comento todo y creo un repositorio de compras
		
		//creo primero 2 productos
		Producto p1 = new Producto(1,"Producto1",1.00);
		Producto p2 = new Producto(2,"Producto2",2.00);
		
		
		RepositorioCompras repo = new RepositorioCompras(); 
		
		//A�ado productos a RepositorioCompras
		repo.addProducto(p1);
		repo.addProducto(p2);
		
		//A�ado un compra
		repo.addCompra(p1, new Date(), 1);
		repo.addCompra(p2, new Date(), 2);
	}
}
