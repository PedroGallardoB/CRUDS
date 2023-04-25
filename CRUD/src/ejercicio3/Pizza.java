package ejercicio3;

import java.util.Scanner;

public class Pizza {
	
	private int codigo;
	
	enum Tamano{
		Mediana, 
		Familiar;
	};
	enum Tipo{
		Margarita,
		CuatroQuesos,
		Funghi;
	};
	enum Estado{
		Pedida,
		Entregada;
	};
    private Tamano tamano;
    private Tipo tipo;
    private Estado estado;

    public Pizza(int codigo, String tamano, String tipo, String estado) {
        this.codigo = 0;
        this.tamano = Tamano.valueOf(tamano);
        this.tipo = Tipo.valueOf(tipo);
        this.estado = Estado.valueOf(estado);
    };

    public Pizza(int codigo, String tamano, String tipo) {
        this.codigo = codigo;
        this.tamano = Tamano.valueOf(tamano);
        this.tipo = Tipo.valueOf(tipo);
        this.estado = Estado.Pedida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pizza: codigo: " + codigo + ", tamaño: " + tamano + ", tipo: " + tipo + ", estado: " + estado;
    }

}