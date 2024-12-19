public class Triangle implements IOperations {

    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    @Override
    public double calculateThePerimeter() {
        return this.side1+this.side2+this.side3;
    }

    @Override
    public double calculateArea() {
        double s=(this.side1+this.side2+this.side3);
        return Math.sqrt((s-this.side1)*(s-this.side2)*(s-this.side3));
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + this.side1 +
                ", side2=" + this.side2 +
                ", side3=" + this.side3 +
                ", perimeter=" + calculateThePerimeter() +
                ", area=" + calculateArea() +
                '}';
    }
}
