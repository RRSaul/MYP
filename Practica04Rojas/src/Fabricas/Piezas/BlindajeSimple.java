package Fabricas.Piezas;

/**
 * Clase encargada de representar a el blindaje simple.
 */
public class BlindajeSimple extends Blindaje{

    public BlindajeSimple(){
        this.nombre = "Blindaje simple";
        this.descripcion = "Blindaje de minima normatividad para las naves del Imperio Galactica";
        this.precio = 3;
        this.modAtaque = 0;
        this.modDefensa = 3;
        this.modVelocidad = 0;
        this.modPeso = 4;

    }

    /**
     * Método @Override de forjarPlacas de blindaje.
     */
    @Override
    public void forjarPlacas() {
        System.out.println("Forjando aleaciones de titanio.");

    }

    /**
     * Método @Override de templarPlacas de blindaje.
     */
    @Override
    public void templarPlacas() {
        System.out.println("Templando placas en agua.");
    }

    /**
     * Método @Override de soldarEnNave de blindaje.
     */
    @Override
    public void soldarEnNave() {
        System.out.println("Soldando a armazon.\n");
    }
}
