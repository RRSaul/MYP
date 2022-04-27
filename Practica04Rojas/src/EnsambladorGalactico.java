import Fabricas.Piezas.Pieza;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Clase púbica encargada de manejar toda la contrucción de una nave de principio a fin, paso por paso.
 */
public class EnsambladorGalactico {

    /**
     * Constructor público de EnsambladorGalactico.
     */
    public EnsambladorGalactico(){
    }

    /**
     * Unico método público de la clase, una vez llamado lleva paso a paso al cliente en la construcción de su nave.
     */
    public void solicitarNuevaNave(){

        System.out.println("Bienvenido al Ensanblador Intergalactico del Imperio.\n");
        int presupuesto = Integer.parseInt(entradaConsola("Para construir su nave ingrese su presupuesto de millones de GE, recomendados como media 65 .\n").replaceAll("\\D+",""));
        boolean listo = false;
        //Primera construcción de nave.
        Nave nave = costruirNaveNueva();

        //Con este while se ciclara la creacion de naves hasta que el cliente esté sadisfecho o pueda pagarla, el valor
        // listo determina la salida
        while (!listo){
            soutNave(nave);

            //Se consigue la respuesta del cliente entre sí o no.
            String entradaBoolNaveLista = entradaConsola("¿Es esta la nave que desea? Ingrese Sí o No:\n");

            //Se checa si el presupuesto es suficiente y si el cliente está sadisfecho.
            if(presupuesto >= nave.getPrecioNave() && entradaBoolNaveLista.startsWith("s")){

                //El while solo se acabara si pasa por esta línea.
                listo= true;
            }else {

                //Se emite un mensaje si el presupuesto es insuficiente.
                if(presupuesto<nave.getPrecioNave()){

                    System.out.println("Su presupuesto es insuficiente.\n");
                }

                //Se consigue la respuesta del cliente de ver las naves precosntruidas, entre sí o no.
                String entradaBoolPreCons = entradaConsola("¿Desea seleccionar una de nuestras naves preconstruidas? Ingrese Sí o No:\n");

                //Se checa si se desea ver las naves preconstruidas..
                if(entradaBoolPreCons.startsWith("s")){

                    getInfoNavesPre();
                    String nombreNavePre = entradaConsola("Elija una nave preconstruida ingresando su nombre.\n");

                    //Se construye una nave en base a las preconstruidas, si la nave ingresada no está en el sistema se toma la más simple.
                    nave = construirNavesPre(nombreNavePre);

                    //Se lleva a este punto si no se a sido aceptada la nave construida ni alguna preconstruida.
                }else {

                    //Se consigue la respuesta del cliente si desea salir, entre sí o no.
                String entradaBoolSalida = entradaConsola("¿Desea salir? Ingrese Sí o No:\n");
                if(entradaBoolSalida.startsWith("s")) {
                    //Si desea salir se imprime una despedida y se termina el programa.
                    System.out.println("Gracias por usar el ensamblador galactico.\n");
                    System.exit(0);
                    }

                //Si no se desea salir se imprime una contiación y se manda llamar una nueva construccion.
                    System.out.println("Entonces.\n");;
                    nave = costruirNaveNueva();
                }
            }

        }

        //Se llega a este punto solo si se ha compleado exitosamente la construcción de una nave y se puede pagar. Se imprime la nave.
        soutNave(nave);
    }

