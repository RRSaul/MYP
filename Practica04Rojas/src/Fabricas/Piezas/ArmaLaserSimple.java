package Fabricas.Piezas;

/**
 * Clase encargada de representar a el arma lasér simple.
 */
public class ArmaLaserSimple extends Arma {

    public ArmaLaserSimple(){
        this.nombre = "Lasér Simple";
        this.descripcion = "Lasér de minima normatividad para las naves del Imperio Galactica";
        this.precio = 5;
        this.modAtaque = 1;
        this.modDefensa = 2;
        this.modVelocidad = 0;
        this.modPeso = 2;

    }
    /**
     * Método @Override de construirArma de arma.
     */
    @Override
    public void construirArma() {

        System.out.println("Ensamblando lasér.");

    }

    /**
     * Método @Override de conseguirMunicion de arma.
     */
    @Override
    public void conseguirMunicion() {
        System.out.println("Almecenando cristales de bismuto.");

    }

    /**
     * Método @Override de montarEnNave de arma.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando lasérs en bases giratorias.\n");

    }
}
