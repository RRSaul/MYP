package Fabricas;
import Fabricas.Piezas.Pieza;
import java.util.HashMap;

/**
 * Clase pública abstracta encargada de exterder a las demás fabricas, aqui está el centro del patrón Factory.
 */
public abstract class FabricaPiezas {

    /**
     * HashMap que almacena las piezas en cada fabrica.
     */
    public HashMap<String,Pieza> piezasDeLaFabrica;

    /**
     * Constructor público de FabricaPiezas
     */
    public FabricaPiezas(){}

    /**
     * Método público abstracto encargado de crear una pieza, cada clase que extienda de FabricaPiezas debe implementarlo.
     * @param pieza String el nombre la pieza que quiera ser construida.
     * @return Pieza la pieza ya construida.
     */
    public abstract Pieza crearPieza(String pieza);
}
