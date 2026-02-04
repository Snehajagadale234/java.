import java.util.Scanner;+

class Area {
    int length;
    int breadth;

    // method to set dimensions
    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }

    // method to return area
    int getArea() {
        return length * breadth;
    }
}

public class AreaTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input from keyboard
        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        // creating object
        Area rect = new Area();
        rect.setDim(l, b);

        // printing area
        System.out.println("Area of Rectangle = " + rect.getArea());
    }
}
