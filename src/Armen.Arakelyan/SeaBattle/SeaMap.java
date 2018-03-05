package SeaBattle;

public class SeaMap {
    private Field[][] map = new Field[8][8];

    {
        for(int i = 0 ; i < map.length ; ++i) {
            for (int j = 0 ; j < map.length ; ++j) {
                map[i][j] = new Field(i,j);
            }
        }
    }

    public  SeaMap() {
        ShipFactory.getInstance().drawShipWithSizeOne(map);
        ShipFactory.getInstance().drawShipWithSizeOne(map);
        ShipFactory.getInstance().drawShipWithSizeOne(map);
        ShipFactory.getInstance().drawShipWithSizeOne(map);
        ShipFactory.getInstance().drawShipWithSizeTwo(map);
        ShipFactory.getInstance().drawShipWithSizeTwo(map);
        ShipFactory.getInstance().drawShipWithSizeTwo(map);
    }

    public void print() {
        System.out.print(' ');
        for(int i = 0 ; i < 8 ; ++i) {
            System.out.print((char) ('A' + i));
        }
        System.out.println();
        for(int i = 0 ; i < 8 ; ++i) {
            System.out.print(i + 1);
            for(int j = 0 ; j < 8 ; ++j) {
                map[i][j].print();
            }
            System.out.println();
        }
    }

}
