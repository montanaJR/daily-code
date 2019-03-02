package org.montanajr.lab02.zad01;

public class Simple {


    public static void main(String[] args) {
        Recognizer oo = new Recognizer();
        Result r;

        r = oo.wybierz_dzialanie(1.22);
        System.out.println(r.getResult());
    }
}
