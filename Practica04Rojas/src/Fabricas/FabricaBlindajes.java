package Fabricas;
import Fabricas.Piezas.*;
import java.text.Normalizer;
import java.util.HashMap;

/**
 * Clase púbica abstracta encargada de representar la fabrica de blindajes, extiende de FabricaPiezas.
 */
public class FabricaBlindajes extends FabricaPiezas {

    /**
     * Constructor público de FabricaBlindajes. Inicializa el HashMap y agrega los blindajes.
     */
    public FabricaBlindajes(){
        this.piezasDeLaFabrica = new HashMap<>();
        piezasDeLaFabrica.put("blindajesimple",new BlindajeSimple());
        piezasDeLaFabrica.put("blindajereforzado",new BlindajeReforzado());
        piezasDeLaFabrica.put("blindajefortaleza",new BlindajeFortaleza());
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
            Blindaje blindajeACrear = (Blindaje) piezasDeLaFabrica.get(pieza);
            blindajeACrear.montar();
            return blindajeACrear;
        }
        System.out.println("La fabrica encargada del blindaje galactico reportó un problema con su solicitud,\n" +
                "para no retrasar al imperio se usara el blindaje de minima normatividad.\n");
        return piezasDeLaFabrica.get("blindajesimple");
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
