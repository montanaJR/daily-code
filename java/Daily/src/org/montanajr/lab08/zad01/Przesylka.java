package org.montanajr.lab08.zad01;


public class Przesylka extends Element{

    private String nazwa;
    private Double waga;
    private String strefa;

    public Double getOplata() {
        return oplata;
    }

    public String getStrefa(){
        return this.strefa;
    }

    public void setOplata(Double oplata) {
        this.oplata = oplata;
    }

    Double oplata;

    public Przesylka(String nazwa, Double waga, String strefa) {
        this.nazwa = nazwa;
        this.waga = waga;
        this.strefa = strefa;
    }

    @Override
    public void wizytuj(Odwiedzajacy visitor) {
        visitor.wizytuj(this);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Przesylka{");
        sb.append("nazwa='").append(nazwa).append('\'');
        sb.append(", waga=").append(waga);
        sb.append(", strefa='").append(strefa).append('\'');
        sb.append(", oplata=").append(oplata);
        sb.append('}');
        return sb.toString();
    }
}
