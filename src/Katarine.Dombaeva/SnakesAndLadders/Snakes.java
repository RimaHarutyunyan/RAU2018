package SnakesAndLadders;


public class Snakes {
    private DeskPoint head;
    private DeskPoint tail;

    Snakes(DeskPoint head , DeskPoint tail) {
        this.head = head;
        this.tail = tail;
    }

    public DeskPoint getHead() {
        return head;
    }

    public DeskPoint getTail() {
        return tail;
    }
}
