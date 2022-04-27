/**
 * Clase encargada de representar al ingrediente pepperoni.
 */
public class IngredientePepperoni extends Ingrediente {

    public IngredientePepperoni(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion()+ ", pepperoni";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 7.99;
    }
}
