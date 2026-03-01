public class MainEcommerce {

    // Product Class
    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public void displayProduct() {
            System.out.println("Product Name : " + name);
            System.out.println("Price        : " + price);
        }

        public double getPrice() {
            return price;
        }
    }

    // Customer Class
    static class Customer {
        private String customerName;

        public Customer(String customerName) {
            this.customerName = customerName;
        }

        public void displayCustomer() {
            System.out.println("Customer Name : " + customerName);
        }
    }

    // Order Class
    static class Order {
        private Product product;
        private int quantity;

        public Order(Product product, int quantity) {
            this.product = product;
            this.quantity = quantity;
        }

        public double calculateTotal() {
            return product.getPrice() * quantity;
        }

        public void displayOrder() {
            product.displayProduct();
            System.out.println("Quantity      : " + quantity);
            System.out.println("Total Cost    : " + calculateTotal());
        }
    }

    // Main Method
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Sneha");
        Order o1 = new Order(p1, 2);

        System.out.println("----- Customer Details -----");
        c1.displayCustomer();

        System.out.println("\n----- Order Details -----");
        o1.displayOrder();
    }
}