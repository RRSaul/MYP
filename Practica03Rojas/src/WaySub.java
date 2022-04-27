import java.text.Normalizer;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase pública encargada de representar a la tienda WaySub, esta maneja tanto las baguettes como las pizzas.
 */
public class WaySub {

    //Se tiene una lista de pizzas ya guardada.
    LinkedList<Pizza> pizzas;
    //Se guarda la ultima baguette envuelta por el ultimo ingrediente.
    Baguette ultimaBaguette;

    /**
     * Constructor público para la clase WaySup, inicializa la lista de pizzas.
     */
    public WaySub(){
        pizzas = new LinkedList<>();
        pizzas.addLast(new PizzaGranCrangrejo());
        pizzas.addLast(new PizzaJamonClasica());
        pizzas.addLast(new PizzaMeatLovers());
        pizzas.addLast(new PizzaPollo());
        pizzas.addLast(new PizzaSalchedar());
    }


    /**
     * Metodo público encargado de manejar los pedidos de comida a la tienda. Es el unico metodo público de la clase.
     */
    public void pedirComida(){
        System.out.println("¡Hola y bienvenido a WaySub, ahora con las pizzas de don cangrejo!\n" +
                "Nuetras baguettes, hechas al momento, son perfectas para ti, que quieres TU comida a TU medida.\n" +
                "Elige de entre nuestros frescos ingredientes y agregalos a tu gusto.\n" +
                "Pollo, pepperoni, jamón, lechuga, jitomate, cebolla, mostaza, catsup y mayonesa.\n" +
                "O elige entre una de nuestras 5 deleciosas pizzas.\n");
        soutPizzas();
        Producto comida = manejadorDeElecciones();
        imprimirTicket(comida);
    }

    /**
     * Metodo privado encargado de manejar las elecciones de pizza, baguette o salida que entra a consola.
     * @return Producto el producto que el cliente pidió, por las interfaz, se manejan de la misma manera
     * tanto las pizzas como la baguette.
     */
    private Producto manejadorDeElecciones(){
        String eleccion = entradaConsola("Para pedir su baguette ingrese \"baguette\", para pedir pizza ingrese \"pizza\", o \"salir\" para salir.");
            switch (eleccion){
                case "baguette":
                    return pedirBaguette();
                case "pizza":
                    return pedirPizza();
                case "salir":
                    System.out.println("Gracias por preferir WaySub");
                    System.exit(0);
                    break;
                default:
                    System.out.println("No se ha reconocido su elección, por favor revisela.");
                    manejadorDeElecciones();
                    break;
            }
        return null;
    }

    /**
     * Metodo privado encargado de manejar el pedido de la baguette.
     * @return Baguette la baguette creada por el cliente. El metodo manda a llamar a un metodo interno.
     */
    private Baguette pedirBaguette(){
        Baguette baguette = new Baguette();
        return pedirBaguetteInterno(baguette);
    }

    /**
     * Metodo privado encargada de manejar el pedido de la baguette. El metodo se manda a llamar a si mismo para seguir
     * envolviendo a la baguette por con ingredientes.
     * @param baguetteInterno Baguette envuelta por un ingrediente.
     * @return La ultima baguette envuelta por el ultimo ingrediente.
     */
    private Baguette pedirBaguetteInterno(Baguette baguetteInterno){
        System.out.println(baguetteInterno.getDescripcion() +", por :"+ Math.ceil(baguetteInterno.getCosto())+".\n");
        String ingrediente = entradaConsola("Ingrese el ingrediente que desee agregar:\n" +
                "Pollo, pepperoni, jamón, lechuga, jitomate, cebolla, mostaza, catsup y mayonesa.\n" +
                "Cuando esté sadisfecho ingrese \"listo\", para cancelar ingrese \"salir\".\n");

        switch (ingrediente){
            case "pollo":
                pedirBaguetteInterno(new IngredientePollo(baguetteInterno));
                break;
            case "pepperoni":
                pedirBaguetteInterno(new IngredientePepperoni(baguetteInterno));
                break;
            case "jamon":
                pedirBaguetteInterno(new IngredienteJamon(baguetteInterno));
                break;
            case "lechuga":
                pedirBaguetteInterno(new IngredienteLechuga(baguetteInterno));
                break;
            case "jitomate":
                pedirBaguetteInterno(new IngredienteJitomate(baguetteInterno));
                break;
            case "cebolla":
                pedirBaguetteInterno(new IngredienteCebolla(baguetteInterno));
                break;
            case "mostaza":
                pedirBaguetteInterno(new IngredienteMostaza(baguetteInterno));
                break;
            case "catsup":
                pedirBaguetteInterno(new IngredienteCatsup(baguetteInterno));
                break;
            case "mayonesa":
                pedirBaguetteInterno(new IngredienteMayonesa(baguetteInterno));
                break;
            case "listo":
                ultimaBaguette = baguetteInterno;
                return baguetteInterno;
            case "salir":
                System.out.println("Gracias por preferir WaySub");
                System.exit(0);
                break;
            default:
                System.out.println("No se ha reconocido su elección, por favor revisela.");
                pedirBaguetteInterno(baguetteInterno);
                break;
        }

        return ultimaBaguette;
    }

    /**
     * Metodo privado encargado de manejar el pedido de una pizza.
     * @return PizzaAdaptador de la pizza pedida, regresa el adaptador de la pizza escogida.
     */

    private PizzaAdaptador pedirPizza(){
        soutPizzas();
        String pizza = entradaConsola("Ingrese el nombre de la pizza que desee pedir, o ingrese \"salir\".\n");

        switch (pizza){
            case "pizzagrancangrejo":
                return new PizzaAdaptador(new PizzaGranCrangrejo());

            case "pizzajamonclasica":
                return new PizzaAdaptador(new PizzaJamonClasica());

            case "pizzameatlovers":
                return new PizzaAdaptador(new PizzaMeatLovers());

            case "pizzapollo":
                return new PizzaAdaptador(new PizzaPollo());

            case "pizzasalchedar":
                return new PizzaAdaptador(new PizzaSalchedar());
            case "salir":
                System.out.println("Gracias por preferir WaySub");
                System.exit(0);
            default:
                System.out.println("No se ha reconocido su elección, por favor revisela.");
                return pedirPizza();
        }
    }

    /**
     * Metodo privado encargado de imprimir todas las pizzas.
     */
    private void soutPizzas(){
        for (Pizza pizzaActual :pizzas) {
            PizzaAdaptador pizzaAdaptador = new PizzaAdaptador(pizzaActual);
            System.out.println(pizzaActual.getNombre()+"\n" +
                    pizzaAdaptador.getDescripcion()+".\n" +
                    "Por solo: "+ pizzaAdaptador.getCosto()+".\n");
        }
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
     * Metodo privado encargado de limpiar la cadena dada, le quita la acentuación, la puntuación y la convierte a minusculas.
     * @param string la cadena a limpiar.
     * @return String la cadena limpia.c vo
     */
    private String limpiaString(String string){
        return  Normalizer.normalize(string,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
    }

    /**
     * Metodo privado encargado de imprimir en consola el ticket de un objeto que implemente Producto.
     * @param producto Producto cuyo ticket imprimir.
     */
    private void imprimirTicket(Producto producto){
        if(producto == null){
            throw new IllegalArgumentException("No se como es que llegaste aqui.");
        }
        System.out.println("------------ Se imprime ticket por ------------\n"
                +producto.getDescripcion() + ".\n" +
                "Total :" + Math.ceil(producto.getCosto()) +".\n" +
                "------------------------------------------------");
    }

}
