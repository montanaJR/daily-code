package org.montanajr.lab08.zad01;


public class OdwiedzajacyDodatkowaOplata implements Odwiedzajacy {
    @Override
    public void wizytuj(Przesylka klient) {
        if(klient instanceof Paczka){
            klient.setOplata(30.0);
        } else if (klient instanceof List) {
            klient.setOplata(3.5);
        } else  {
            klient.setOplata(100.0);
            System.out.println("Rodzaj paczki nieoznakowany. ");
        }

        if(klient.getStrefa().equalsIgnoreCase("strefa01")){
            klient.setOplata(klient.getOplata() * 2.2);
        } else if(klient.getStrefa().equalsIgnoreCase("strefa02")){
            klient.setOplata(klient.getOplata() * 3.2);
        } else if(klient.getStrefa().equalsIgnoreCase("strefa03")){
            klient.setOplata(klient.getOplata() * 4.2);
        } else {
            klient.setOplata(klient.getOplata() * 10.2);
            System.out.println("Strefa niezdefiniowano. Ustalono niestandardowa cene");
        }

        System.out.println(klient.toString());
    }
}
