/**
 * Clase encargada de representar al ingrediente jamón.
 */
public class IngredienteJamon extends Ingrediente {

    public IngredienteJamon(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", jamón";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 7.99;
    }
}
