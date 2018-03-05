package SeaBattle;

public class Field {
    private boolean containsShip = false;

    private int horizontalCoordinate;
    private int verticalCoordinate;

    private FieldStatus fieldStatus = FieldStatus.ALIVE;
    private ShipSize shipSize = ShipSize.ONE;

    public Field(boolean containsShip, int horizontalCoordinate, int verticalCoordinate , FieldStatus fieldStatus) {
        this.containsShip = containsShip;
        this.horizontalCoordinate = horizontalCoordinate;
        this.verticalCoordinate = verticalCoordinate;
        this.fieldStatus = fieldStatus;
    }

    public Field(int verticalCoordinate, int horizontalCoordinate) {
        this.horizontalCoordinate = horizontalCoordinate;
        this.verticalCoordinate = verticalCoordinate;
    }

    public void print() {
        System.out.print(containsShip ? shipSize == ShipSize.TWO ? "X" : "O" : " ");
    }

    public String getFieldName() {
        char letter = (char)('A' + horizontalCoordinate);
        return letter + "" + (verticalCoordinate + 1);
    }

    public boolean containsShip() {
        return containsShip;
    }

    public void setContainsShip(boolean containsShip) {
        this.containsShip = containsShip;
    }

    public int getHorizontalCoordinate() {
        return horizontalCoordinate;
    }

    public int getVerticalCoordinate() {
        return verticalCoordinate;
    }

    public FieldStatus getFieldStatus() {
        return fieldStatus;
    }

    public void setFieldStatus(FieldStatus fieldStatus) {
        this.fieldStatus = fieldStatus;
    }

    public ShipSize getShipSize() {
        return shipSize;
    }

    public void setShipSize(ShipSize shipSize) {
        this.shipSize = shipSize;
    }
}
