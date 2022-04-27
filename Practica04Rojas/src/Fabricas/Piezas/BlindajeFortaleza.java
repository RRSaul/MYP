package Fabricas.Piezas;

/**
 * Clase encargada de representar a el blindaje fortaleza.
 */
public class BlindajeFortaleza extends Blindaje{

    public BlindajeFortaleza(){
        this.nombre = "Blindaje fortaleza";
        this.descripcion = "Blindaje fortaleza para naves con proteccion nivel conflicto espacial";
        this.precio = 30;
        this.modAtaque = 0;
        this.modDefensa = 20;
        this.modVelocidad = -10;
        this.modPeso = 14;

    }

    /**
     * Método @Override de forjarPlacas de blindaje.
     */
    @Override
    public void forjarPlacas() {
        System.out.println("Forjando aleaciones de diamante puro.");
    }

    /**
     * Método @Override de templarPlacas de blindaje.
     */
    @Override
    public void templarPlacas() {
        System.out.println("Templando placas en lava.");
    }

    /**
     * Método @Override de soldarEnNave de blindaje.
     */
    @Override
    public void soldarEnNave() {
        System.out.println("Soldando con plasma 74 a armazon.\n");
    }
}
