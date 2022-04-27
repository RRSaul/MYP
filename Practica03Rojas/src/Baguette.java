/**
 * Clase encargada de representar una baguette sin ningun ingrediente extra, aun que puede ser instaciada,
 * ninguna persona pediria solo un pan. ¿No?
 */
public class Baguette implements Producto {
    String descripcion;

    /**
     * Metodo que sobrecarga a descripcion() de la interfaz Producto.
     * @return String la descripcion de la baguette.
     */
    @Override
    public String getDescripcion(){
        return descripcion;
    }

    /**
     * Metodo que sobrecarga a getCosto() de la interfaz Producto.
     * @return double el costo de la baguette.
     */
    @Override
    public double getCosto(){
        return 12.99;
    }

    /**
     * Constructor publico de baguette.
     */
    public Baguette(){
        descripcion  = "Pan blanco clásico";
    }
}
