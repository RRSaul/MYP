package Fabricas.Piezas;

/**
 * Clase encargada de representar a la cabina de un piloto.
 */
public class CabinaUnPiloto extends Cabina {

    public CabinaUnPiloto(){
        this.nombre = "Cabina un piloto";
        this.descripcion = "Cabina de minima normatividad para las naves del Imperio Galactica";
        this.precio = 1;
        this.modAtaque = 1;
        this.modDefensa = 0;
        this.modVelocidad = 3;
        this.modPeso =2;
    }

    /**
     * Método @Override de formarCristal de cabina.
     */
    @Override
    public void formarCristal() {
        System.out.println("Fundiendo area de duna.");
    }

    /**
     * Método @Override de templarCristal de cabina.
     */
    @Override
    public void templarCristal() {
        System.out.println("Templando en cupula simple.");
    }

    /**
     * Método @Override de montarEnNave de cabina.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando cupula y controles.\n");
    }
}
