package Fabricas.Piezas;

/**
 * Clase pública abstracta encargada de ser la base de todos los blindajes, extiende de Pieza.
 */
public abstract class Blindaje extends Pieza {

    /**
     * @Override del metodo montar de Pieza.
     */
    @Override
    public void montar() {
        forjarPlacas();
        templarPlacas();
        soldarEnNave();
    }

    /**
     * Método abstracto encargado de forjar las placas del blindaje, cada blindje se forja diferente.
     */
    public abstract void forjarPlacas();

    /**
     * Método abstracto encargado de templar las placas del blindaje, cada blindje se templa diferente.
     */
    public abstract void templarPlacas();

    /**
     * Método abstracto encargado de soldar las placas del blindaje, cada blindje se suelda diferente.
     */
    public abstract void soldarEnNave();
}
