import java.util.LinkedList;

public abstract class Banco {

    BancosInterface bancosInterface;

    public void setBancosInterface(BancosInterface bancosInterface){
        this.bancosInterface = bancosInterface;
    }

    public void registrarCliente(Cliente cliente){
        bancosInterface.registrarCliente(cliente,this);
    }

    public void eliminarCliente(Cliente cliente){
        bancosInterface.elminarCliente(cliente);
    }

    public void cobrarClientes(String mes){
        bancosInterface.cobrarClientes(mes);
    }

    public void soutBancaTotal(){
        bancosInterface.soutBancaTotal();
    }






}
