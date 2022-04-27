/**
 * Clase encargada de representar al ingrediente pollo.
 */
public class IngredientePollo extends Ingrediente{

    public IngredientePollo(Baguette baguette){
        this.baguette = baguette;
    }


    @Override
    public String getDescripcion() {
        return baguette.getDescripcion() + ", pollo";
    }

    @Override
    public double getCosto() {
        return baguette.getCosto() + 7.99;
    }
}
