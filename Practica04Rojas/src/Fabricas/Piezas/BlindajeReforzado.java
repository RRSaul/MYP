package Fabricas.Piezas;

/**
 * Clase encargada de representar a el blindaje reforzado.
 */
public class BlindajeReforzado extends Blindaje{

    public BlindajeReforzado(){
        this.nombre = "Blindaje reforzado";
        this.descripcion = "Blindaje reforzado para naves con proteccion nivel naval";
        this.precio = 7;
        this.modAtaque = 0;
        this.modDefensa = 10;
        this.modVelocidad = -4;
        this.modPeso = 8;

    }

    /**
     * Método @Override de forjarPlacas de blindaje.
     */
    @Override
    public void forjarPlacas() {
        System.out.println("Forjando aleaciones de titanio y diamante.");
    }

    /**
     * Método @Override de templarPlacas de blindaje.
     */
    @Override
    public void templarPlacas() {
        System.out.println("Templando placas en aceite.");
    }

    /**
     * Método @Override de soldarEnNave de blindaje.
     */
    @Override
    public void soldarEnNave() {
        System.out.println("Soldando con plasma a armazon.\n");
    }
}
