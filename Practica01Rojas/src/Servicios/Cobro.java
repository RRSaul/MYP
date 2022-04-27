package Servicios;

/**
 * Clase auxilear para manejar los cobros en base a un cantidad y a un concepto, asi mas tipos de cobros se pueden agregar.
 */

public class Cobro {
    private int cantidad;
    private String consepto;

    public Cobro(String consepto, int cantidad){
        this.cantidad = cantidad;
        this.consepto = consepto;
    }

    public String getConsepto() {
        return consepto;
    }

    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "cobro de " + cantidad + " por " + consepto;
    }
}
