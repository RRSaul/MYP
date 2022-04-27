/**
 * Clase encargada de representar al ingrediente jitomate.
 */
public class IngredienteJitomate extends Ingrediente {

    public IngredienteJitomate(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", jitomate";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 2.99;
    }
}
