package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String statu) {
        // logging

        // Authentication & Authorization

        // Sanitize the Data

        System.out.println("Checkout Method from ShoppingCart Called");
    }

    public int quantity() {
        return 2;
    }
}
