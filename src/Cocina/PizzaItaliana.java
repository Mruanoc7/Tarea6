package Cocina;

public class PizzaItaliana extends Pizza {

    private String salsa;
    private int tiempoEnHorno;

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public int getTiempoEnHorno() {
        return tiempoEnHorno;
    }

    public void setTiempoEnHorno(int tiempoEnHorno) {
        this.tiempoEnHorno = tiempoEnHorno;
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando la salsa " + this.salsa + " a la pizza italiana.");
    }

    @Override
    public String toString() {
        return super.toString() + ", salsa: " + this.salsa + ", tiempo en horno: " + this.tiempoEnHorno + " minutos.";
    }
}
