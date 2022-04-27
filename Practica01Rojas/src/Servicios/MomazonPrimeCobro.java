 package Servicios;
 /**
  * Clase encargada de implementar los modos de pago de la clase Momazon Prime.
  */

public class MomazonPrimeCobro implements ModoCobro {
    String conceptoCobroUnico;
    int cantidadPagoUnico;

    public MomazonPrimeCobro(){
        conceptoCobroUnico = "";
        cantidadPagoUnico = 0;
    }

    @Override
    public void agregarModoCobro(String concepto, int cantidad) {
        textSeintenta("agregar modo de cobro");
        if(conceptoCobroUnico.equals("")){
            conceptoCobroUnico = concepto;
            cantidadPagoUnico = cantidad;
            System.out.println("Se ha agregado la nueva tarifa unica de " + concepto + " de " + cantidad + " a Momazon Prime.\n");
        }else {
            System.out.println("Momazon Prime esta siempre a tu lado y puedes confiar en nuestra tarifa unica. No se puede agregar más.\n");
        }
    }

    @Override
    public void quitarModoDeCobro(String concepto) {
        textSeintenta("quitar un modo de cobro");
        if(conceptoCobroUnico.equals(concepto) ){
            conceptoCobroUnico = "";
            cantidadPagoUnico = -1;

            System.out.println("Se ha eliminado nuestra tarifa unica, por favor agregar una nueva.\n");
        }
        System.out.println("Nuestra tarifa uniica no se encuentra bajo el concepto "+ concepto + ", ó no hay alguna.'\n");
    }

    @Override
    public int consultaCobro(String concepto) {
        if(concepto.equals(conceptoCobroUnico)){
            return cantidadPagoUnico;
        }
        return -1;
    }

    @Override
    public void muestraTodosLosCobros() {
        System.out.println("Momazon Prime te ofrece grandes beneficios, todos icluidos en tu plan.\n" +
                "Envios gratis en Momazon Compras.\n" +
                "Momazon Music ilimitado, guarda tus podcast y musica para llevar donde quiereas.\n" +
                "Momazon Video, disfruta de tus series y peliculas favorias de manera ilimitada.\n" +
                "Y una subscrinción gratuita a el canal de tu preferencia en Memtch.\n" +
                "Todo por nuestra tarifa unica de "+ conceptoCobroUnico + ", por solo " + cantidadPagoUnico + ".\n");
    }

    private void textSeintenta(String queSeIntenta){
        System.out.println("Se intenta " + queSeIntenta + " a Momazon Prime.\n");
    }
}
