/**
 * Estado atendiendo del robot. No se puede hacer atender si ya atiende a alguien, ni al estar
 * suspendido, el robot deja de caminar al atender y se puede suspender.
 */
public class EstadoAtendiendo implements  Estado {

    RobotRestaurante robotRestaurante;

    public EstadoAtendiendo(RobotRestaurante robotRestaurante){
        this.robotRestaurante = robotRestaurante;
    }


    @Override
    public void suspenderse() {
        System.out.println("\"¡Ordena, Humano!, ¡Suspenderse no es una opción!\"\n");

    }

    @Override
    public void caminarACliente(String nombreCliente) {
        System.out.println("\"¡No cambiaré de cliente hasta cumplir mi cometido!, ¡"+ nombreCliente+", espera tu turno!\"\n");

        }

    @Override
    public void cocinar(int idHamburguesa) {

        if(robotRestaurante.menuContieneHamburguesa(idHamburguesa)) {
            System.out.println("\"¡Preparate para disfrutar de la gloriosa evolución a la cocina robotica!\"\n");
            robotRestaurante.setEstado(robotRestaurante.estadoCocinando);
            robotRestaurante.cocinarHamburguesa(idHamburguesa);
        }else{
            System.out.println("\"¡La gloriosa McBurguesas no prepara esa hamburguesa!, ¡Corrige tu orden, humano!\"\n");
        }

    }

    @Override
    public void atender() {
        System.out.println("\"¡Ya te estoy atendiendo, humano!\"\n" +
                "<<Mirada amanezante robotica>>\n");
    }
}
