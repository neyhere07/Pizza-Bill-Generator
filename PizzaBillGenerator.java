import java.util.ArrayList;

// Pizza class represents individual pizzas
class Pizza {
    private String name;
    private double price;

    // Constructor to initialize pizza name and price
    public Pizza(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter method for pizza price
    public double getPrice() {
        return price;
    }

    // Override toString method to provide a string representation of Pizza object
    @Override
    public String toString() {
        return name + " - $" + price;
    }
}

// PizzaOrder class represents a collection of pizzas in an order
class PizzaOrder {
    private ArrayList<Pizza> pizzas;

    // Constructor to initialize the list of pizzas in the order
    public PizzaOrder() {
        pizzas = new ArrayList<>();
    }

    // Method to add a pizza to the order
    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    // Method to calculate the total price of the order
    public double getTotalPrice() {
        double totalPrice = 0;
        for (Pizza pizza : pizzas) {
            totalPrice += pizza.getPrice();
        }
        return totalPrice;
    }

    // Method to generate a bill for the order
    public void generateBill() {
        System.out.println("---- Pizza Bill ----");
        for (Pizza pizza : pizzas) {
            System.out.println(pizza);
        }
        System.out.println("Total: $" + getTotalPrice());
    }
}

// Main class to demonstrate the usage of Pizza and PizzaOrder classes
public class PizzaBillGenerator {
    public static void main(String[] args) {
        // Create a new PizzaOrder object
        PizzaOrder order = new PizzaOrder();

        // Create some Pizza objects
        Pizza pizza1 = new Pizza("Margherita", 8.99);
        Pizza pizza2 = new Pizza("Pepperoni", 10.99);

        // Add pizzas to the order
        order.addPizza(pizza1);
        order.addPizza(pizza2);

        // Generate and print the bill for the order
        order.generateBill();
    }
}