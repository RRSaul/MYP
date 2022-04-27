package Menus;
import Menus.Hamburguesas.Hamburguesa;
import java.util.Iterator;

/**
 * Clase encarga de iterar sobre el menú general. Usa la misma estructura vista en clase,
 */

public class MenuGeneralIterador implements Iterator {
    //Mismo arreglo que en el menú general.
    Hamburguesa[] hamburguesas;
    int indice = 0;

    /**
     * Costructor publico de MenuGeneralIterador. Recibe el arreglo menú del menú general.
     * @param hamburguesas Hamburguesa[] para su iteración.
     */
    public MenuGeneralIterador(Hamburguesa[] hamburguesas){
        this.hamburguesas = hamburguesas;
    }

    /**
     * @Override del metodo hasNext de la interfaz Iterador. Sigue la estructura vista en clase.
     * @return boolean, true si el iterador tiene siguiente, false en otro caso.
     */
    @Override
    public boolean hasNext() {
        if(indice>= hamburguesas.length || hamburguesas[indice]== null){
            return false;
        }else {
            return true;
        }
    }

    /**
     * @Override del metodo next de la interfaz Iterador. Sigue la estructura vista en clase.
     * @return Object objeto siguiente de la colección.
     */
    @Override
    public Hamburguesa next() {
        Hamburguesa hamburguesaIn = hamburguesas[indice];
        indice++;
        return hamburguesaIn;
    }
}
