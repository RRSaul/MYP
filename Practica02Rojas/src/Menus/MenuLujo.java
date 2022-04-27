package Menus;
import Menus.Hamburguesas.Hamburguesa;
import java.util.Hashtable;
import java.util.Iterator;
/**
 * Clase encargada de representar el menú de lujo de McHaamburguesas, como este puede cambiar ,
 *  * no se inicializa con ninguna hamburguesa dentro, posee metodos para agregar y eliminar hamburguesas.
 */
public class MenuLujo implements Menu {
    //Como se especifica en la practica, el menú se encuentra en una HashTable, mapeada de Integer id a Hamburguesa hamburguesa.
    Hashtable<Integer,Hamburguesa> hamburguesas;

    /**
     * Constructor publico de MenuLujo.
     */
    public MenuLujo(){
        hamburguesas = new Hashtable<>();

    }
    /**
     * Metodo encargado de agregar una haburguesa al menú de lujo. Utliza los metodos contiene de HashTable para
     * buscarla antes de intentar agregarla.
     * @param hamburguesa Hamburguesa a agregar al menú.
     */
    public void agregarHamburguesaML(Hamburguesa hamburguesa){
        if(hamburguesa != null &&!hamburguesas.contains(hamburguesa)) {
            hamburguesas.put(hamburguesa.getId(),hamburguesa);
            System.out.println("Se ha agregado " + hamburguesa.getNombre() + " a el menú diario.");
        }else {
            System.out.println("La hamburguesa ya esta en el menú diario ó es nulla");
        }
    }

    /**
     * Metodo encargado de eliminar una hamburguesa con una id dada, este metodo recorre la lista de menú.
     * @param id Int del id de la hamburguesa a eliminar.
     */
    public void eliminaHamburguesaML(int id){
        if(hamburguesas.contains(id)){
           Hamburguesa eliminada = hamburguesas.remove(id);
            System.out.println("La hamburguesa con id: " + id + ", nombre: " + eliminada.getNombre() + " Fue eliminada.\n");
        }

    }

    /**
     * @Override de la interfaz Menu.
     * @return Iterador<Hamburguesa> el iterador de la lista arreglo de hamburguesas.
     */
    @Override
    public Iterator<Hamburguesa> crearIterador() {
        return hamburguesas.values().iterator();
    }

    /**
     * @Override de el metodo toString, se presenta el nombre del menú, aqui se podría imprimer todo
     * el menú, pero para que se pudieran usar por separado no se implementó.
     * @return  String la presentación del menú.
     */
    @Override
    public String toString() {
        return "------ ¡Menú de lujo de McHamburguesas, exquisita selección de hamburguesas gourmet! ------";
    }
}
