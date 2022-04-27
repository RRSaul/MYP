/**
 * Clase pública encargada de ejecutar la práctica. Como se especifica que la tienda es la que atiende, se mandan a llamar
 * sus metodos.
 */
public class Practica3 {

    //La tienda de la práctica.
    static WaySub waySub;

    /**
     * Metodo main de la práctica y el proyecto, esta inicializa la tienda y empieza el pedido.
     * @param args No se necesitan argumentos, pues se necesita un menú interactivo.
     */
    public static void main(String[] args) {
        waySub = new WaySub();
        waySub.pedirComida();
    }
}
