/**
 * Clase encargada de representar al ingrediente cebolla.
 */
public class IngredienteCebolla extends Ingrediente {

    public IngredienteCebolla(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+ ", cebolla";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 2.99;
    }
}
