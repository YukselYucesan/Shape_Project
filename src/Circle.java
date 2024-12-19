public class Circle implements IOperations {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateThePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(this.radius,2);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + this.radius +
                ", perimeter=" + calculateThePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
