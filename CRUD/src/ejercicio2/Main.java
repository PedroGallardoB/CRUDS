package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static String descripcion = "";
	private static String codigo = "";
	private static double precioCompra = 0;
	private static double precioVenta = 0;
	private static int cantidad = 0;

	public static void main(String[] args) {

		boolean salir = false;
		boolean encontrado = false;
		int opcion = 0;
		Producto productos[] = new Producto[0];
		Scanner sc = new Scanner(System.in);

		while (!salir) {
			System.out.println("______________________________");
			System.out.println("| 1) LISTADO                  |");
			System.out.println("| 2) DAR DE ALTA              |");
			System.out.println("| 3) DAR DE BAJA              |");
			System.out.println("| 4) MODIFICACIÓN             |");
			System.out.println("| 5) ENTRADA DE MERCANCIA     |");
			System.out.println("| 6) SALIDA DE MERCANCIA      |");
			System.out.println("| 7) SALIR                    |");
			System.out.println("|_____________________________|");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1 -> {
				for (int i = 0; i < productos.length; i++) {
					if (productos[i] != null) {
						System.out.println(productos[i].toString());
					}
				}
			}

			case 2 -> {
				for (int i = 0; i < productos.length; i++) {

					if (productos[i] == null) {
						productos[i] = NuevoProducto();
						encontrado = true;
						break;
					}
				}
				if (!encontrado) {
					productos = Arrays.copyOf(productos, productos.length + 1);
					productos[productos.length - 1] = NuevoProducto();
				}
				encontrado = false;
			}

			case 3 -> {
				System.out.println("¿Qué producto quiere eliminar, introduzca el código?");
				codigo = sc.next();
				for (int i = 0; i < productos.length; i++) {

					if (productos[i].getCodigo() == codigo) {
						productos[i] = null;
						encontrado = true;
						break;
					}
					if (encontrado) {
						System.out.println("!Encontrado correctamente!");
					} else {
						System.out.println("!No existe el producto!");
					}

					encontrado = false;
				}

			}
			case 4 -> {
				System.out.println("Introduzca el código del producto a rellenar:");
				codigo=sc.next();
				System.out.println("Introduzca 1 para modificar el código.");
				System.out.println("Introduzca 2 para modificar la descripción.");
				System.out.println("Introduzca 3 para modificar el precio de compra.");
				System.out.println("Introduzca 4 para modificar el precio de venta.");
				System.out.println("Introduzca 5 para modificar la cantidad.");
				opcion = sc.nextInt();
				switch (opcion) {
				case 1 -> {
					System.out.println("Introduzca el nuevo código.");
					codigo = sc.next();
					productos[elegirProducto(productos, codigo)].setCodigo(codigo);
				}
				case 2 -> {
					System.out.println("Introduzca la nueva descripcion.");
					descripcion = sc.next();
					productos[elegirProducto(productos, codigo)].setDescripcion(descripcion);
				}
				case 3 -> {
					System.out.println("Introduzca el nuevo precio de compra.");
					precioCompra = sc.nextDouble();
					productos[elegirProducto(productos, codigo)].setPrecioCompra(precioCompra);
				}
				case 4 -> {
					System.out.println("Introduzca el nuevo precio de venta.");
					precioVenta = sc.nextDouble();
					productos[elegirProducto(productos, codigo)].setPrecioVenta(precioVenta);
				}
				case 5 -> {
					System.out.println("Introduzca la nueva cantidad.");
					cantidad = sc.nextInt();
					productos[elegirProducto(productos, codigo)].setStock(cantidad);
				}
				default -> {
					System.out.println("Opción no válida");
				}
				}
			}
			case 5 -> {
				System.out.println("Introduzca el código del producto a rellenar:");
				codigo=sc.next();
				System.out.println("Introduzca la cantidad de productos a agregar: ");
				cantidad = sc.nextInt();
				productos[elegirProducto(productos, codigo)].EntradaMercancia(cantidad);
			}
			case 6 -> {
				System.out.println("Introduzca el código del producto a sacar:");
				codigo=sc.next();
				System.out.println("Introduzca la cantidad de productos a sacar: ");
				cantidad = sc.nextInt();
				productos[elegirProducto(productos, codigo)].SalidaMercancia(cantidad);
			}
			
			case 7 -> {
				System.out.println("FIN DEL PROGRAMA");
				salir = true;
			}

			default -> {
				System.out.println("Opción no válida");
			}
			}

		}
		sc.close();
	}

	private static Producto NuevoProducto() {
		Producto prod;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el código del producto a añadir.");
		codigo = sc.nextLine();
		System.out.println("Introduzca la descripción del producto a añadir.");
		descripcion = sc.nextLine();
		System.out.println("Introduzca el precio de compra del producto a añadir.");
		precioCompra = sc.nextDouble();
		System.out.println("Introduzca el precio de venta del producto a añadir.");
		precioVenta = sc.nextDouble();
		System.out.println("Introduzca la cantidad del producto a añadir.");
		cantidad = sc.nextInt();
		prod = new Producto(codigo, descripcion, precioCompra, precioVenta, cantidad);
		return prod;
	}
	private static int elegirProducto(Producto[] productos, String cod) {
		int posicion=0;
		
		for(int i = 0; i<productos.length; i++) {
			if(productos[i].getCodigo()==cod) {
				posicion=i;
				break;
			}
		}
		if (posicion==productos.length-1) {
			System.out.println("No se encuentra el producto");
		}
		return posicion;
	}
}
