package week4_assignment2;

import java.util.*;

public class ShoppingCart {
    private Map<String, Double> productPrices;  // Stores product prices (HashMap)
    private Map<String, Double> cartOrder;      // Maintains order of items added (LinkedHashMap)

    public ShoppingCart() {
        productPrices = new HashMap<>();
        cartOrder = new LinkedHashMap<>();
    }

    public void addProduct(String product, double price) {
        productPrices.put(product, price);
        cartOrder.put(product, price);
    }

    public void displayCartOrder() {
        System.out.println("\nProducts in the order they were added:");
        for (Map.Entry<String, Double> entry : cartOrder.entrySet()) {
            System.out.println(entry.getKey() + " -> $" + entry.getValue());
        }
    }

    public void displayProductsSortedByPrice() {
        TreeMap<Double, String> sortedByPrice = new TreeMap<>();
        for (Map.Entry<String, Double> entry : productPrices.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nProducts sorted by price:");
        for (Map.Entry<Double, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + " -> $" + entry.getKey());
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 1000.0);
        cart.addProduct("Phone", 700.0);
        cart.addProduct("Headphones", 150.0);
        cart.addProduct("Mouse", 50.0);

        cart.displayCartOrder();
        cart.displayProductsSortedByPrice();
    }
}

