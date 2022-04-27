package Servicios;
import java.util.HashMap;


/**
 * Clase publica abstracta para implemenar servicos, usa el patrón Strategy con las interfaces.
 */

public abstract class Servicio {

    ModoCobro modoCobro;

    public Servicio(){}

    public void setModoCobro(ModoCobro mC){
        modoCobro = mC;
    }

    public void agregarModoCobro(String concepto, int cantidad ){
        modoCobro.agregarModoCobro(concepto,cantidad);

    }
    public String nombreServicio(){
        int largo = this.getClass().toString().split("\\.").length;

        return this.getClass().toString().split("\\.")[largo-1];

    }

    public void quitarModoDeCobro(String consepto){
        modoCobro.quitarModoDeCobro(consepto);
    }

    public int consultarCobro(String consepto){
        return modoCobro.consultaCobro(consepto);
    }

    public void muestraTodosLosCobros(){
        modoCobro.muestraTodosLosCobros();
    }


}
