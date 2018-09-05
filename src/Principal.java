import java.util.Scanner;

import categoria.control.categorias;
import categoria.view.CategoriaView;
import producto.control.Productos;
import producto.view.ProductoView;

public class Principal {

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			categorias categorias = new categorias(10);
			Productos productos = new Productos(10);
			
			ProductoView productoView = new ProductoView(productos,categorias, scanner);
			CategoriaView categoriaView = new CategoriaView(categorias,productos, scanner);
			categoria.view.CategoriaMenu.menu(scanner, categoriaView);
			producto.view.ProductoMenu.menu(scanner, productoView);
			

			scanner.close();
		}
	}


