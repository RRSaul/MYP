/**
 * Clase pública abstracta encargada de representar a una pizza, no puede existir una pizza sin ingredientes,
 * por eso es abstracta, nótese la gran diferencia de planteación de esta clase con la de Baguette, asi se demuestra
 * el uso del patrón Adabter
 */
public abstract class Pizza {

    //Aquí hacemos los atributos privados.
    private String nombre;
    private String queso;
    private String carne;
    private String masa;
    private double precio;

    /**
     * Metodo encargado de establecer el nombre de la pizza.
     * @param nombre String nombre de la pizza.
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Metodo encargado de establecer el ingrediente queso.
     * @param queso String el queso en la pizza.
     */
    public void setQueso(String queso){
        this.queso = "queso " +queso;
    }

    /**
     * Metodo encargado de establecer el ingrediente carne.
     * @param carne String el queso en la pizza.
     */
    public void setCarne(String carne){
        this.carne = carne;
    }

    /**
     * Metodo encargado de establecer el tipo de masa.
     * @param masa String la masa de pizza.
     */
    public void setMasa(String masa){
        this.masa = "masa " +masa;
    }

    /**
     * Metodo encargado de establecer el precio de la pizza. (Nótese que aquí se usa precio)
     * @param precio double el precio de la pizza.
     */
    public void setPrecio(double precio){
        this.precio = precio;
    }

    /**
     * Metodo encargado de regresar el nombre de la pizza.
     * @return String nombre de la pizza.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Metodo encargado de regresar el queso en la pizza.
     * @return String queso en la pizza.
     */
    public String getQueso(){
        return queso;
    }

    /**
     * Metodo encargado de regresar la carne en la pizza.
     * @return String la carne en la pizza.
     */
    public String getCarne(){
        return carne;
    }

    /**
     * Metodo encargado de regresar la masa de la pizza.
     * @return String la masa de la pizza.
     */
    public String getMasa(){
        return masa;
    }

    /**
     * Metodo encargado de regresar el precio de la pizza.
     * @return double precio de la pizza.
     */
    public double getPrecio(){
        return precio;
    }




}
