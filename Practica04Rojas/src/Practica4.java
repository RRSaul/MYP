/**
 * Clase pública encargada de ejecutar la práctica.
 */
public class Practica4 {

    /**
     * Método público estatico main, este método se manda a llamar al hacer ejecutar la práctica.
     * @param args String[] No se necesitan argumetos para esta practica.
     */
    public static void main(String[] args) {
        //Se crea un nuevo ensamblador y se manda a llamar su método solicitarNuevaNave.
        EnsambladorGalactico ensambladorGalactico = new EnsambladorGalactico();
        ensambladorGalactico.solicitarNuevaNave();
    }
}
