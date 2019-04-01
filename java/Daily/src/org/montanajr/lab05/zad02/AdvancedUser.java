package org.montanajr.lab05.zad02;

public class AdvancedUser implements User{

    protected Equipment equipment;
    String userName = "AdvancedUser";
    Boolean krs = true;

    public AdvancedUser(Equipment equipment) {
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
        System.out.println(String.format("Username: %s, krs: %s, eq name: %s, eq price: %s, eq offer: %s  ",userName,krs,equipment.getName(),equipment.getPrice(), getQuantityPerOffer()));

    }

    public Integer getQuantityPerOffer(){
       return equipment.offerQuantity();
    }




}
