package Fabricas.Piezas;

/**
 * Clase pública abstracta encargada de ser la base de todas las armas, extiende de Pieza.
 */
public abstract class Arma extends Pieza {

    /**
     * @Override del metodo montar de Pieza.
     */
    @Override
    public void montar() {
        construirArma();
        conseguirMunicion();
        montarEnNave();
    }

    /**
     * Método abstracto encargado de construir un arma, cada arma se construye diferente.
     */
    public abstract void construirArma();

    /**
     * Método abstracto encargado de conseguir la munición del arma, cada arma tiene diferente munición.
     */
    public abstract void conseguirMunicion();


    /**
     * Método abstracto encargado de montar el arma en la nave, cada arma se monta de diferente manera.
     */
    public abstract void montarEnNave();


}
