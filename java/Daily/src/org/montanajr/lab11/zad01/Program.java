package org.montanajr.lab11.zad01;

public class Program {

    public static void main(String[] args) {
        Integer [][] s1 = new Integer[3][2];
        Integer [] s2 = new Integer[3];
        s1[0][0] = 1;
        s1[0][1] = 3;
        s1[0][2] = 4;
        s1[1][0] = 5;
        s1[2][2] = 6;
        s1[1][1] = 11;

        s2[0] = 66;
        s2[1] = 77;



        Sorter tabSort = new SimplifiedArray();
        tabSort.sort(s1);
    }



}
