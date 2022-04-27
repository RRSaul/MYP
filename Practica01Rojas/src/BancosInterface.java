public interface BancosInterface {

    public void registrarCliente(Cliente cliente, Banco banco);

    public void elminarCliente(Cliente cliente);

    public void cobrarClientes(String mes);

    public void soutBancaTotal();


}
