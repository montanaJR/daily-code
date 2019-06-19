package org.montanajr.lab06.zad01;



import java.util.HashMap;

public class LibraryFactory {

    private static final HashMap<ProductTypes,Product> products = new HashMap<>();

    public static Product getProduct(ProductTypes productTypes) {

        Product p = products.get(productTypes);

        switch (productTypes){
            case MAP:
                p = new Map();
                break;
            case CALENDAR:
                p = new Calendar();
                break;
            case BOOK:
                p = new Book();
                break;
            default:
                break;
        }


        return p;
    }


}
