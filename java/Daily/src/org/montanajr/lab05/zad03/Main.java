package org.montanajr.lab05.zad03;

public class Main {

    public static void main(String[] args) {
        DataAccessor dataAccessor = new DataObjectProxy("URL");

        dataAccessor.getFile();
        System.out.println("Now change endpoint...");
        dataAccessor.getFile();
    }
}
