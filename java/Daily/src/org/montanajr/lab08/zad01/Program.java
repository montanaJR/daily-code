package org.montanajr.lab08.zad01;


public class Program {


    public static void main(String[] args) {
        Przesylki przesylka = new Przesylki();


        przesylka.dodaj(new List("szybka", 0.5,"strefa01"));
        przesylka.dodaj(new Paczka("polecona", 5.5,"strefa03"));
        przesylka.dodaj(new Paczka("zwykla", 2.5,"STREFA02"));

        przesylka.wizytuj(new OdwiedzajacyDodatkowaOplata());
    }

}


