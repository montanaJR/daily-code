package org.montanajr.lab02.zad01;

public class Recognizer extends AbstractObject {
    @Override
    public Result wybierz_dzialanie(Object liczba) {
        if(liczba instanceof Double){
            return new IfDouble(liczba);
        } else if(liczba instanceof Integer){
            return new IfInteger(liczba);
        }else {
            throw new IllegalArgumentException("Brak odpowiedniego ");
        }
    }
}
