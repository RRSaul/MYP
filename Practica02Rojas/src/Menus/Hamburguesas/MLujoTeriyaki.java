package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa teriyaki del menú de lujo.
 */
public class MLujoTeriyaki extends Hamburguesa {

    public MLujoTeriyaki(){
        id = 3002;
        nombre = "Hamburguesa res teriyaki.";
        descripcion = "Hamburguesa clásica de res, piña a la parrilla, mayonesa, salsa teriyaki, pepinillos, todos nuestros vegetales y pan clásico.";
        precio = 38.8f;
        conQueso = false;
        vegetariano = false;

    }

    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan, caliente a la plancha.");
    }

    @Override
    public void ponerMayonesa() {
        System.out.println("Untando mayoneza");
    }

    @Override
    public void ponerMostaza() {
        System.out.println("Untando mostaza.");
    }

    @Override
    public void prepararCarne() {
        System.out.println("Friendo carne y piña en la plancha.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo carne y piña.");

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
        System.out.println("Untando salsa teriyaki.");

    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan clásico.\n");
    }
}
