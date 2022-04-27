package Servicios;

/**
 * Clase encargada de representar a Issi extendiendo a servicio.
 */

public class Issi extends Servicio{

    public Issi(){
        setModoCobro(new IssiCobro());
    }
}
