package Fabricas.Piezas;

/**
 * Clase encargada de representar a la cabina tripulación pequeña.
 */
public class CabinaTripulacion extends Cabina {

    public CabinaTripulacion(){
        this.nombre = "Cabina tripulación pequeña";
        this.descripcion = "Cabina de tripulación para misiones organizadas";
        this.precio = 3;
        this.modAtaque = 0;
        this.modDefensa = 0;
        this.modVelocidad = 0;
        this.modPeso =5;
    }

    /**
     * Método @Override de formarCristal de cabina.
     */
    @Override
    public void formarCristal() {
        System.out.println("Fundiendo area de duna roja.");
    }

    /**
     * Método @Override de templarCristal de cabina.
     */
    @Override
    public void templarCristal() {
        System.out.println("Templando en cupula mediana.");
    }

    /**
     * Método @Override de montarEnNave de cabina.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando cupula y controles de uso multiple.\n");
    }
}
