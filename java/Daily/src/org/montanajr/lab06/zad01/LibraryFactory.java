package org.montanajr.lab06.zad01;


import java.util.HashMap;

public class LibraryFactory {

    private static final HashMap<ProductTypes,Product> products = new HashMap<>();

    public static Product getProduct(ProductTypes productTypes) {
        Product product = products.get(productTypes);
        return product;
    }

}
