package Servicios;
/**
 * Clase encargada de representar a Mextel extendiendo a servicio.
 */

public class Mextel extends Servicio {
    public Mextel(){
        setModoCobro( new MextelCobro());
    }
}
