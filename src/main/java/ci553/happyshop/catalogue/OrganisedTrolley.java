package ci553.happyshop.catalogue;

import java.util.ArrayList;
import java.util.Collections;
// new subclass that overwrites the normal trolley class without
//directly interfering it
public class OrganisedTrolley extends Trolley {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        Product existingProduct = null;
        // checks through the array if the product is already in the cart
        // using an enchanced for loop
        for (Product p : products) {
            if (p.getProductId().equals(product.getProductId())) {
                existingProduct = p;
                break;
            }
        }
        // if the product is in the cart already, just add to the order quantity
        // otherwise add it as a new instance of the cart
        if (existingProduct != null) {
            existingProduct.addOrderedQuantity(1); // checkout counter is counted up by 1
            System.out.println("Existing product in trolley, add to quantity"); // testing
        }
        else {
            products.add(product); // product is appended to the end of the trolley
            product.addOrderedQuantity(1); // checkout counter is counted up by 1
            System.out.println("New product, add to array"); // testing
        }
        Collections.sort(products); // collections sorts the ArrayList product IDs
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void clear() {
        products.clear();
    }
}
