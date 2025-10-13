public class Order {
    String code, product;
    int quantity;
    double unitPrice;

    public Order(String code, String product, int quantity, double unitPrice) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calculateAmount () {
        return this.quantity * this.unitPrice;
    }

    public void showSummary() {
        System.out.println("Order: " + this.code);
        System.out.println("\nProduct: "+ this.product);
        System.out.println("\nQuantity: "+ this.quantity);
        System.out.println("\nUnit price: "+ this.unitPrice);
        System.out.println("\nTotal amount: "+ calculateAmount());
    }
}
