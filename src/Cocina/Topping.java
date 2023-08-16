package Cocina;
import java.util.Random;

public class Topping {
    private String nombre;
    private static String[] ingredientesPosibles = {"champiñones", "piña", "jamon", "pollo"};

    public Topping(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static String obtenerIngredienteAzar() {
        Random random = new Random();
        int indiceAleatorio = random.nextInt(ingredientesPosibles.length);
        return ingredientesPosibles[indiceAleatorio];
    }

    public void agregar(Pizza pizza) {
        String ingredienteAleatorio = obtenerIngredienteAzar();
        System.out.println("Agregando " + ingredienteAleatorio + " a la pizza.");

        String[] ingredientesActuales = pizza.getIngredientes();
        String[] nuevosIngredientes = new String[ingredientesActuales.length + 1];

        for (int i = 0; i < ingredientesActuales.length; i++) {
            nuevosIngredientes[i] = ingredientesActuales[i];
        }

        nuevosIngredientes[nuevosIngredientes.length - 1] = ingredienteAleatorio;
        pizza.setIngredientes(nuevosIngredientes);
    }
}
