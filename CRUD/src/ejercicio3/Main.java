package ejercicio3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean salir = false;
		int opcion = 0;
		boolean encontrado = false;
		int posicion = 0;
		int Codigo;
		Pizza pizzas[] = new Pizza[0];

		while (!salir) {
			encontrado = false;
			System.out.println("______________________________");
			System.out.println("| 1) LISTADO                  |");
			System.out.println("| 2) NUEVA ORDEN              |");
			System.out.println("| 3) BORRAR ORDEN             |");
			System.out.println("| 4) MODIFICAR ORDEN          |");
			System.out.println("| 5) MARCAR COMO ENTREGADA    |");
			System.out.println("| 6) SALIR                    |");
			System.out.println("|_____________________________|");
			opcion = sc.nextInt();
			switch (opcion) {

			case 1 -> {
				for (int i = 0; i < pizzas.length; i++) {
					if(pizzas[i]!=null) {
						System.out.print(i +")");	
						System.out.println(pizzas[i].toString());
					}
				}
			}
			case 2 -> {
				for (int i = 0; i < pizzas.length; i++) {
					posicion = i;
					if (pizzas[i] == null) {
						encontrado = true;
						break;
					}
				}
					if (encontrado) {
						pizzas[posicion] = CrearPizza();
					} else {
						pizzas = Arrays.copyOf(pizzas, pizzas.length + 1);
						pizzas[pizzas.length-1] = CrearPizza();
					}
			}
			case 3 -> {
				System.out.println("Di el código de la pizza que quieres borrar");
				Codigo=sc.nextInt();
				for (int i = 0; i<pizzas.length;i++) {
					if(Codigo==pizzas[i].getCodigo()) {
						pizzas[i]=null;
						break;
					}
				}
			}
			case 4 -> {
				System.out.println("Di el código de la pizza que quieres modificar");
				Codigo=sc.nextInt();
				for (int i = 0; i<pizzas.length;i++) {
					if(Codigo==pizzas[i].getCodigo()) {
						pizzas[i]=CrearPizzaEntregada();
						break;
					}
				}
			}
			case 5 -> {
				System.out.println("Di el código de la pizza que quieres marcar como entregada");
				Codigo=sc.nextInt();
				for (int i = 0; i<pizzas.length;i++) {
					if(Codigo==pizzas[i].getCodigo()) {
						pizzas[i].setEstado(Pizza.Estado.Entregada);
						break;
					}
				}
			}
			case  6-> {
				System.out.println("FIN DEL PROGRAMA");
				salir=true;
			}
			default -> {
				System.out.println("Opcion incorrecta.");
			}
			}
		}
	}

	private static Pizza CrearPizza() {
		System.out.println("Introduzca un código para la pizza");
		int Codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca un tamaño para la pizza: Mediana/Familiar");
		String Tamano = sc.nextLine();
		System.out.println("Introduzca un tipo para la pizza: Margarita/CuatroQuesos/Funghi");
		String Tipo = sc.nextLine();
		Pizza pizza = new Pizza(Codigo, Tamano, Tipo);
		return pizza;
	}
	
	private static Pizza CrearPizzaEntregada() {
		System.out.println("Introduzca un código para la pizza");
		int Codigo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduzca un tamaño para la pizza: Mediana/Familiar");
		String Tamano = sc.next();
		System.out.println("Introduzca un tipo para la pizza: Margarita/CuatroQuesos/Funghi");
		String Tipo = sc.next();
		System.out.println("Introduzca un estado para la pizza: Pedida/Entregada");
		String Estado = sc.next();
		Pizza pizza = new Pizza(Codigo, Tamano, Tipo, Estado);
		return pizza;
	}
}
