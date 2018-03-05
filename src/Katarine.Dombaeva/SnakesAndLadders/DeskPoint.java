package SnakesAndLadders;

public class DeskPoint {
    private int x;
    private int y;

    DeskPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(DeskPoint that) {
        return this.x == that.getX() && this.y == that.getY();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
