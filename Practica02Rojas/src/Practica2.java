import Menus.Hamburguesas.*;
import Menus.MenuDiario;
import Menus.MenuLujo;
import java.text.Normalizer;
import java.util.Scanner;

/**
 * Clase principal de la practica, esta incia la simulación y la mantiene en ejecución hasta que se le
 * indique en consola.
 */

public class Practica2 {
    //El robot de la simulación.
    static RobotRestaurante robotRestaurante;

    /**
     * Metodo principal de la clase y el que se ejecuta al iniciar el programa.
     * @param args No es necesario el paso de argumentos.
     */
    public static void main(String[] args) {
        //Iniciamos al robot y a los menús.
        robotRestaurante = new RobotRestaurante();
        MenuDiario menuDiario = new MenuDiario();
        MenuLujo menuLujo = new MenuLujo();

        //Como el menú diario cambia cada día, le agregamos las hamburguesas al iniciar la simulación.
        menuDiario.agregarHamburguesaMD(new MDiarioCebollaBbq());
        menuDiario.agregarHamburguesaMD(new MDiarioDoble());
        menuDiario.agregarHamburguesaMD(new MDiarioPolloPlancha());
        menuDiario.agregarHamburguesaMD(new MDiarioSriracha());

        //Igualmente al menú de lujo.
        menuLujo.agregarHamburguesaML(new MLujoCubano());
        menuLujo.agregarHamburguesaML(new MLujoTeriyaki());
        menuLujo.agregarHamburguesaML(new MLujoTocinoVegie());

        //Agregamos los menús y saludos.
        robotRestaurante.agregaMenu(menuDiario);
        robotRestaurante.agregaMenu(menuLujo);
        robotRestaurante.saludar();
        robotRestaurante.soutMenuCompleto();

        //Este metodo mantiene la simulación a flote.
        manejaOrdenes();
    }


    /**
     * Metodo encargado de manejar las ordenes que ingresan por consola, las ordenes disponibles son:
     * "suspenderse" manda a llamar el metodo suspenderse() del robot.
     * "caminaracliente" manda  llamar el metodo caminarACliente() del robot.
     * "cocinar" manda a llamar el metodo cocinar() del robot, recibe la id del platillo a cocinar.
     * "atender" manda a llamar el metodo atender() del robot.
     * "salir" termina la simulación.
     * Si no reconoce la orden la vuelve a pedír.
     * El metodo se manda a llamar a si mismo para mantener la simulación.
     */
    private static void manejaOrdenes(){
        String[] orden = interpreteCosola();
        switch (orden[0]){
            case "suspenderse":
                robotRestaurante.suspenderse();
                manejaOrdenes();
                break;
            case "caminaracliente":
                robotRestaurante.caminarACliente(orden[1]);
                manejaOrdenes();
                break;
            case "cocinar":
                robotRestaurante.cocinar(Integer.parseInt(orden[1]));
                manejaOrdenes();
                break;
            case "atender":
                robotRestaurante.atender();
                manejaOrdenes();
                break;
            case "salir":
                System.out.println("\"¡Volverás pronto a McHamburguesas, humano, lo se!\"\n" +
                        "--- Programa terminado. ---\n");
                System.exit(0);
                break;
            default:
                System.out.println("\"¡Ingresa una orden valida, humano, revisa tu ortografía!\"\n");
                manejaOrdenes();
                break;

        }
    }

    /**
     * Metodo encargado de recibir una linea por consola y trasformarla a una cadena lejible para el
     * metodo manejarOrdenes(). La primera frase toda junta será la orden, despues del espacio, el argumento,
     * no todas las ordenes necesitan argumento.
     * @return String la representación de cadena de la orden.
     */
    private static String[] interpreteCosola(){

        System.out.println("\"¡Ingresa tu orden, humano!\"\n");
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();

        //Corta la cadena por espacios en blanco.
        String[] entradaArray = entrada.split("\\s");
        String argumento = "";

        //Se encarga de que no haya errores en ordenes sin argumento.
        if(entradaArray.length>1){
            argumento = limpiaString(entradaArray[1]);
        }
        return  new String[]{ limpiaString(entradaArray[0]), argumento  };


    }

    /**
     * Metodo encargado de limpiar la cadena dada, le quita la acentuación, la puntuación y la convierte a minusculas.
     * @param string la cadena a limpiar.
     * @return String la cadena limpia.
     */
    private static String limpiaString(String string){
        return  Normalizer.normalize(string,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
    }



}
