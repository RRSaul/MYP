/**
 * Clase encargada de representar al ingrediente catsup.
 */
public class IngredienteCatsup extends Ingrediente {

    public IngredienteCatsup(Baguette baguette){
        this.baguette = baguette;
    }

    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", catsup";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 0.99;
    }
}
