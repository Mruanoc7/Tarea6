package Cocina;

public class Pizza {

    private String nombre;
    private double precio;

    private String[] ingredientes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }


    public void preparar() {
        System.out.println("Preparando pizza " + this.nombre);
        System.out.println("Pizza lista para ser servida.");
    }

    @Override
    public String toString() {
        return "nombre de la pizza: " + this.nombre + ", y su precio es: " + this.precio;
    }
}
