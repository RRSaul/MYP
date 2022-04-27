package Menus;
import Menus.Hamburguesas.Hamburguesa;
import Menus.Hamburguesas.MGeneralChampi;
import Menus.Hamburguesas.MGeneralClasica;
import Menus.Hamburguesas.MGeneralPollo;
/**
 * Clase encargada de representar el menú general de McHaamburguesas, como esta no puede ser alterada,
 * se inicializa con las hamburguesas ya cargadas, ademas de no poseeŕ metodos para agregar o eliminar hamburguesas.
 */

public class MenuGeneral implements Menu  {

    //Como se especifica en la practica, el menú se encuentra en un arreglo.
    Hamburguesa[] hamburguesas;

    /**
     * Constructor publico de MenuGeneral.
     */
    public MenuGeneral(){
        hamburguesas= new Hamburguesa[]{ new MGeneralClasica(), new MGeneralPollo(), new MGeneralChampi()};
    }


    /**
     * @Override de la interfaz Menu.
     * @return Iterador<Hamburguesa> el iterador de la lista arreglo de hamburguesas.
     */
    @Override
    public MenuGeneralIterador crearIterador() {
        return new MenuGeneralIterador(hamburguesas);
    }

    /**
     * @Override de el metodo toString, se presenta el nombre del menú, aqui se podría imprimer todo
     * el menú, pero para que se pudieran usar por separado no se implementó.
     * @return  String la presentación del menú.
     */
    @Override
    public String toString() {
        return "------ ¡Menú general de McHamburguesas, tu menú confiable que nunca cambiará! ------\n";
    }
}
