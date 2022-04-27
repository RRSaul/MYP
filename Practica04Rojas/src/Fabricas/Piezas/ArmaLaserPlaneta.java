package Fabricas.Piezas;

/**
 * Clase encargada de representar a el arma lasér destructor de planetas.
 */
public class ArmaLaserPlaneta extends Arma {

    public ArmaLaserPlaneta(){
        this.nombre = "Lasér destructor de planetas";
        this.descripcion = "Lasér de modular montado para exterminios planetarios";
        this.precio = 50;
        this.modAtaque = 100;
        this.modDefensa = -5;
        this.modVelocidad = -8;
        this.modPeso = 20;

    }

    /**
     * Método @Override de construirArma de arma.
     */
    @Override
    public void construirArma() {

        System.out.println("Ensamblando modulos.");

    }

    /**
     * Método @Override de conseguirMunición de arma.
     */
    @Override
    public void conseguirMunicion() {
        System.out.println("Almecenando cristales de bismuto 74 plasmatico.");

    }

    /**
     * Método @Override de montarEnNave de arma.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Modificando estructura. Montando modulos, .\n");

    }
}
