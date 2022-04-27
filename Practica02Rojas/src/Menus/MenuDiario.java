package Menus;
import Menus.Hamburguesas.Hamburguesa;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Clase encargada de representar el menú diario de McHamburguesas, como este puede cambiar todos los días,
 * no se inicializa con ninguna hamburguesa dentro, posee metodos para agregar y eliminar hamburguesas.
 */
public class MenuDiario implements Menu {

    //Como se especifica en la practica, el menú se encuentra en un arreglo.
    ArrayList<Hamburguesa> hamburguesas;

    /**
     * Constructor publico de MenuDiario
     */
    public MenuDiario(){
        hamburguesas = new ArrayList<>();
    }

    /**
     * Metodo encargado de agregar una haburguesa al menú diario. Utliza los metodos contiene de listas arreglo para
     * buscarla antes de intentar agregarla.
     * @param hamburguesa Hamburguesa a agregar al menú.
     */
    public void agregarHamburguesaMD(Hamburguesa hamburguesa){
        if(hamburguesa != null &&!hamburguesas.contains(hamburguesa)) {
            hamburguesas.add(hamburguesa);
            System.out.println("Se ha agregado " + hamburguesa.getNombre() + " a el menú diario.");
        }else {
            System.out.println("La hamburguesa ya esta en el menú diario ó es nulla");
        }
    }

    /**
     * Metodo encargado de eliminar una hamburguesa con una id dada, este metodo recorre la lista de menú.
     * @param id Int del id de la hamburguesa a eliminar.
     */
    public void eliminarHamburguesaMD(int id){
        Iterator<Hamburguesa> hamburguesaIterator = crearIterador();
        while (hamburguesaIterator.hasNext()){
            Hamburguesa hamburguesaIn = hamburguesaIterator.next();
            if(hamburguesaIn.getId() == id){
                hamburguesas.remove(hamburguesaIn);
                System.out.println("La hamburguesa con id: " + id + ", nombre: " + hamburguesaIn.getNombre() + " Fue eliminada.\n");
                return;
            }
        }
        System.out.println("La hamburguesa de id: " + id + ", no se encuentra en el menú.\n");
    }

    /**
     * @Override de la interfaz Menu.
     * @return Iterador<Hamburguesa> el iterador de la lista arreglo de hamburguesas.
     */
    @Override
    public Iterator<Hamburguesa> crearIterador() {
        return hamburguesas.iterator();
    }

    /**
     * @Override de el metodo toString, se presenta el nombre del menú, aqui se podría imprimer todo
     * el menú, pero para que se pudieran usar por separado no se implementó.
     * @return  String la presentación del menú.
     */
    @Override
    public String toString() {
        return "------ ¡Menú diario de McHamburguesas, cada dia algo nuevo para sorprenderte! ------";
    }
}
