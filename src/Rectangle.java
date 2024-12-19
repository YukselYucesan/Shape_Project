public class Rectangle implements IOperations {

    private int shortSide;
    private int longSide;

    public Rectangle(int shortSide, int longSide) {
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double calculateThePerimeter() {
        return 2*(this.shortSide+this.longSide);
    }

    @Override
    public double calculateArea() {
        return this.shortSide*this.longSide;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "shortSide=" + this.shortSide +
                ", longSide=" + this.longSide +
                ", perimeter=" + calculateThePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
