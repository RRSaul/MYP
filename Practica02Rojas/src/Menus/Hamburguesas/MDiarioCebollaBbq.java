package Menus.Hamburguesas;

/**
 * Clase encargada de la hamburguesa de cebolla barbeque del menú diario.
 */

public class MDiarioCebollaBbq extends Hamburguesa {

    public MDiarioCebollaBbq(){
        id = 2003;
        nombre = "Hamburguesa cebolla Bbq.";
        descripcion = "Hamburguesa de res, con mayonesa, salsa barbeque, pan alargado y aros de cebolla frita.";
        precio = 26.6f;
        conQueso = false;
        vegetariano = false;

    }

    @Override
    public void ponerPanAbajo() {
        System.out.println("Poniendo pan largo, caliente por la plancha.");

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
        System.out.println("Friendo carne a la plancha.");

    }

    @Override
    public void ponerCarne() {
        System.out.println("Poniendo carne de res.");

    }

    @Override
    public void ponerQueso() {

    }

    @Override
    public void ponerVegetales() {
        System.out.println( "Poniendo aros de cebolla fritos.");

    }

    @Override
    public void ponerCatsup() {
        System.out.println("Poniendo salsa barbeque.");
    }

    @Override
    public void ponerPan() {
        System.out.println("Finalizando con pan alargado con ajonjolí.\n");
    }
}
