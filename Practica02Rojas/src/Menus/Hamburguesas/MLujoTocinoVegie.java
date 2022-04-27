package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa vegana de tocino del menú de lujo.
 */
public class MLujoTocinoVegie extends Hamburguesa {

    public MLujoTocinoVegie(){
        id = 3003;
        nombre = "Hamburguesa de tocino y filete vegie.";
        descripcion = "Hamburguesa de filete de seitán y tocino vegano, acompañada de todos nuestros vegetales, mayonesa vegana, mostaza, catsup y pan blanco.";
        precio = 38.8f;
        conQueso = false;
        vegetariano = true;

    }

    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan blaco, caliente a la plancha.");

    }

    @Override
    public void ponerMayonesa() {
        System.out.println("Untando mayoneza vegana");
    }

    @Override
    public void ponerMostaza() {
        System.out.println("Untando mostaza clásica.");


    }

    @Override
    public void prepararCarne() {
        System.out.println("Friendo seitán y tocino.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo filete y tocino.");

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
        System.out.println("Finalizando con pan blanco.\n");
    }
}