    /**
     * Método privado encargado de desplegar la información de las naves ya preconstruidas.
     */
    private void getInfoNavesPre(){
        ArrayList<String> infoNavesPre = new ArrayList<>();
        infoNavesPre.add("El desglose de la nave Base espacial de guerra es:\n" +
                "Lasér destructor de planetas\n" +
                "Blindaje fortaleza\n" +
                "Cabina ejército\n" +
                "Propulsor viaje intergalactico\n" +
                "Precio: 133 millones de GE\n" +
                "Ataque: 105 Kilotones\n" +
                "Defensa: 27 atms\n" +
                "Velocidad: 89 Megametros/Hora\n" +
                "Peso: 89 Toneladas\n");
        infoNavesPre.add("El desglose de la nave Nave individual de combate es:\n" +
                "Lasér Simple\n" +
                "Blindaje simple\n" +
                "Cabina un piloto\n" +
                "Propulsor viaje intercontinental\n" +
                "Precio: 42 millones de GE\n" +
                "Ataque: 4 Kilotones\n" +
                "Defensa: 15 atms\n" +
                "Velocidad: 21 Megametros/Hora\n" +
                "Peso: 43 Toneladas\n");
        infoNavesPre.add("El desglose de la nave Nave militar de transporte es:\n" +
                "Misiles de plasma\n" +
                "Blindaje reforzado\n" +
                "Cabina tripulación pequeña\n" +
                "Propulsor viaje interplanetario\n" +
                "Precio: 65 millones de GE\n" +
                "Ataque: 12 Kilotones\n" +
                "Defensa: 20 atms\n" +
                "Velocidad: 35 Megametros/Hora\n" +
                "Peso: 64 Toneladas\n");

        for (String des: infoNavesPre) {
            System.out.println(des);
        }
    }

    /**
     * Método privado encargado de contruir una nave precostruida en base a un nombre.
     * @param nombreNave String nombre de la nave a contruir,
     * @return Nave La nave a contruida, si no se reconoce el nombre se construye la más simple.
     */
    private Nave construirNavesPre(String nombreNave){

        if(nombreNave.equals("navemilitartransporte")){
            Constructor consNavMiliTrans = new Nave.ConstructorNave();
            consNavMiliTrans.nombrarNave("Nave militar de transporte");
            consNavMiliTrans.fabricaNuevaArma("misilesdeplasma");
            consNavMiliTrans.fabricaNuevoBlindaje("blindajereforzado");
            consNavMiliTrans.fabricaNuevaCabina("cabinatripulacionpequena");
            consNavMiliTrans.fabricaNuevoPropulsores("propulsorviajeinterplanetario");

            return consNavMiliTrans.construir();
        }

        if(nombreNave.equals("baseespacialdeguerra")){

            Constructor consBaseEsp = new Nave.ConstructorNave();
            consBaseEsp.nombrarNave("Base espacial de guerra");
            consBaseEsp.fabricaNuevaArma("laserdestructordeplanetas");
            consBaseEsp.fabricaNuevoBlindaje("blindajefortaleza");
            consBaseEsp.fabricaNuevaCabina("cabinaejercito");
            consBaseEsp.fabricaNuevoPropulsores("propulsorviajeintergalactico");
            return consBaseEsp.construir();
        }

        if(!nombreNave.equals("naveindividualdecombate")){
            System.out.println("No se ha reconocido tu entrada, se usará la nave de minima normatividad.\n");
        }

        Constructor consIndiComba = new Nave.ConstructorNave();
        consIndiComba.nombrarNave("Nave individual de combate");
        consIndiComba.fabricaNuevaArma("lasersimple");
        consIndiComba.fabricaNuevoBlindaje("blindajesimple");
        consIndiComba.fabricaNuevaCabina("cabinaunpiloto");
        consIndiComba.fabricaNuevoPropulsores("propulsorviajeintercontinental");
        return consIndiComba.construir();
    }

    /**
     * Método privado encargado de contruir una nave. Aqui se maneja el ingreso de datos paso a paso.
     * @return Nave la nave ya construida en base a las intrucciones del cliente.
     */
    private Nave costruirNaveNueva(){


        System.out.println("Preparando la construcción de una nueva nave.\n" +
                "La carga incial de millones de GE por su construcción es de 25.\n");
        Constructor constructor = new Nave.ConstructorNave();
        //Solicita que se introdusca el nombre de cada pieza, una por una.

        constructor = constructor.nombrarNave(entradaConsolaSinLimpiar("Nombre su nave.\n"));

        constructor = constructor.fabricaNuevaArma(entradaConsola("Elija un sistema de armamento ingresando su nombre:\n"
                ,constructor.getArmasEnFabrica()));

        constructor = constructor.fabricaNuevoBlindaje(entradaConsola("Elija un exoesqueleto de blindaje ingresando su nombre:\n",
                constructor.getBlindajesEnFabrica()));

        constructor = constructor.fabricaNuevaCabina(entradaConsola("Elija una cabina ingresando su nombre:\n",
                constructor.getCabinasEnFabrica()));

        constructor = constructor.fabricaNuevoPropulsores(entradaConsola("Elija un sistema de propulsión ingresando su nombre:\n",
                constructor.getPropulsoresEnFabrica()));

        return constructor.construir();
    }


