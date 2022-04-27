/**
 * Estado caminando del robot. So puede caminar ni cuando esta suspendido, ni cocinando,
 * ni atendiendo. Solo puede caminar al estar suspendido y al seguir caminado.
 */
public class EstadoCaminando implements  Estado {

    RobotRestaurante robotRestaurante;

    public EstadoCaminando(RobotRestaurante robotRestaurante){
        this.robotRestaurante = robotRestaurante;
    }


    @Override
    public void suspenderse() {

        System.out.println("\"Volveré, Humanos!, ¡Volveré!\"\n" +
                "<<Suspención Robotica>>");
        robotRestaurante.setEstado(robotRestaurante.estadoSuspendido);

    }

    @Override
    public void caminarACliente(String nombreCliente) {
        System.out.println("\"¡Cambiando objetivo a "+ nombreCliente+"!\"\n");
    }

    @Override
    public void cocinar(int id) {
        System.out.println("\"¡Cocinar ahora sería peligroso para ustedes!, ¡Formas de vida debiles!\"\n");
    }

    @Override
    public void atender() {
        System.out.println("\"¡He llegado y te atenderé!, ¡Humano!\"\n");
        robotRestaurante.soutMenuCompleto();
        robotRestaurante.setEstado(robotRestaurante.estadoAtendiento);

    }
}
