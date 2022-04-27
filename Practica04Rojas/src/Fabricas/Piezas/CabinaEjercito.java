package Fabricas.Piezas;

/**
 * Clase encargada de representar a la cabina ejercito.
 */
public class CabinaEjercito extends Cabina {

    public CabinaEjercito(){
        this.nombre = "Cabina ejército";
        this.descripcion = "Cabina de minima normatividad para las naves del Imperio Galactica";
        this.precio = 8;
        this.modAtaque = 3;
        this.modDefensa = 2;
        this.modVelocidad = -3;
        this.modPeso = 10;
    }

    /**
     * Método @Override de formarCristal de cabina.
     */
    @Override
    public void formarCristal() {
        System.out.println("Fundiendo area de duna negra.");
    }

    /**
     * Método @Override de templarCristal de cabina.
     */
    @Override
    public void templarCristal() {
        System.out.println("Templando en cupula enorme.");
    }

    /**
     * Método @Override de montarEnNave de cabina.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando cupula y controles de mando imperial.\n");
    }
}
