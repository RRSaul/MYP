/**
 * Clase pública encarga de hacer de adaptador de una pizza a un producto.
 */
public class PizzaAdaptador implements Producto {
    //La pizza en el adaptador.
    Pizza pizza;

    /**
     * Constructor público del adaptador.
     * @param pizza Pizza la pizza en el adaptador.
     */
    public PizzaAdaptador(Pizza pizza){
        this.pizza = pizza;
    }

    /**
     * Metodo que sobrecarga a el metodo getDescripcion de la interfaz Producto.
     * @return String la descripción de la pizza.
     */
    @Override
    public String getDescripcion() {
        return "Pizza de "+ pizza.getMasa()+", "+pizza.getQueso() +", " + pizza.getCarne();
    }

    /**
     * Metodo que sobrecarga a getCosto de la interfaz Producto, este llama a getPrecio de pizza.
     * @return double el costo de la pizza.
     */
    @Override
    public double getCosto() {
        return pizza.getPrecio();
    }
}
