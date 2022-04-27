/**
 * Clase encargada de representar al ingrediente mostaza.
 */
public class IngredienteMostaza extends Ingrediente {

    public IngredienteMostaza(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+ ", mostaza";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 0.99;
    }
}
