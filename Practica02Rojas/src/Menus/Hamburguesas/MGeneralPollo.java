package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa clásica de pollo del menú general.
 */
public class MGeneralPollo extends Hamburguesa {

    public MGeneralPollo(){
        id = 1002;
        nombre = "Hamburguesa clásica de pollo.";
        descripcion = "Hamburguesa clásica de pollo frito, acompañada de todos nuestros vegetales, mayonesa, mostaza, catsup y pan clásico.";
        precio = 24.4f;
        conQueso = false;
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
        System.out.println("Friendo pollo en la freidora.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo pollo frito.");

    }

    @Override
    public void ponerQueso() {

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
