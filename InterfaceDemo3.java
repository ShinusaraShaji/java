import java.util.Scanner;

interface Shapes {
    double area();
    double perimeter();
}

class Circle implements Shapes {
    double radius;
    Circle(double r) {
        radius = r;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shapes {
    double length;
    double width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public double area() {
        return length * width;
    }
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class InterfaceDemo3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double r = s.nextDouble();
                    Circle ob1 = new Circle(r);
                    System.out.println("Area: " + ob1.area());
                    System.out.println("Perimeter: " + ob1.perimeter());
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double l = s.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double w = s.nextDouble();
                    Rectangle ob2 = new Rectangle(l, w);
                    System.out.println("Area of Rectangle: " + ob2.area());
                    System.out.println("Perimeter of Rectangle: " + ob2.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    s.close();
                    return;  // Clean exit from main
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
