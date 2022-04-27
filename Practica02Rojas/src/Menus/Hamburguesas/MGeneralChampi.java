package Menus.Hamburguesas;
/**
 * Clase encargada de la hamburguesa de champiñones del menú general.
 */
public class MGeneralChampi extends Hamburguesa {

    public MGeneralChampi(){
        id = 1003;
        nombre = "Hamburguesa clasica champiñon.";
        descripcion = "Hamburguesa de champiñones varios, queso maozzarella, acompañada de todos nuestros vegetales, mayonesa, mostaza y pan clásico.";
        precio = 26.6f;
        conQueso = true;
        vegetariano = true;

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


    }

    @Override
    public void ponerCarne() {

    }

    @Override
    public void ponerQueso() {
        System.out.println("Poniendo queso mozzarella.");

    }

    @Override
    public void ponerVegetales() {
        System.out.println("Poniendo championes cocidos.\n" +
                 "Poniendo pepinillos, jitomate, lechuga y cebolla.");

    }

    @Override
    public void ponerCatsup() {

    }
    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan con ajonjolí.\n");

    }

}
