package Fabricas;
import Fabricas.Piezas.*;
import java.text.Normalizer;
import java.util.HashMap;

/**
 * Clase púbica abstracta encargada de representar la fabrica de cabinas, extiende de FabricaPiezas.
 */
public class FabricaCabinas extends FabricaPiezas {

    /**
     * Constructor público de FabricaCabinas. Inicializa el HashMap y agrega las cabinas.
     */
    public FabricaCabinas(){
        this.piezasDeLaFabrica = new HashMap<>();
        piezasDeLaFabrica.put("cabinaunpiloto",new CabinaUnPiloto());
        piezasDeLaFabrica.put("cabinatripulacionpequena",new CabinaTripulacion());
        piezasDeLaFabrica.put("cabinaejercito",new CabinaEjercito());
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
            Cabina cabinaACrear = (Cabina) piezasDeLaFabrica.get(pieza);
            cabinaACrear.montar();
            return cabinaACrear;
        }
        System.out.println("La fabrica encargada del las cabinas del imperio reportó un problema con su solicitud,\n" +
                "para no retrasar al imperio se usara laa cabina de minima normatividad.\n");
        return piezasDeLaFabrica.get("cabinaunpiloto");
    }

    /**
     * Método encargado de hacer una entrada legible de un String, limpia espacios en blanco, acentuación y puntuación.
     * @param entrada String a limpiar.
     * @return String la entrada limpia.
     */
    private String entredaLegible(String entrada){

        return Normalizer.normalize(entrada,Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase().replaceAll("\\s","").replaceAll("ñ","n");
    }
}
