public class Order {

    // Attributes
    String code, product;
    int quantity;
    double unitPrice;

    // Constructor
    public Order(String code, String product, int quantity, double unitPrice) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // Method that calculates the amount
    public double calculateAmount () {
        return this.quantity * this.unitPrice;
    }

    // Function to show the summary of the order
    public void showSummary() {
        System.out.println("\nOrder: " + this.code);
        System.out.println("Product: "+ this.product);
        System.out.println("Quantity: "+ this.quantity);
        System.out.println("Unit price: "+ this.unitPrice + "€");
        System.out.println("Total amount: "+ calculateAmount() + "€");
    }
}
