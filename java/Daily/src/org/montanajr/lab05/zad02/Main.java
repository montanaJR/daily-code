package org.montanajr.lab05.zad02;

public class Main {

    public static void main(String[] args) {
        BasicUser basicUser = new BasicUser(new Ball());
        basicUser.pringInfo();

        AdvancedUser advancedUser = new AdvancedUser(new Bicycle());
        advancedUser.pringInfo();

    }


}
