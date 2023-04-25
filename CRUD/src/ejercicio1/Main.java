package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Alumno alumnos[] = new Alumno[30];
		int opcion;
		String nombre;
		double nota;
		boolean salir = false;
		Scanner sc = new Scanner(System.in);

		while (!salir) {
			System.out.println("CRUD DE ALUMNOS" +"/n");

			System.out.println("//////////////////");
			System.out.println("/1. Listado.     /");
			System.out.println("/2. Nuevo Alumno./");
			System.out.println("/3. Modificar.   /");
			System.out.println("/4. Borrar.      /");
			System.out.println("/5. Salir.       /");
			System.out.println("//////////////////");
			opcion = sc.nextInt();
			switch (opcion) {
			case 1 -> {
				for (Alumno alumno : alumnos) {
					if(alumno!=null)
					System.out.println(alumno.toString());
				}
				System.out.println();
			}
			case 2 -> {
				for (int i = 0; i < alumnos.length; i++) {
				    if (alumnos[i] == null) {
				        System.out.println("Introduzca el nombre del alumno");
				        nombre = sc.next();
				        System.out.println("Introduzca la nota del alumno");
				        nota = sc.nextDouble();
				        alumnos[i] = new Alumno(nombre, nota);
				        System.out.println(alumnos[i].toString());
				        break;
				    } else if (i == alumnos.length - 1) {
				        System.out.println("NO HAY POSICIONES DISPONIBLES.");
				    }
				}
			}
			
			case 3 -> {
			System.out.println("Introduzca el nombre del alumno");
			nombre = sc.next();
			for (int i = 0; i<alumnos.length;i++) {
				if(nombre.equals(alumnos[i].getNombre())) {
					System.out.println("Introduzca la nueva nota del alumno");
					nota=sc.nextDouble();
					alumnos[i].setNotaMedia(nota);
					break;
				}
			}
			}
			
			case 4 -> {
				System.out.println("Introduzca el nombre del alumno");
				nombre = sc.next();
				for (int i = 0; i<alumnos.length;i++) {
					if(nombre.equals(alumnos[i].getNombre())) {
						alumnos[i]=null;
						break;
					}
				}
			}
			case 5 -> {
				salir = true;
			}
			default -> {
				System.out.println("Opcion incorrecta.");
			}
			}

		}
		sc.close();
	}

}
