public class MainOrders {

    public static void main(String[] args) {
        
        // Creating new orders
        Order o1 = new Order("A3106", "Processor", 1, 366);
        Order o2 = new Order("B100", "RAM", 2, 80);
        Order o3 = new Order("c2570", "Fan", 4, 35);

        // Showing the summary of each order
        o1.showSummary();
        o2.showSummary();
        o3.showSummary();

        // Total ammount of all orders
        double amount = o1.calculateAmount() + o2.calculateAmount() + o3.calculateAmount();
        System.out.println("\nGlobal amount : " + amount + "€");
    }
}
