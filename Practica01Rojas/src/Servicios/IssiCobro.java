package Servicios;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase encargada de implementar los modos de pago de la clase Issi.
 */

public class IssiCobro implements ModoCobro {

    HashMap<String,Integer> cobros;

    public IssiCobro(){
        cobros = new HashMap<>();
    }
    @Override
    public void agregarModoCobro(String concepto, int cantidad) {
        textSeintenta("agregar modo de cobro");
        if(!cobros.containsKey(concepto)){
            cobros.put(concepto,cantidad);
            System.out.println("Se ha agregado el cobro por " + concepto + " de " + cantidad + " a Issi.\n");
        }else {
            cobros.remove(concepto);
            cobros.put(concepto,cantidad);
            System.out.println("Se ha agregado el cobro por " + concepto + " de " + cantidad + " a Issi.\n");
        }

    }

    @Override
    public void quitarModoDeCobro(String concepto) {
        textSeintenta("quitar modo de cobro");
        if(!cobros.isEmpty() && cobros.containsKey(concepto) ){
            cobros.remove(concepto);

            System.out.println("Se ha eliminado el plan de " + concepto + " de Issi.\n");
        }
        System.out.println("Issi no cuenta con un plan de " + concepto + " ó no hay ningun tipo de cobro.\n");

    }

    @Override
    public int consultaCobro(String concepto) {
        if(cobros.containsKey(concepto)){
            return cobros.get(concepto);
        }
        return -1;
    }

    @Override
    public void muestraTodosLosCobros() {
        System.out.println("Issi te da servicio de teléfono, televisión por cable e internet con sus " + cobros.size() + " planes.\n");
        for (Map.Entry<String,Integer> entrada: cobros.entrySet()) {
            System.out.println("El plan de "+ entrada.getKey() + " por " + entrada.getValue() + " pesos.\n");
        }
        System.out.println("No te quedes sin estos beneficios, contrata ahora.\n");

    }
    private void textSeintenta(String queSeIntenta){
        System.out.println("Se intenta " + queSeIntenta + " a Issi.\n");
    }
}
