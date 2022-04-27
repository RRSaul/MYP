/**
 * Clase encargada de representar al ingrediente lechuga.
 */
public class IngredienteLechuga extends Ingrediente {

    public IngredienteLechuga(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", lechuga";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 2.99;
    }
}