    /**
     * Metodo privado encargado de imprimir las caracteristicas y componentes de una nave dada.
     * @param nave Nave la nave a desplegar
     */
    private void soutNave(Nave nave){

        System.out.println("El desglose de la nave "+ nave.getNombre()+" es:\n" +
                nave.getArma().getNombre() +"\n" +
                nave.getBlindaje().getNombre() +"\n" +
                nave.getCabina().getNombre() +"\n" +
                nave.getPropulsor().getNombre() +"\n" +
                "Precio: "+nave.getPrecioNave()+ " millones de GE\n" +
                "Ataque: " + nave.getAtaqueNave()+ " Kilotones\n" +
                "Defensa: "+nave.getDefensaNave()+" atms\n" +
                "Velocidad: "+ nave.getVelocidadNave()+" Megametros/Hora\n" +
                "Peso: "+nave.getPesoNave()+" Toneladas\n");

    }

    /**
     *
     * Metodo privado encargado de recibir la pieza escrita en consola.
     * @param soutTexto String el mensaje que imprimir en consola para el cliente
     * @param piezas HashMap<String,Pieza> las piezas a desplegar, se debe ingresar el nombre de una de ellas en consola.
     * @return String limpio de la entrada en consola y sin espacios en blanco.
     */
    private String entradaConsola(String soutTexto, HashMap<String, Pieza> piezas){
        System.out.println(soutTexto);

        for(Map.Entry<String, Pieza> entrada : piezas.entrySet()) {
            Pieza piezaInterna = entrada.getValue();

            System.out.println(piezaInterna.getNombre() +"\n" +
                    piezaInterna.getDescripcion() + "\n" +
                    piezaInterna.getPrecio()+ " millones de GE\n" +
                    "Mod Ataque: " + piezaInterna.getModAtaque()+ " Kilotones\n" +
                    "Mod Defensa: "+piezaInterna.getModDefensa()+" atms\n" +
                    "Mod Velocidad: "+ piezaInterna.getModVelocidad()+" Megametros/Hora\n" +
                    "Mod Peso: "+piezaInterna.getModPeso()+" Toneladas\n");
        }

        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        entrada = entrada.replaceAll("\\s","");
        return limpiaString(entrada);

    }



    /**
     * Metodo privado encargado de recibir lo escrito en consola.
     * @param soutTexto String el mensaje que imprimir en consola para el cliente
     * @return String limpio de la entrada en consola y sin espacios en blanco.
     */
    private String entradaConsola(String soutTexto){
        System.out.println(soutTexto);
        Scanner input = new Scanner(System.in);
        String entrada = input.nextLine();
        entrada = entrada.replaceAll("\\s","");
        return limpiaString(entrada);

    }

    /**
     * Metodo privado encargado de recibir lo escrito en consola.
     * @param soutTexto String el mensaje que imprimir en consola para el cliente
     * @return String tal cual ingresado.
     */
    private String entradaConsolaSinLimpiar(String soutTexto){
        System.out.println(soutTexto);
        Scanner input = new Scanner(System.in);
        return input.nextLine();

    }
    /**
     * Metodo privado encargado de limpiar la cadena dada, le quita la acentuación, la puntuación y la convierte a minusculas.
     * @param string la cadena a limpiar.
     * @return String la cadena limpia.c vo
     */
    private String limpiaString(String string){
        return  Normalizer.normalize(string,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
    }
}
