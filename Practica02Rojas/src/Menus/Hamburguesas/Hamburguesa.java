package Menus.Hamburguesas;

/**
 * Clase abstracta encargada de dar forma a las otras hamburguesas usando el patrón Template.
 */

public abstract class  Hamburguesa {
    //Datos de cada hamburguesa.
    int id;
    String nombre;
    String descripcion;
    float precio;
    boolean conQueso;
    boolean vegetariano;

    /**
     * Metodo encargada de regresar el nombre de la hamburguesa.
     * @return String nombre de la hamburguesa.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo encargado de regresar el id de la hamburguesa, se usa un entero de 4 cifras, para menús extras se
     * pueden usar más.
     * @return int id de la hamburguesa.
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo encargado de cocinar la hamburguesa, aqui es donde brilla Template.
     */
    public void cocinar(){
        ponerPanAbajo();
        ponerMayonesa();
        ponerMostaza();
        if(!vegetariano){
            prepararCarne();
            ponerCarne();
        }
        if(conQueso){
            ponerQueso();
        }
        ponerVegetales();
        ponerCatsup();
        ponerPan();

    }

    /**
     * Metodos encargados de cocinar paso a paso la hamburguesa. Todas las clases que extiendan de esta deben
     * sobrecargarlos.
     */
    public abstract void ponerPanAbajo();
    public abstract void ponerMayonesa();
    public abstract void ponerMostaza();
    public abstract void prepararCarne();
    public abstract void ponerCarne();
    public abstract void ponerQueso();
    public abstract void ponerVegetales();
    public abstract void ponerCatsup();
    public abstract void ponerPan();


    /**
     * @Override de toString, usado para representar la presentación de la hamburguesa en el menú.
     * @return String de la representacion en cadena de la hamburguesa.
     */
    @Override
    public String toString() {
        String siNoQueso = "Sí.";
        String siNoVege = "Si.";
        if(!conQueso){
            siNoQueso = "No.";
        }
        if(!vegetariano){
            siNoVege = "No.";
        }
        return  ("----"+nombre +" Precio: " + precio+ ", id: "+ id  +".----\n" +
                descripcion + "\n"+ "Vegetariano: "+ siNoVege + "\n" +
                "Con queso: " + siNoQueso + "\n");
    }
}
