package SnakesAndLadders;

public class Dice {
    private int diceFace = 0;

    public void rollTheDice() {
        int diceFace = (int)(Math.random() * 6) + 1;
        this.diceFace = diceFace;
    }

    public int getDiceFace() {
        return diceFace;
    }
}
