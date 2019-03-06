package org.montanajr.lab03.singleton;

public class Drukarka {
	
    private Drukarka()
    {
        BuforWydruku spl = BuforWydruku.getSpooler();
        spl.print("Drukowanie danych");
    }
    static public void main(String ...args) {
        new Drukarka();
        new Drukarka();
        new Drukarka();
        new Drukarka();
        new Drukarka();
    }
}
