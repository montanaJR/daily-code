package org.montanajr.lab03.zad01;


public class Singleton {

    private Singleton () {
        BankAccount account = BankAccount.getInstance();
        account.addDebit(1);
    }

    public static void main(String[] args) {
        new Singleton();
        new Singleton();
        new Singleton();

    }
}
