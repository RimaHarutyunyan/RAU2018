package SeaBattle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShipFactory {
    private static ShipFactory instance = new ShipFactory();

    public static ShipFactory getInstance() {
        return instance;
    }

    private ShipFactory() {
    }

    public void drawShipWithSizeOne(Field[][] map) {
        int verticalCoordinate = new Random().nextInt(8);
        int horizontalCoordinate = new Random().nextInt(8);
        Field field = map[verticalCoordinate][horizontalCoordinate];
        if(isFieldAvailableForShipping(map,field)) {
            field.setContainsShip(true);
        } else {
            drawShipWithSizeOne(map);
        }
    }

    public void drawShipWithSizeTwo(Field[][] map) {
        int verticalCoordinate = new Random().nextInt(8);
        int horizontalCoordinate = new Random().nextInt(8);
        boolean horizontal = new Random().nextBoolean();
        Field field = map[verticalCoordinate][horizontalCoordinate];
        if(!isFieldAvailableForShipping(map,field)){
            drawShipWithSizeTwo(map);
        } else {
            List<Field> availableNeighbours = new ArrayList<>();
            if(horizontal) {
                if(horizontalCoordinate != 0 && !map[verticalCoordinate][horizontalCoordinate - 1].containsShip()) {
                    availableNeighbours.add(map[verticalCoordinate][horizontalCoordinate - 1]);
                }
                if(horizontalCoordinate != 7 && !map[verticalCoordinate][horizontalCoordinate + 1].containsShip()) {
                    availableNeighbours.add(map[verticalCoordinate][horizontalCoordinate + 1]);
                }
            } else {
                if(verticalCoordinate != 0 && !map[verticalCoordinate - 1][horizontalCoordinate].containsShip()) {
                    availableNeighbours.add(map[verticalCoordinate - 1][horizontalCoordinate]);
                }
                if(verticalCoordinate != 7 && !map[verticalCoordinate + 1][horizontalCoordinate].containsShip()) {
                    availableNeighbours.add(map[verticalCoordinate + 1][horizontalCoordinate]);
                }
            }
            if(availableNeighbours.size() == 0) {
                drawShipWithSizeTwo(map);
            } else {
                int index = new Random().nextInt(availableNeighbours.size());
                if(!isFieldAvailableForShipping(map,availableNeighbours.get(index))) {
                    drawShipWithSizeTwo(map);
                } else {

                    availableNeighbours.get(index).setContainsShip(true);
                    availableNeighbours.get(index).setShipSize(ShipSize.TWO);
                    field.setContainsShip(true);
                    field.setShipSize(ShipSize.TWO);
                }
            }
        }

    }

    private boolean isFieldAvailableForShipping(Field[][] map , Field field){
        for(Field f : getSurroundingFields(map,field)) {
            if(f.containsShip()){
                return false;
            }
        }
        return true;
    }
    
    private List<Field> getSurroundingFields(Field[][] map , Field field) {
        List<Field> result = new ArrayList<>();
        List<Integer> availableVerticalIndexes = new ArrayList<>();
        List<Integer> availableHorizontalIndexes = new ArrayList<>();
        availableVerticalIndexes.add(field.getVerticalCoordinate());
        availableHorizontalIndexes.add(field.getHorizontalCoordinate());
        if (field.getHorizontalCoordinate() != 0) {
            availableHorizontalIndexes.add(field.getHorizontalCoordinate() - 1);
        }

        if (field.getHorizontalCoordinate() != 7) {
            availableHorizontalIndexes.add(field.getHorizontalCoordinate() + 1);
        }
        if (field.getVerticalCoordinate() != 0) {
            availableVerticalIndexes.add(field.getVerticalCoordinate() - 1);
        }

        if (field.getVerticalCoordinate() != 7) {
            availableVerticalIndexes.add(field.getVerticalCoordinate() + 1);
        }
        for (int i : availableVerticalIndexes) {
            for(int j : availableHorizontalIndexes) {
                result.add(map[i][j]);
            }
        }
        return result;
    }
}
