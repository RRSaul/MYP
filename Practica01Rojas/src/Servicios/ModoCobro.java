package Servicios;

/**
 * Interface encargada de implemetar los metodos de pago, es aqui la parte central del patrón Strategy.
 */
public interface ModoCobro {


    public void agregarModoCobro(String concepto, int cantidad);

    public void quitarModoDeCobro(String concepto);

    public int consultaCobro(String concepto);

    public void muestraTodosLosCobros();



}
