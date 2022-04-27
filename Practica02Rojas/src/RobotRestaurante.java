import Menus.Hamburguesas.Hamburguesa;
import Menus.Menu;
import Menus.MenuGeneral;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Clase encargada de reprensentar al robot mesero, es aquí donde se usa el patrón State.
 */
public class RobotRestaurante {

    //La estructura de datos donde se almacenan los menús.
    LinkedList<Menu> menus;
    //El estado actual.
    Estado estadoActual;
    //Los estados a cambiar.
    Estado estadoAtendiento;
    Estado estadoCocinando;
    Estado estadoSuspendido;
    Estado estadoCaminando;

    /**
     * Constructor publico de RobotRestaurante, inicializa todos los estados, activa al robot como suspendido,
     * inicializa la lista de menús y le agrega el menu general.
     */
    public RobotRestaurante(){
        estadoAtendiento = new EstadoAtendiendo(this);
        estadoCocinando = new EstadoCocinando(this);
        estadoSuspendido = new EstadoSuspendido(this);
        estadoCaminando = new EstadoCaminando(this);
        setEstado(estadoSuspendido);
        menus = new LinkedList<>();
        menus.addLast(new MenuGeneral());
    }

    /**
     * Metodo encargado de suspender al robot, manda a llamar a el metodo del estado actual.
     */
    public void suspenderse(){
        estadoActual.suspenderse();
    }

    /**
     * Metodo encargado de hacer caminar al robot, manda a llamar a el metodo del estado actual.
     * @param nombreCliente Puede recibir un nombre de cliente al cual camina.
     */
    public void caminarACliente(String nombreCliente){
        estadoActual.caminarACliente(nombreCliente);
    }

    /**
     * Metodo encargado de hacer cocinar al robot, manda a llamar a el metodo del estado actual.
     * @param id Int de la id del platillo a cocinar.
     */
    public void cocinar(int id){
        estadoActual.cocinar(id);
    }

    /**
     * Metodo encargado de hacer atender al robot, manda a llamar a el metodo del estado actual.
     */
    public void atender(){
        estadoActual.atender();
    }

    /**
     * Metodo encargado de hacer saludar al robot.
     */
    public void saludar(){
        System.out.println("\"¡Bienvenido, humano, a la gloriosa evolución de McHamburguesas!\n" +
                ", ¡Para contiuar correctamente lea el README!\n");
    }

    /**
     * Metodo encargado de agregar a la lista de menús del robot otro menú. Checa primero si lo tiene.
     * @param menu Menu a agregar, debe implementar la interfaz Menu.
     */
    public void agregaMenu(Menu menu){
        if(menu != null ){
        String menuNombre = menu.getClass().toString();
        if(!menus.contains(menu)) {
            menus.addLast(menu);

            System.out.println(menuNombre + " ha sido agregado a los menús disponibles.\n");
            }
        }else {
            System.out.println("Ha sido imposible agregar el menú dado.\n" );
        }
    }

    /**
     * Metodo encargado de cambiar el estado actual del robot.
     * @param estado Estado a cual cambiar.
     */
    public void setEstado(Estado estado){
        estadoActual = estado;
    }

    /**
     * Metodo encargado de recorrer todos los menús guardados, generar un iterador de cada menú y con el recorrer
     * los para imprimir todos los platillos.
     */

    public void soutMenuCompleto(){
        Iterator<Menu> iteratorMenus = menus.iterator();
        while (iteratorMenus.hasNext()){
            Menu menuInterno = iteratorMenus.next();
            System.out.println(menuInterno.toString());
            //Aquí es donde brilla el patrón Iterator.
            Iterator<Hamburguesa> iteratorHamburguesas = menuInterno.crearIterador();
            while (iteratorHamburguesas.hasNext()){
                System.out.println(iteratorHamburguesas.next().toString());
            }
        }
    }

    /**
     * Metodo encargado de cocinar una hamburguesa dada en base a su id. Recorre los menús usando iteradores.
     * @param idHamburguesa int id de la hamburguesa.
     */
    public void cocinarHamburguesa(int idHamburguesa){
        Iterator<Menu> iteratorMenus = menus.iterator();
        while (iteratorMenus.hasNext()){
            Menu menuInterno = iteratorMenus.next();
            Iterator<Hamburguesa> iteratorHamburguesas = menuInterno.crearIterador();
            while (iteratorHamburguesas.hasNext()){
                Hamburguesa hamburguesaActual = iteratorHamburguesas.next();
                if(hamburguesaActual.getId() == idHamburguesa){
                    hamburguesaActual.cocinar();
                    break;
                }
            }
        }
    }

    /**
     * Metodo encargado de buscar una hamburguesa en base a su id. Recorre los menús usando iteradores.
     * @param idHamburguesa int id de la hamburguesa a buscar.
     * @return boolean, true si la hamburguesa está en el menú, false en otro caso.
     */

    public boolean menuContieneHamburguesa(int idHamburguesa){
        Iterator<Menu> iteratorMenus = menus.iterator();
        while (iteratorMenus.hasNext()){
            Menu menuInterno = iteratorMenus.next();
            Iterator<Hamburguesa> iteratorHamburguesas = menuInterno.crearIterador();
            while (iteratorHamburguesas.hasNext()){
                Hamburguesa hamburguesaActual = iteratorHamburguesas.next();
                if(hamburguesaActual.getId() == idHamburguesa){
                    return true;
                }
            }
        }
        return false;
    }
}
