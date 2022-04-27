package Menus.Hamburguesas;
/**
 * Clase encargada del emparedado cubano del menú de lujo.
 */
public class MLujoCubano extends Hamburguesa {

    public MLujoCubano(){
        id = 3001;
        nombre = "Emparedado cubano.";
        descripcion = "Emparedado de cerdo, con jamón ahumado, mostaza, pepinillos, queso y pan cubano tostado con mantequilla.";
        precio = 40.5f;
        conQueso = true;
        vegetariano = false;

    }

    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan cubano, caliente a la plancha.");

    }

    @Override
    public void ponerMayonesa() {

    }

    @Override
    public void ponerMostaza() {
        System.out.println("Untando mostaza clásica, de lado a lado y de regreso.");


    }

    @Override
    public void prepararCarne() {
        System.out.println("Friendo cerdo a la plancha." +
                "Salteando el jamón.\n");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo cerdo y jamón.");

    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo dos lonchas de queso.");

    }

    @Override
    public void ponerVegetales() {
        System.out.println( "Poniendo pepinillos.");

    }

    @Override
    public void ponerCatsup() {

    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan cubano, terminando a presión.\n");
    }
}
