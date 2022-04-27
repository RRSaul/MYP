package Fabricas.Piezas;

/**
 * Clase pública abstracta encargada de ser la base para todas las piezas creadas.
 */
public abstract class Pieza {
    //Todas las piezas tienen datos y modificadores a la nave donde son montadas.
    protected String nombre;
    protected String descripcion;
    protected int precio;
    protected int modAtaque;
    protected int modDefensa;
    protected int modVelocidad;
    protected int modPeso;

    /**
     * Método público abstracto encargado de montar la pieza, las clases que extienden de Pieza deben implementarlo.
     */
    public abstract void montar();

    /**
     * Método público encargado de regresar el nombre de la pieza.
     * @return String nombre de la pieza.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método público encargado de regresar la descripción de la pieza.
     * @return String la descripción de la pieza.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Método público encargado de regresar el precio de la pieza.
     * @return String el precio de la pieza.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Método público encargado de regresar el modificador de ataque de la pieza.
     * @return String el modificador de ataque de la pieza.
     */
    public int getModAtaque() {
        return modAtaque;
    }

    /**
     * Método público encargado de regresar el modificador de defensa de la pieza.
     * @return String el modificador de defensa de la pieza.
     */
    public int getModDefensa() {
        return modDefensa;
    }

    /**
     * Método público encargado de regresar el modificador de velocidad de la pieza.
     * @return String el modificador de velocidad de la pieza.
     */
    public int getModVelocidad() {
        return modVelocidad;
    }

    /**
     * Método público encargado de regresar el modificador de peso de la pieza.
     * @return String el modificador de peso de la pieza.
     */
    public int getModPeso() {
        return modPeso;
    }
}
