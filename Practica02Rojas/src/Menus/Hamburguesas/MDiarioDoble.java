package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa doble del menú diario.
 */

public class MDiarioDoble extends Hamburguesa {

    public MDiarioDoble(){
        id = 2001;
        nombre = "Hamburguesa doble de res.";
        descripcion = "Hamburguesa con queso amarillo, acompañada de todos nuestros vegetales, mayonesa, mostaza, catsup, pan clásico y dos filetes de res.";
        precio = 29.9f;
        conQueso = true;
        vegetariano = false;

    }

    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan, caliente por la plancha.");

    }

    @Override
    public void ponerMayonesa() {
        System.out.println("Poniendo mayonesa clásica.");

    }

    @Override
    public void ponerMostaza() {
        System.out.println("Poniendo mostaza clásica.");

    }

    @Override
    public void prepararCarne() {
        System.out.println("Friendo ambos filetes.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo el primer filete.");

    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso amarillo y encima de él, otro filete.");

    }

    @Override
    public void ponerVegetales() {
        System.out.println( "Poniendo pepinillos, jitomate, lechuga y cebolla.");

    }

    @Override
    public void ponerCatsup() {
        System.out.println("Poniendo catsup clásica.");

    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan con ajonjolí.\n");
    }
}
