// Shape Interface
interface Shape {
    double area();
}

// Rectangle class
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

// Triangle class
class Triangle implements Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return 0.5 * base * height;
    }
}

// Changed Public Class Name
public class ShapeTest {
    public static void main(String[] args) {

        Shape r = new Rectangle(10, 5);
        Shape t = new Triangle(8, 4);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}