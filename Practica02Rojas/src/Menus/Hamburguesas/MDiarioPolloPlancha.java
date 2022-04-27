package Menus.Hamburguesas;
/**
 * Clase encargada de pollo a la plancha del menú diario.
 */


public class MDiarioPolloPlancha extends Hamburguesa {

    public MDiarioPolloPlancha(){
        id = 2004;
        nombre = "Hamburguesa de pollo a la plancha.";
        descripcion = "Hamburguesa de pollo a la plancha, acompañada de todos nuestros vegetales, aderezo ranch y pan clásico.";
        precio = 27.7f;
        conQueso = false;
        vegetariano = false;

    }
    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan, caliente por la plancha.");

    }

    @Override
    public void ponerMayonesa() {

    }

    @Override
    public void ponerMostaza() {


    }

    @Override
    public void prepararCarne() {
        System.out.println("Friendo pollo en la plancha.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo carne de pollo.");

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
        System.out.println("Poniendo aderezo ranch.");
    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan alargado con ajonjolí.\n");
    }
}
