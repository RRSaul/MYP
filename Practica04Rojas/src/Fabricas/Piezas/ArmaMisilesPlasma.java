package Fabricas.Piezas;

/**
 * Clase encargada de representar a el arma misiles de plasma.
 */
public class ArmaMisilesPlasma extends Arma {

    public ArmaMisilesPlasma(){
        this.nombre = "Misiles de plasma";
        this.descripcion = "Lanzadores de misiles de carga plasmatica";
        this.precio = 10;
        this.modAtaque = 10;
        this.modDefensa = 0;
        this.modVelocidad = -1;
        this.modPeso = 6;

    }

    /**
     * Método @Override de construirArma de arma.
     */
    @Override
    public void construirArma() {

        System.out.println("Ensamblando lanzaderas.");

    }

    /**
     * Método @Override de conseguirMunicion de arma.
     */
    @Override
    public void conseguirMunicion() {
        System.out.println("Almecenando cargas plasaticas en misiles.");

    }

    /**
     * Método @Override de montarEnNave de arma.
     */
    @Override
    public void montarEnNave() {
        System.out.println("Montando lanzaderas de 10 cargas.\n");

    }
}
