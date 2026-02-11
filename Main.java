// Abstract class
abstract class Shape {
    double dim1;
    double dim2;

    // Constructor
    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method
    abstract double area();
}

// Rectangle class
class Rectangle extends Shape {

    Rectangle(double length, double width) {
        super(length, width);
    }

    // Area of Rectangle = length × width
    double area() {
        return dim1 * dim2;
    }
}

// Triangle class
class Triangle extends Shape {

    Triangle(double base, double height) {
        super(base, height);
    }

    // Area of Triangle = 1/2 × base × height
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 4);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}
