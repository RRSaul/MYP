/**
 *  Estado cocinando del robot. No puede cocinar hasta acabar el platillo actual (manda llamar a atender
 *  para pedir otro platillo), ni cuando camina, ni cuando esta suspendido. El robot puede cocinar solo al atender.
 */
public class EstadoCocinando implements  Estado {

    RobotRestaurante robotRestaurante;

    public EstadoCocinando(RobotRestaurante robotRestaurante){
        this.robotRestaurante = robotRestaurante;
    }

    @Override
    public void suspenderse() {
        System.out.println("\"¡He terminado tu comida, humano!, ¡Me suspenderé, pero . . .!\n" +
                ",¡Volveré !\"\n" +
                "<<Suspención Robotica>>\n");

    }

    @Override
    public void caminarACliente(String nombreCliente) {
        System.out.println("\"¡Caminar ahora sería peligroso para ustedes!, ¡Formas de vida debiles!\"\n");

    }

    @Override
    public void cocinar(int id) {
        System.out.println("\"¡Hasta que o acabe su pedido no tomaŕe otro!, ¡Formas de vida debiles!\"\n");

    }

    @Override
    public void atender() {
        System.out.println("\"¡He terminado tu comida, humano!, ¡Vuelve a ordenar!\"\n");
        robotRestaurante.soutMenuCompleto();
        robotRestaurante.setEstado(robotRestaurante.estadoAtendiento);

    }
}
