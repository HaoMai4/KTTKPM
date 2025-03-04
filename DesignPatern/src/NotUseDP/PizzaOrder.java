package NotUseDP;

public class PizzaOrder {
    String state = "Free";

    public void processOrder() {
        if (state.equals("Free")) {
            System.out.println("Order is now being processed.");
            state = "Ordered";
        } else if (state.equals("Ordered")) {
            System.out.println("Order is now ready to be picked up.");
            state = "Free";
        }
    }
}
