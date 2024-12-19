public class Square implements IOperations {

    private int side;

    public Square(int side) {
        setSide(side);
    }

    @Override
    public double calculateThePerimeter() {
        return this.side*4;
    }

    @Override
    public double calculateArea() {
        return Math.pow(this.side,2);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + this.side +
                ", perimeter=" + calculateThePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
