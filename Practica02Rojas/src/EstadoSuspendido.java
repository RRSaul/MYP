/**
 * Estado suspendido del robot. No se puede suspender mientras cocina ni mientras atiende.
 * El robot se puede suspender para acabar de cocinar y mientras camina.
 */
public class EstadoSuspendido implements Estado {

    RobotRestaurante robotRestaurante;

    public EstadoSuspendido(RobotRestaurante robotRestaurante){
        this.robotRestaurante = robotRestaurante;
    }


    @Override
    public void suspenderse() {
        System.out.println("<<Silencio Robotico>>\n");

    }

    @Override
    public void caminarACliente(String nombreCliente) {

        System.out.println("\"¡He despertado, Humano!\"\n");
        robotRestaurante.setEstado(robotRestaurante.estadoCaminando);

    }

    @Override
    public void cocinar(int id) {
        System.out.println("<<Silencio Robotico>>\n");

    }

    @Override
    public void atender() {
        System.out.println("<<Silencio Robotico>>\n");
    }
}
