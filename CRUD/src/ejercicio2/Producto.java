package ejercicio2;

public class Producto {
private String codigo;
private String descripcion;
private double precioCompra;
private double precioVenta;
private int stock;
public Producto() {
	super();
}
public Producto(String codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
	super();
	this.codigo = codigo;
	this.descripcion = descripcion;
	this.precioCompra = precioCompra;
	this.precioVenta = precioVenta;
	this.stock = stock;
}
public String getCodigo() {
	return codigo;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

public double getPrecioCompra() {
	return precioCompra;
}
public void setPrecioCompra(double precioCompra) {
	this.precioCompra = precioCompra;
}
public double getPrecioVenta() {
	return precioVenta;
}
public void setPrecioVenta(double precioVenta) {
	this.precioVenta = precioVenta;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
@Override
public String toString() {
	return "Codigo = " + codigo + ", Descripcion = " + descripcion + ", Precio de compra = " + precioCompra + ", Precio de venta = " + precioVenta + ", Stock = " + stock;
}
public int EntradaMercancia(int cantidad){
	stock+=cantidad;
	return this.stock;
}
public int SalidaMercancia(int cantidad){
	stock-=cantidad;
	return this.stock;
}
}
