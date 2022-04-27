import Servicios.Issi;
import Servicios.Memetflix;
import Servicios.Mextel;
import Servicios.MomazonPrime;
import java.math.BigInteger;

/**
 * Clase encargada de hacer la simulacion de los meses transcurridos, es su metodo main el que se ejecuta.
 */

public class Practica1 {

    public static void main(String[] args) {

        Coppel coppel = new Coppel();

        Memetflix memetflix = new Memetflix();
        MomazonPrime momazonPrime = new MomazonPrime();
        Mextel mextel = new Mextel();
        Issi issi = new Issi();


        memetflix.agregarModoCobro("1 dispositivo",100);
        memetflix.agregarModoCobro("2 dispositivos",200);
        memetflix.agregarModoCobro("4 dispositivos",300);

        momazonPrime.agregarModoCobro("1 mes",100);

        mextel.agregarModoCobro("20Mbps",349);
        mextel.agregarModoCobro("30Mbps",399);
        mextel.agregarModoCobro("150Mbps",549);

        issi.agregarModoCobro("30Mbps",390);
        issi.agregarModoCobro("50Mbps",590);
        issi.agregarModoCobro("100Mbps",780);


        Cliente alice = new Cliente("Alice Bounder Vard","ALBV485729MDFLBV87",
                new BigInteger("5566778456"),"Avenida Rio Moreno, #49, Al.Nose, DF");
        Cliente bob = new Cliente("Bob Juancho Liga","BOJL486629HDFBJL27",
                new BigInteger("5565468456"),"Calle Lourdes, #309, Al.Nose Dos, DF");
        Cliente charlie = new Cliente("Charlie Yuca Cuaqk","CHYC433709HDFCYC93",
                new BigInteger("5576547899"),"Avenida California, #93, Al.Nose Tres, DF");
        Cliente diego = new Cliente("Diego Peralta Lio","DIPL678703HDFDPL63",
                new BigInteger("5576556674"),"Avenida Roma, #72, Al.Nose, DF");
        Cliente emma = new Cliente("Emma Whatson Alilo","EMWA236389MDFHGC53",
                new BigInteger("5556776632"),"Avenida Rumil, #32, Al.Nose, DF");
        System.out.println("\n");

        alice.agregarSaldo(20000);
        bob.agregarSaldo(2000);
        charlie.agregarSaldo(7000);
        diego.agregarSaldo(6000);
        emma.agregarSaldo(9000);
        System.out.println("\n");

        coppel.registrarCliente(alice);
        coppel.registrarCliente(bob);
        coppel.registrarCliente(charlie);
        coppel.registrarCliente(diego);
        coppel.registrarCliente(emma);
        System.out.println("\n");

        alice.contratarServicio(memetflix,"4 dispositivos");
        alice.contratarServicio(momazonPrime,"1 mes");
        alice.contratarServicio(issi,"100Mbps");
        System.out.println("\n");

        bob.contratarServicio(memetflix,"4 dispositivos");
        bob.contratarServicio(momazonPrime,"1 mes");
        bob.contratarServicio(mextel,"150Mbps");
        System.out.println("\n");

        charlie.contratarServicio(issi,"30Mbps");
        System.out.println("\n");

        diego.contratarServicio(memetflix,"4 dispositivos");
        diego.contratarServicio(issi,"50Mbps");
        System.out.println("\n");

        emma.contratarServicio(memetflix,"4 dispositivos");
        emma.contratarServicio(momazonPrime,"1 mes");
        emma.contratarServicio(issi,"100Mbps");
        System.out.println("\n");

        memetflix.muestraTodosLosCobros();
        momazonPrime.muestraTodosLosCobros();
        mextel.muestraTodosLosCobros();
        issi.muestraTodosLosCobros();
        System.out.println("\n");

        //Inicia la simulación, mes de Enero.

        coppel.cobrarClientes("Enero");


        //Mes de Febrero.

        coppel.cobrarClientes("Febrero");

        //Mes de Marzo.

        coppel.cobrarClientes("Marzo");

        //Mes de Abril.

        emma.cancerlarServicio(memetflix);
        emma.cancerlarServicio(momazonPrime);
        emma.cancerlarServicio(issi);
        emma.contratarServicio(mextel,"30Mbps");
        System.out.println("\n");

        coppel.cobrarClientes("Abril");

        //Mes de Junio.

        coppel.cobrarClientes("Junio");

        //Mes de Julio.

        charlie.cancerlarServicio(issi);
        charlie.contratarServicio(mextel,"20Mbps");
        charlie.contratarServicio(momazonPrime,"1 mes");
        System.out.println("\n");

        coppel.cobrarClientes("Julio");

        //Mes de Agosto.

        emma.contratarServicio(momazonPrime,"1 mes");
        System.out.println("\n");

        coppel.cobrarClientes("Agosto");

        //Mes de Septiembre.

        coppel.cobrarClientes("Septiembre");

        //Mes de Octubre.

        diego.cancerlarServicio(memetflix);
        diego.cancerlarServicio(issi);

        System.out.println("\n");
        coppel.cobrarClientes("Octubre");

        //Mes de Noviembre.

        diego.agregarSaldo(6000);
        diego.contratarServicio(issi,"30Mbps");
        System.out.println("\n");
        coppel.cobrarClientes("Noviembre");

        //Mes de Diciembre.

        coppel.cobrarClientes("Diciembre");

        coppel.soutBancaTotal();

    }



}
