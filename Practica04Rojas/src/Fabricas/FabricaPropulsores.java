package Fabricas;
import Fabricas.Piezas.*;
import java.text.Normalizer;
import java.util.HashMap;

/**
 * Clase púbica abstracta encargada de representar la fabrica de propulsores, extiende de FabricaPiezas.
 */
public class FabricaPropulsores extends FabricaPiezas {

    /**
     * Constructor público de FabricaPropulsores. Inicializa el HashMap y agrega las propulsores.
     */
    public FabricaPropulsores(){
        this.piezasDeLaFabrica = new HashMap<>();
        piezasDeLaFabrica.put("propulsorviajeintercontinental",new PropulsorIntercontinental());
        piezasDeLaFabrica.put("propulsorviajeinterplanetario", new PropulsorInterplanetario());
        piezasDeLaFabrica.put("propulsorviajeintergalactico", new PropulsorIntergalactico() );
    }

    /**
     * @Override del método crearPieza de FabricaPiezas.
     * @param pieza String el nombre la pieza que quiera ser construida.
     * @return Pieza creada por la fabrica.
     */
    @Override
    public Pieza crearPieza(String pieza) {
        pieza = entredaLegible(pieza);
        if (piezasDeLaFabrica.containsKey(pieza)){
            Propulsor propulsorACrear = (Propulsor) piezasDeLaFabrica.get(pieza);
            propulsorACrear.montar();
            return propulsorACrear;
        }
        System.out.println("La fabrica encargada de los propulsores del imperio reportó un problema con su solicitud,\n" +
                "para no retrasar al imperio se usara el sistema de propulsión de minima normatividad.\n");
        return piezasDeLaFabrica.get("propulsorviajeintercontinental");
    }

    /**
     * Método encargado de hacer una entrada legible de un String, limpia espacios en blanco, acentuación y puntuación.
     * @param entrada String a limpiar.
     * @return String la entrada limpia.
     */
    private String entredaLegible(String entrada){

        return Normalizer.normalize(entrada,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase().replaceAll("\\s","");
    }
}
