package org.montanajr;

public interface Game {
    int getNumber();
    int getGuess();
    void setGuess(int number);
    int getSmallest();
    int getBiggest();
    int getRemainingGuesses();
    void reset();
    void check();
    boolean isValidNumberRange();
    boolean isGameWon();
    boolean isGameLost();

}
