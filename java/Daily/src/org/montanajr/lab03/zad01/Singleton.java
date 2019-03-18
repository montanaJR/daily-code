package org.montanajr.lab03.zad01;


public class Singleton {


    public static void main(String[] args) {
        BankAccount bankAccount1 = BankAccount.getInstance();

        bankAccount1.addDebit(5);
        bankAccount1.addDebit(500);
        bankAccount1.reduceDebit(155);

    }
}
