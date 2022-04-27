package Menus;
import Menus.Hamburguesas.Hamburguesa;
import java.util.Iterator;

/**
 *Interfaz implementada por toda clas que que quiera funcionar como menú. Es aquí donde se implementa el patrón Iterator.
 */

public interface Menu {
    /**
     * Crea un iterador en la clase que la implemente y lo regresa.
     * @return Iterador<Hamburguesa>< para recorrer el menú.
     */
    public Iterator<Hamburguesa> crearIterador();
}
