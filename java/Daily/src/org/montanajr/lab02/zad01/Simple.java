package org.montanajr.lab02.zad01;

public class Simple {


    public static void main(String[] args) {
        Recognizer oo = new Recognizer();
        Result r = new Result();

        r = oo.wybierz_dzialanie(1);
        System.out.println(r.getResult());
    }
}
