package Fabricas;
import Fabricas.Piezas.*;
import java.util.HashMap;
import java.text.Normalizer;

/**
 * Clase púbica abstracta encargada de representar la fabrica de armas, extiende de FabricaPiezas.
 */
public class FabricaArmas extends FabricaPiezas {

    /**
     * Constructor público de FabricaArmas. Inicializa el HashMap y agrega las armas.
     */
    public FabricaArmas(){
        this.piezasDeLaFabrica = new HashMap<>();
        piezasDeLaFabrica.put("lasersimple",new ArmaLaserSimple());
        piezasDeLaFabrica.put("misilesdeplasma",new ArmaMisilesPlasma());
        piezasDeLaFabrica.put("laserdestructordeplanetas",new ArmaLaserPlaneta());

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
            Arma armaACrear = (Arma) piezasDeLaFabrica.get(pieza);
            armaACrear.montar();
            return armaACrear;
        }
        System.out.println("La fabrica encargada del armamento galactico reportó un problema con su solicitud,\n" +
                "para no retrasar al imperio se usara el lasér de minima normatividad.\n");
        return piezasDeLaFabrica.get("lasersimple");
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
