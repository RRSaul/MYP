package Fabricas.Piezas;

public class PropulsorIntergalactico extends Propulsor {

    public PropulsorIntergalactico(){
        this.nombre = "Propulsor viaje intergalactico";
        this.descripcion = "Propulsor de nivel conquistador del Imperio Galactica";
        this.precio = 20;
        this.modAtaque = 0;
        this.modDefensa = 0;
        this.modVelocidad = 100;
        this.modPeso = 15;
    }

    /**
     * Método @Override de ensamblarPropulsor de propulsor.
     */
    @Override
    public void ensamblarPropulsor() {
        System.out.println("Ensamblando motor modular complejo cuantico.");
    }

    /**
     * Método @Override de montarEnNave de propulsor.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando base nueva adaptada.");
    }

    /**
     * Método @Override de abastecerCombustible de propulsor.
     */
    @Override
    public void abastecerCombustible() {
        System.out.println("Abesteciendo combustible de uranio plasmico 74.\n");
    }
}
