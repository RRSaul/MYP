/**
 * Clase encargada de representar al ingrediente mayonesa.
 */
public class IngredienteMayonesa extends Ingrediente {

    public IngredienteMayonesa(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", mayonesa";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 0.99;
    }
}
