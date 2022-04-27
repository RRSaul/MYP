import Servicios.Cobro;
import Servicios.Servicio;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase encargada de representar a los clientes, estos se pueden subscribir a servicios y los pagan al banco.
 */

public class Cliente {

    Banco bancoAfiliado;
    String nombre;
    String rfc;
    BigInteger numeroTelefonico;
    String direccion;
    int saldo;
    HashMap<Servicio, Cobro> serviciosContratados;

    public Cliente(String nombre,String rfc, BigInteger numeroTelefonico, String direccion){
        this.nombre = nombre;
        this.rfc = rfc;
        this.numeroTelefonico = numeroTelefonico;
        this.direccion = direccion;
        saldo = 0;
        serviciosContratados = new HashMap<>();
        System.out.println(this.toString() + " ha sido registrada/o como un nuevo cliente.");
    }
    public void afiliarseABanco(Banco banco){
        bancoAfiliado = banco;
    }

    public void desafiliarseDeBanco(){
        bancoAfiliado = null;
    }

    public Banco getBancoAfiliado(){
        return bancoAfiliado;
    }

    public void contratarServicio(Servicio servicio, String concepto){
        int cantidadServicio = servicio.consultarCobro(concepto);
        if(cantidadServicio>0){
            Cobro cobroServicio = new Cobro(concepto,cantidadServicio);

            serviciosContratados.put(servicio,cobroServicio);
            System.out.println(nombre + " ha contratado " + servicio.nombreServicio()+ " con "+ cobroServicio);
        }else {
            System.out.println("El servicio "+ servicio.nombreServicio()+ " no tiene un cobro bajo ese consepto," +
                    " no se ha contratado.");
        }
    }

    public void cambiarCobroServicio(Servicio servicio, String concepto){
        int cantidadNuevo = servicio.consultarCobro(concepto);
        if (0>cantidadNuevo){
            System.out.println("El servicio " + servicio.nombreServicio()+ " no tiene un cobro bajo el concepto " + concepto);
            return;
        }
        if(serviciosContratados.containsKey(servicio)){
            Cobro cobroNuevo = new Cobro(concepto,cantidadNuevo);
            serviciosContratados.remove(servicio);
            serviciosContratados.put(servicio,cobroNuevo);
            System.out.println("Se ha actualizado a un " + cobroNuevo + "del servicio" + servicio.nombreServicio());
            return;

        }
        System.out.println("El cliente " + this + " no tiene un contrato con " + servicio.nombreServicio());
    }

    public void cancerlarServicio(Servicio servicio){
        if(serviciosContratados.containsKey(servicio)){
            serviciosContratados.remove(servicio);
            System.out.println("El cliente " + this + " ha cancelado su suscripción con " + servicio.nombreServicio());
            return;
        }
        System.out.println("El cliente " + this + " no tiene un contrato con " + servicio.nombreServicio());

    }

    public int pagarServicios(){
        int pagoTotal = 0;
        for (Map.Entry<Servicio,Cobro> entrada : serviciosContratados.entrySet()) {
            Cobro cobroServicio = entrada.getValue();
            Servicio servicio = entrada.getKey();
            if(0<=(saldo - cobroServicio.getCantidad())){
                pagoTotal += cobroServicio.getCantidad();
                saldo -= cobroServicio.getCantidad();
                System.out.println("Se ha hecho un " + cobroServicio + " del servicio " + servicio.nombreServicio()+ " a "+ nombre +", el nuevo saldo es de " + saldo);
            }else{
                System.out.println("Ha sido imposible hacer el "+ cobroServicio+ " de "+servicio.nombreServicio() + " a "+ nombre +" por falta de fondos."  );
            }
        }
        return pagoTotal;
    }

    public void agregarSaldo(int cantidadAD){
        saldo+= cantidadAD;
        System.out.println("Se ha agregado "+cantidadAD +" al saldo de " + this );
    }

    @Override
    public String toString() {
        return nombre+ " de rfc " + rfc + ". tel " + numeroTelefonico + ". dirección." + direccion;
    }
}
