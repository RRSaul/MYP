package Fabricas.Piezas;

/**
 * Clase pública abstracta encargada de ser la base de todos los propulsores, extiende de Pieza.
 */
public abstract class Propulsor extends Pieza {

    /**
     * @Override del método montar de Pieza.
     */
    @Override
    public void montar() {
        ensamblarPropulsor();
        montarEnNave();
        abastecerCombustible();
    }

    /**
     * Método abstracto encargado de ensamblar el propulsor, cada propulsor se ensambla distinto.
     */
    public abstract void ensamblarPropulsor();

    /**
     * Método abstracto encargado de montar el propulsor, cada propulsor se monta distinto.
     */
    public abstract void montarEnNave();

    /**
     * Método abstracto encargado de abastecer el propulsor, cada propulsor se abastece distinto.
     */
    public abstract void abastecerCombustible();
}
