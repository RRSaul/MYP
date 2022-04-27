import Fabricas.FabricaArmas;
import Fabricas.FabricaBlindajes;
import Fabricas.FabricaCabinas;
import Fabricas.FabricaPropulsores;
import Fabricas.Piezas.*;
import java.util.HashMap;

/**
 * Clase pública abstractaa encarga de ser la base del constructor, esta junto con Nava son el nucleo del patrón Builder.
 */
public abstract class Constructor {

    //Las fabricas guardadas en el constructor.
    protected FabricaArmas fabricaArmas = new FabricaArmas();
    protected FabricaBlindajes fabricaBlindajes = new FabricaBlindajes();
    protected FabricaCabinas fabricaCabinas = new FabricaCabinas();
    protected FabricaPropulsores fabricaPropulsores = new FabricaPropulsores();

    //Los datos guardas para ser aplicados en una nave.
    protected String nombre;
    protected Arma armaParaNave;
    protected Blindaje blindajeParaNave;
    protected Cabina cabinaParaNave;
    protected Propulsor propulsorParaNave;

    /**
     * Método público abstracto encargado de costruir una nave, se ayuda del constructorNave en Nave.
     * @return Nave la nave construida.
     */
    public  abstract  Nave construir();

    /**
     * Método público abstracto encargado de nombrar la nave. Las clases que extiendan de constructor deben implementarlo.
     * @param nombre String nombre de la nave.
     * @return El constructor actualizado.
     */
    public abstract Constructor nombrarNave(String nombre);

    /**
     * Método público abstracto encargado fabricar un arma nueva. Las clases que extiendan de constructor deben implementarlo.
     * @param arma String nombre del arma.
     * @return El constructor actualizado.
     */
    public abstract Constructor fabricaNuevaArma(String arma);

    /**
     * Método público abstracto encargado fabricar un blindaje nuevo. Las clases que extiendan de constructor deben implementarlo.
     * @param blindaje String nombre del blindaje.
     * @return El constructor actualizado.
     */
    public abstract Constructor fabricaNuevoBlindaje(String blindaje);

    /**
     * Método público abstracto encargado fabricar una cabina nueva. Las clases que extiendan de constructor deben implementarlo.
     * @param cabina String nombre de la cabina.
     * @return El constructor actualizado.
     */
    public abstract Constructor fabricaNuevaCabina(String cabina);

    /**
     * Método público abstracto encargado fabricar uno propulsor nuevo. Las clases que extiendan de constructor deben implementarlo.
     * @param propulsores String nombre del propulsor.
     * @return El constructor actualizado.
     */
    public abstract Constructor fabricaNuevoPropulsores(String propulsores);


    /**
     * Método encargado de regresar un HashMap con las piezas de la fabricaArmas.
     * @return HashMap<String,Pieza> con las piezas en la fabrica.
     */
    public HashMap<String, Pieza> getArmasEnFabrica() {
        return fabricaArmas.piezasDeLaFabrica;
    }

    /**
     * Método encargado de regresar un HashMap con las piezas de la fabricaBlindajes.
     * @return HashMap<String,Pieza> con las piezas en la fabrica.
     */
    public HashMap<String, Pieza> getBlindajesEnFabrica() {
        return fabricaBlindajes.piezasDeLaFabrica;
    }

    /**
     * Método encargado de regresar un HashMap con las piezas de la fabricaCabinas.
     * @return HashMap<String,Pieza> con las piezas en la fabrica.
     */
    public HashMap<String, Pieza> getCabinasEnFabrica() {
        return fabricaCabinas.piezasDeLaFabrica;
    }

    /**
     * Método encargado de regresar un HashMap con las piezas de la fabricaPropulsores.
     * @return HashMap<String,Pieza> con las piezas en la fabrica.
     */
    public HashMap<String, Pieza> getPropulsoresEnFabrica() {
        return fabricaPropulsores.piezasDeLaFabrica;
    }


}
