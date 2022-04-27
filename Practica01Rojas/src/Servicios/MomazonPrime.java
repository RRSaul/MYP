package Servicios;
/**
 * Clase encargada de representar a Momazon, extendiendo a servicio.
 */

public class MomazonPrime extends Servicio {
    public MomazonPrime(){
        setModoCobro(new MomazonPrimeCobro());
    }
}
