package SnakesAndLadders;

public class Ladders {
    private DeskPoint bottom;
    private DeskPoint top;

    Ladders(DeskPoint startPoint , DeskPoint endPoint) {
        this.bottom = startPoint;
        this.top = endPoint;
    }

    public DeskPoint getBottom() {
        return bottom;
    }

    public DeskPoint getTop() {
        return top;
    }
}
