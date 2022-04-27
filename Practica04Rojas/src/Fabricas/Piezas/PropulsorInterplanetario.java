package Fabricas.Piezas;

public class PropulsorInterplanetario extends Propulsor {

    public PropulsorInterplanetario(){
        this.nombre = "Propulsor viaje interplanetario";
        this.descripcion = "Propulsor de nivel armada del Imperio Galactico";
        this.precio = 20;
        this.modAtaque = 0;
        this.modDefensa = 0;
        this.modVelocidad = 30;
        this.modPeso = 15;
    }

    /**
     * Método @Override de ensamblarPropulsor de propulsor.
     */
    @Override
    public void ensamblarPropulsor() {
        System.out.println("Ensamblando motor modular complejo.");
    }

    /**
     * Método @Override de montarEnNave de propulsor.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando en la base nuclear de la estructura.");
    }

    /**
     * Método @Override de abastecerCombustible de propulsor.
     */
    @Override
    public void abastecerCombustible() {
        System.out.println("Abesteciendo combustible de uranio plasmico.\n");
    }
}
