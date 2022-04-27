package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa clásica del menú general.
 */
public class MGeneralClasica extends Hamburguesa {

    public MGeneralClasica(){
        id = 1001;
        nombre = "Hamburguesa clasica.";
        descripcion = "Hamburguesa clásica de res, queso amarillo, acompañada de todos nuestros vegetales, mayonesa, mostaza, catsup y pan clásico.";
        precio = 24.4f;
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
        System.out.println("Friendo carne a la plancha.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo carne de res.");

    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso amarillo.");

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
