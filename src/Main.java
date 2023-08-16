import Cocina.Pizza;
import Cocina.PizzaItaliana;
import Cocina.Topping;

public class Main {
    public static void main(String[] args) {
        PizzaItaliana pizzaItaliana = new PizzaItaliana();
        pizzaItaliana.setNombre("Margarita");
        pizzaItaliana.setPrecio(10.99);
        pizzaItaliana.setIngredientes(new String[]{"Queso", "Tomate", "Albahaca"});
        pizzaItaliana.setSalsa("Tomate");
        pizzaItaliana.setTiempoEnHorno(15);

        System.out.println(pizzaItaliana.toString());
        pizzaItaliana.preparar();

        Pizza miPizza = new Pizza();
        miPizza.setNombre("Hawaiana");
        miPizza.setPrecio(11.99);
        miPizza.setIngredientes(new String[]{"Jamón", "Piña"});

        Topping quesoExtra = new Topping("Queso Extra");
        quesoExtra.agregar(miPizza);

        System.out.println("Ingredientes de la pizza: " + String.join(", ", miPizza.getIngredientes()));
    }
}
