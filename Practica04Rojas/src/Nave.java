import Fabricas.Piezas.Arma;
import Fabricas.Piezas.Blindaje;
import Fabricas.Piezas.Cabina;
import Fabricas.Piezas.Propulsor;

/**
 * Clase pública encargada de representar una nave.
 * Esta es una de las partes centrales del ṕatrón Builder.
 */
public class Nave {

    //Las variables son privadas, asi no se pueden accesar desde afuera.
    //Las variables son finales, una vez que se han asignado no se pueden cambiar, esto amplifica la idea de que es construida.
    private final String nombre;
    private final Arma arma;
    private final Blindaje blindaje;
    private final Cabina cabina;
    private final Propulsor propulsor;

    //Las cualidades dependen de las partes de la nave.
    private final int ataqueNave;
    private final int defensaNave;
    private final int velocidadNave;
    private final int pesoNave;
    private final int precioNave;

    /**
     * Constructor privado de la clase Nave, asi no se puede instaciar desde afuera.
     * @param constructorNaves ConstructorNave recibe un constructor desde el cual se basa para asignarle un
     *                         valor a las variables de clase.
     */
    private Nave(ConstructorNave constructorNaves) {

        //Se asignan todas las partes.
        this.nombre = constructorNaves.nombre;
        this.arma = constructorNaves.armaParaNave;
        this.blindaje = constructorNaves.blindajeParaNave;
        this.cabina = constructorNaves.cabinaParaNave;
        this.propulsor = constructorNaves.propulsorParaNave;

        //Se calculan las cualidades de la nave en base a sus partes.
        this.ataqueNave = 2 + arma.getModAtaque() + blindaje.getModAtaque() + cabina.getModAtaque() + propulsor.getModAtaque();
        this.defensaNave = 10 + arma.getModDefensa() + blindaje.getModDefensa() + cabina.getModDefensa() + propulsor.getModDefensa();
        this.velocidadNave = 10 + arma.getModVelocidad() + blindaje.getModVelocidad() + cabina.getModVelocidad() + propulsor.getModVelocidad();
        this.pesoNave = 30 + arma.getModPeso() + blindaje.getModPeso() + cabina.getModPeso() + propulsor.getModPeso();
        this.precioNave = 25 + arma.getPrecio() + blindaje.getPrecio() + cabina.getPrecio() + propulsor.getPrecio();

    }

    /**
     * Método encargado de devolver el arma de la nave.
     * @return Arma el arma de la nave.
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Método encargado de devolver el blindaje de la nave.
     * @return Blidaje el blindaje de la nave.
     */
    public Blindaje getBlindaje() {
        return blindaje;
    }

    /**
     * Método encargado de devolver la cabina de la nave.
     * @return Cabina la cabina de la nave.
     */
    public Cabina getCabina() {
        return cabina;
    }

    /**
     * Método encargado de devolver el propulsor de la nave.
     * @return Propulsor el propulsor de la nave.
     */
    public Propulsor getPropulsor() {
        return propulsor;
    }

    /**
     * Método encargado de devolver el nombre de la nave.
     * @return String el nombre de la nave.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método encargado de devolver la cualidad ataque de la nave.
     * @return int el ataque de la nave.
     */
    public int getAtaqueNave() {
        return ataqueNave;
    }

    /**
     * Método encargado de devolver la cualidad defensa de la nave.
     * @return int la defensa de la nave.
     */
    public int getDefensaNave() {
        return defensaNave;
    }

    /**
     * Método encargado de devolver la cualidad velocidad de la nave.
     * @return int la velocidad de la nave.
     */
    public int getVelocidadNave() {
        return velocidadNave;
    }

    /**
     * Método encargado de devolver la cualidad peso de la nave.
     * @return int el peso de la nave.
     */
    public int getPesoNave() {
        return pesoNave;
    }

    /**
     * Método encargado de devolver la cualidad precio de la nave.
     * @return int el precio de la nave.
     */
    public int getPrecioNave() {
        return precioNave;
    }


    /**
     * Clase pública estatica encargada de asistir en la construcción de una nave, se encuentra en el mismo script
     * par que asi pueda accedar al constructor privado de Nave.
     */
    public static class ConstructorNave extends Constructor {

        /**
         * @Override del método nombrarNave de Constructor.
         * @param nombre String nombre de la nave.
         * @return Constructor el constructor actualizado.
         */
        @Override
        public Constructor nombrarNave(String nombre) {
            this.nombre = nombre;
            return this;
        }

        /**
         * @Override del método construir de Constructor.
         * @return Nave la nave contruida, manda a llamar el constructor de Nave.
         */
        @Override
        public Nave construir() {
            return new Nave(this);
        }

        /**
         * Método encargado de la contrucción de una nueva arma para la nave.
         * @param arma String nombre del arma.
         * @return El constructor actualizado,
         */
        @Override
        public Constructor fabricaNuevaArma(String arma) {
            this.armaParaNave = (Arma) fabricaArmas.crearPieza(arma);
            return this;
        }

        /**
         * Método encargado de la contrucción de un nuevo blindaje para la nave.
         * @param blindaje String nombre del blindaje.
         * @return El constructor actualizado,
         */
        @Override
        public Constructor fabricaNuevoBlindaje(String blindaje) {
            this.blindajeParaNave = (Blindaje) fabricaBlindajes.crearPieza(blindaje);
            return this;
        }

        /**
         * Método encargado de la contrucción de una nueva cabina para la nave.
         * @param cabina String nombre de la cabina.
         * @return El constructor actualizado,
         */
        @Override
        public Constructor fabricaNuevaCabina(String cabina) {
            this.cabinaParaNave = (Cabina) fabricaCabinas.crearPieza(cabina);
            return this;
        }

        /**
         * Método encargado de la contrucción de una nuevo propulsor para la nave.
         * @param propulsores String nombre del propulsor.
         * @return El constructor actualizado,
         */
        @Override
        public Constructor fabricaNuevoPropulsores(String propulsores) {
            this.propulsorParaNave = (Propulsor) fabricaPropulsores.crearPieza(propulsores);
            return this;
        }
    }
}
