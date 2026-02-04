class StaticDemo {

    // static variable
    static int count;

    // static block (executes first)
    static {
        count = 10;
        System.out.println("Static block executed");
    }

    // static method
    static void display() {
        System.out.println("Value of static variable count = " + count);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        // calling static method
        StaticDemo.display();

        // modifying static variable
        count = 20;
        StaticDemo.display();
    }
}
