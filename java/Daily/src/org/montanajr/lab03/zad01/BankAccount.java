package org.montanajr.lab03.zad01;

public class BankAccount {

    private static BankAccount account;
    private static int status = 500;

    private BankAccount() {

    }


    public static synchronized BankAccount getInstance() {
        if (account == null)
            account =  new BankAccount();
        return account;
    }

    private void print(){
        System.out.println("Account status " + status + " zl");
    }

    public synchronized void addDebit(Integer i){
        status += i;
        print();
    }

    public synchronized void reduceDebit(Integer i) {
        status -= i;
        print();

    }



}
