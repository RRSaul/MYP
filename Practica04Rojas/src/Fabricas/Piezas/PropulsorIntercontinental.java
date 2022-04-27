package Fabricas.Piezas;

/**
 * Clase encargada de representar a el propulsor intercontinental.
 */
public class PropulsorIntercontinental extends Propulsor {

    public PropulsorIntercontinental(){
        this.nombre = "Propulsor viaje intercontinental";
        this.descripcion = "Propulsor de minima normatividad para las naves del Imperio Galactica";
        this.precio = 8;
        this.modAtaque = 0;
        this.modDefensa = 0;
        this.modVelocidad = 8;
        this.modPeso = 5;
    }

    /**
     * Método @Override de ensamblarPropulsor de propulsor.
     */
    @Override
    public void ensamblarPropulsor() {
        System.out.println("Ensamblando motor modular simple.");
    }

    /**
     * Método @Override de montarEnNave de propulsor.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando en la base de la estructura.");
    }

    /**
     * Método @Override de abastecerCombustible de propulsor.
     */
    @Override
    public void abastecerCombustible() {
        System.out.println("Abesteciendo combustible de uranio.\n");
    }
}
