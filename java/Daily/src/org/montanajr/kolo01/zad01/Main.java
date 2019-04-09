package org.montanajr.kolo01.zad01;

public class Main {

    public static void main(String[] args) {
        Student s1 = new StudentI();
        System.out.println(s1.getInfo());
        s1 = new PraktykiIStopnia(s1);
        s1 = new PraktykiZawodowe(s1);
        s1 = new ProjektPrzedmiotowy(s1);

        System.out.println(s1.getInfo());

        Student s2 = new StudentII();
        System.out.println(s2.getInfo());
        s2 = new PraktykiIIStopnia(s2);
        s2 = new PraktykiZawodowe(s2);
        s2 = new ProjektPracy(s2);




    }


}
