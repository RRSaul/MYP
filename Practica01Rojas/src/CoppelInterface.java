import java.util.LinkedList;

public class CoppelInterface implements BancosInterface  {

    LinkedList<Cliente> clientes;
    int bancaTotal;

    public CoppelInterface(){
        clientes =  new LinkedList<>();
        bancaTotal = 0;
    }
    @Override
    public void registrarCliente(Cliente cliente,Banco banco) {
        clientes.addLast(cliente);
        cliente.afiliarseABanco(banco);
        System.out.println(cliente + " Es ahora clienta/e de nuestro banco Coppel." );
    }

    @Override
    public void elminarCliente(Cliente cliente) {
    if(clientes.remove(cliente)){
        System.out.println("El cliente " + cliente + " ya no se encuentra afiliado a Coppel.");
        }
    }

    @Override
    public void cobrarClientes(String mes) {
        System.out.println("----------------Se harán los cobros correspondietes al mes de "+ mes + "-------------------");
        for (Cliente cliente :clientes) {
            bancaTotal += cliente.pagarServicios();
            System.out.println("\n");
        }
        System.out.println("\n");

    }

    @Override
    public void soutBancaTotal() {
        System.out.println("Tu banco Coppel tiene una banca total de " + bancaTotal);

    }
}
