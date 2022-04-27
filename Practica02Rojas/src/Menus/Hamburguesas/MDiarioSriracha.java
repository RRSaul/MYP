package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa de pollo y salsa sriracha del menú diario.
 */


public class MDiarioSriracha extends Hamburguesa {

    public MDiarioSriracha(){
        id = 2002;
        nombre = "Hamburguesa de pollo y sriracha picante.";
        descripcion = "Hamburguesa de pollo, con queso amarillo, acompañada de todos nuestros vegetales, mayonesa, sriracha picante y pan clásico.";
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
        System.out.println("Poniendo queso amarillo.");

    }

    @Override
    public void ponerVegetales() {
        System.out.println( "Poniendo pepinillos, jitomate, lechuga y cebolla.");

    }

    @Override
    public void ponerCatsup() {
        System.out.println("Poniendo sriracha picante.");

    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan con ajonjolí.\n");
    }
}
