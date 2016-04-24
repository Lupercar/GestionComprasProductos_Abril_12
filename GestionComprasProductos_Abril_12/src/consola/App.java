/**
 * PAQUETE CONSOLA = PARTE VISUAL
 */
package consola;

import entidades.Producto;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Hola, mundo!!"; 
		System.out.println(cadena);
		
		Producto p1 = new Producto(); 
		p1.setCodigo(1);
		p1.setNombre("Producto 1");
		p1.setPrecio(2.00);
		
		Producto p2 = new Producto(); 
		p2.setCodigo(2);
		p2.setNombre("Producto 2");
		p2.setPrecio(3.00);
		
		System.out.println("Nombre del producto 1: "+p1.getNombre());
		System.out.println("Nombre del producto 2: "+p2.getNombre());
		
	}
}
