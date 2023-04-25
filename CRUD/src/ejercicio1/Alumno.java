package ejercicio1;
/**
 * Almacena atributos y métodos de los alumnos
 * @author Rexil
 *
 */
public class Alumno {
	/**
	 * Almacena el nombre de los alumnos
	 */
private String nombre;
/**
 * Almacena la nota media de los alumnos 
 */
private double notaMedia;
/**
 * Constructor con parámetros de la clase alumno
 * @param nombre Nombre del alumno
 * @param notaMedia Nota media del alumno
 */
public Alumno(String nombre, double notaMedia) {
	super();
	this.nombre = nombre;
	this.notaMedia = notaMedia;
}
/**
 * Constructor vacio de la clase
 */
public Alumno() {
	super();
}
/**
 * Da información a una clase externa del nombre del alumno
 * @return Devuelve el nombre del alumno
 */
public String getNombre() {
	return nombre;
}
/**
 * Permite que una clase externa modifique el nombre del alumno
 * @param nombre Nombre del alumno
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * Da información a una clase externa sobre el nombre del alumno
 * @return Nota media
 */
public double getNotaMedia() {
	return notaMedia;
}
/** 
 * Permite que una clase externa de valor a la nota media
 * @param notaMedia Nota media del alumno
 */
public void setNotaMedia(double notaMedia) {
	this.notaMedia = notaMedia;
}

@Override
public String toString() {
	return "Nombre = " + nombre + ", Nota media = " + notaMedia;
}



}
