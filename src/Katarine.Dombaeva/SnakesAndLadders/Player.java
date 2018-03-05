package SnakesAndLadders;

public class Player {
    private String nick;
    private DeskPoint currentPoint;
    private Directions direction;

    Player(String nick) {
        this.nick = nick;
        this.currentPoint = new DeskPoint(0,0);
        this.direction = Directions.RIGHT;
    }

    public void step(int diceFace, Desk desk){
        if(this.direction == Directions.RIGHT) {
            if (this.currentPoint.getY() + diceFace <= 9) {
                this.currentPoint.setY(this.currentPoint.getY() + diceFace);
            } else {
                this.currentPoint.setX(this.currentPoint.getX() + 1);
                this.currentPoint.setY(10 - (diceFace - (9 - this.currentPoint.getY())));
                this.direction = Directions.LEFT;
            }
        }else if(this.direction == Directions.LEFT) {
            if(this.currentPoint.getY() - diceFace >=0) {
                this.currentPoint.setY(this.currentPoint.getY() - diceFace);
            } else {
                this.currentPoint.setX(this.currentPoint.getX() + 1);
                this.currentPoint.setY(diceFace - this.currentPoint.getY() - 1);
                this.direction = Directions.RIGHT;
            }
        }
        desk.checkForLaddersAndSnakes(this.currentPoint , this.nick);
    }

    public String getNick() {
        return nick;
    }

    public DeskPoint getCurrentPoint() {
        return currentPoint;
    }

    public void setCurrentPoint(DeskPoint currentPoint) {
        this.currentPoint = currentPoint;
    }
}
