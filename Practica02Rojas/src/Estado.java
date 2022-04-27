/**
 * Interfaz encargada de implementar los metodos que todo estado debé tener.
 */
public interface Estado {
    /**
     * Metodo encargado de suspender al robot, no se puede suspender mientras cocina ni mientras atiende.
     * El robot se puede suspender para acabar de cocinar y mientras camina.
     */
    public void suspenderse();

    /**
     * Metodo encargado de hacer caminar al robot, se puede agregar un nombre de cliente, no puede caminar ni cuando
     * esta suspendido, ni cocinando, ni atendiendo. Solo puede caminar al estar suspendido y al seguir caminado.
     */
    public void caminarACliente(String nombreCliente);

    /**
     * Metodo encargadao de hacer cocinar al robot en base a la id. No puede cocinar hasta acabar el platillo actual
     * (manda llamar a atender para pedir otro platillo), ni cuando camina, ni cuando esta suspendido. El robot puede
     * cocinar solo al atender.
     * @param id int del platillo a cocinar.
     */
    public void cocinar(int id);

    /**
     * Metodo encargado de hacer atender al robot. No se puede hacer atender si ya atiende a alguien, ni al estar
     * suspendido, el robot deja de caminar al atender y se puede suspender.
     */
    public void atender();

}
