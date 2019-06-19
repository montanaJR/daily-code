package org.montanajr.lab06.zad01;


public class Main {

    private static final ProductTypes[] products = {ProductTypes.BOOK, ProductTypes.CALENDAR, ProductTypes.MAP};
    private static final String[] names = {"Nazwa1","Nazwa2","Nazwa3","Nazwa4","Nazwa5","Nazwa6","Nazwa7","Nazwa8",};

    static ProductTypes getRandom()
    {
        return products[(int) (Math.random() * products.length)];
    }
    static String getRandomName(){
        return names[(int) (Math.random() * names.length)];
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            System.out.println("==========");
            System.out.println("==========");
            System.out.println("=" + i +"=");
            Product p = LibraryFactory.getProduct(getRandom());
            p.present(getRandomName());
            System.out.println("==========");
            System.out.println("==========");
        }

    }
}
