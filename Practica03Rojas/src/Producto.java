/**
 * Interfaz encargada de dar descripciones y costos de un producto. Se usa una interfaz para que el adabtador
 * de pizza se pueda manejar de la misma manera que las baguettes, pues esta tambien lo usa.
 */
public interface Producto {
    /**
     * Metodo encargado de dar una descripción del producto.
     * @return String la descripción del producto.
     */
    public String getDescripcion();

    /**
     * Metodo encargado de dar el costo de un producto.
     * @return double del costo de un producto.
     */
    public double getCosto();
}
