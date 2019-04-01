package org.montanajr.lab05.zad01;

public class Program {

    public static void main(String[] args) {
        Flower irys = new IrisFlower(new Green(5d));
        Flower tulip = new TulipFlower(new Red(10d));

        tulip.getInfo();
        irys.getInfo();





    }
}
