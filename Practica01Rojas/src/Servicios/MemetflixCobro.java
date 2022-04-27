package Servicios;
import java.util.HashMap;
import java.util.Map;
/**
 * Clase encargada de implementar los modos de pago de la clase Memetflix.
 */

public class MemetflixCobro implements ModoCobro {

    HashMap<String,Integer> cobros;

    public MemetflixCobro(){
        cobros = new HashMap<>();
    }

    @Override
    public void agregarModoCobro(String concepto,int cantidad) {
        textSeintenta("agregar modo de cobro");
        if(!cobros.containsKey(concepto)){
            cobros.put(concepto,cantidad);
            System.out.println("Se ha agregado el cobro por " + concepto + " de " + cantidad + " a Memetflix.\n");
        }else {
            cobros.remove(concepto);
            cobros.put(concepto,cantidad);
            System.out.println("Se ha agregado el cobro por " + concepto + " de " + cantidad + " a Memetflix.\n");
        }
    }

    @Override
    public void quitarModoDeCobro(String concepto) {
        textSeintenta("quitar modo de cobro");
        if(!cobros.isEmpty() && cobros.containsKey(concepto) ){
           cobros.remove(concepto);

            System.out.println("Se ha eliminado el cobro de " + concepto + " de Memetflix.\n");
        }
        System.out.println("Memetflix no cuenta con un cobro para " + concepto + " ó no hay ningun tipo de cobro.\n");
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

        System.out.println("Memetflix cuenta con " + cobros.size() + " modos de cobro para tu comodidad.\n");
        for (Map.Entry<String,Integer> entrada: cobros.entrySet()) {
            System.out.println("El plan de "+ entrada.getKey() + "por " + entrada.getValue() + " pesos.\n");
        }
        System.out.println("Contrata el que mas te convenga.\n");
    }
    private void textSeintenta(String queSeIntenta){
        System.out.println("Se intenta " + queSeIntenta + " a Memetflix.\n");
    }
}
