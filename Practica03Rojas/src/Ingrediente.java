/**
 * Clase pública abstracta encargada de hacer de base para todos los ingredientes que se puedan agregar a
 * una baguette.
 */
public abstract class Ingrediente extends Baguette {

    //Para usar el patŕon decorator se guarda a una referencia a una baguette anterior.
    Baguette baguette;

    /**
     * Metodo abstracto encargado de dar la descripción de la baguette, con el ingrediete nuevo implementado.
     * @return String de la nueva descripción de la baguette.
     */
    public abstract String getDescripcion();

    /**
     * Metodo abstracto encargado de dar el costo de la baguette, con el ingrediete nuevo implementado.
     * @return double del nuevo costo.k
     */
    public abstract double getCosto();


}
