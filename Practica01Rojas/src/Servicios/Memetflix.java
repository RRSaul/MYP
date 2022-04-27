package Servicios;

/**
 * Clase encargada de representar a Memetflix extendiendo a servicio.
 */

public class Memetflix extends Servicio {
    public Memetflix(){
        setModoCobro(new MemetflixCobro());
    }
}
