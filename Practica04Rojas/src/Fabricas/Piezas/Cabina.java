package Fabricas.Piezas;

/**
 * Clase pública abstracta encargada de ser la base de todas las cabinas, extiende de Pieza.
 */
public abstract class Cabina extends Pieza {

    /**
     * @Override del método montar de Pieza.
     */
    @Override
    public void montar() {
        formarCristal();
        templarCristal();
        montarEnNave();
    }

    /**
     * Método abstracto encargado de formar el cristal de la cabina, cada cristal se forma distinto.
     */
    public abstract void formarCristal();

    /**
     * Método abstracto encargado de templar el cristal de la cabina, cada cristal se templa distinto.
     */
    public abstract void templarCristal();

    /**
     * Método abstracto encargado de montar la cabina, cada cabina se monta distinto.
     */
    public abstract void montarEnNave();
}
