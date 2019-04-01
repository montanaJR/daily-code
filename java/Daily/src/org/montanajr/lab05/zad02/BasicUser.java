package org.montanajr.lab05.zad02;

public class BasicUser implements User{
    protected Equipment equipment;
    String userName = "BasicUser";
    Boolean krs = false;


    public BasicUser() {
    }

    public BasicUser(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public Boolean getUserStatus() {
        return krs;
    }

    @Override
    public void pringInfo() {
        System.out.println(String.format("Username: %s, krs: %s, eq name: %s, eq price: %s,",userName,krs,equipment.getName(),equipment.getPrice()));

    }
}
