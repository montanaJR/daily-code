package org.montanajr.lab02.zad02.global;



public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("file")) {
            return new ExportFileFactory();
        } else if (choice.equalsIgnoreCase("profile")) {
            return new ProfileFactory();
        } else if (choice.equalsIgnoreCase("student")) {
            return new StudentFactory();
        } else {
            throw new IllegalArgumentException("Nie obslugiwana funkcjonalnosc");
        }

    }
}

