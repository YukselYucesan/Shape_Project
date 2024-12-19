import java.util.Scanner;

public class Runner {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

        Main();

    }
    public static void Main() throws InterruptedException {
        int choose=0;
        do {
            System.out.print("1- Triangle\n" +
                             "2- Square\n" +
                             "3- Rectangle\n" +
                             "4- Circle\n" +
                             "0- Exit\n" +
                             "The shape you want to calculate the area and perimeter = ");
            choose=scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Side 1 = ");
                    int side1=scanner.nextInt();
                    System.out.print("Side 2 = ");
                    int side2=scanner.nextInt();
                    System.out.print("Side 3 = ");
                    int side3=scanner.nextInt();
                    Triangle triangle=new Triangle(side1,side2,side3);
                    System.out.println("Triangle = " + triangle);
                    break;
                case 2:
                    System.out.print("Side 1 = ");
                    int side=scanner.nextInt();
                    Square square=new Square(side);
                    System.out.println("Square = " + square);
                    break;
                case 3:
                    System.out.print("Short Side = ");
                    int shortSide=scanner.nextInt();
                    System.out.print("Long Side = ");
                    int longSide=scanner.nextInt();
                    Rectangle rectangle=new Rectangle(shortSide,longSide);
                    System.out.println("Rectangle = " + rectangle);
                    break;
                case 4:
                    System.out.print("Radius = ");
                    int radius=scanner.nextInt();
                    Circle circle=new Circle(radius);
                    System.out.println("Circle = " + circle);
                    break;
                case 0:
                    System.out.print("Exit is in progress");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(">");
                        Thread.sleep(100);
                    }
                    break;
                default:
                    System.out.println("Mistake İnput");
            }
        }while (choose!=0);
    }
}
