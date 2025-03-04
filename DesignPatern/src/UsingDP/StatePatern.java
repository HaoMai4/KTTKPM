package UsingDP;

interface State {
    void handleOrder(PizzaOrder order);
}

class FreeState implements State {
    public void handleOrder(PizzaOrder order) {
        System.out.println("Order is now being processed.");
        order.setState(new OrderedState());
    }
}

class OrderedState implements State {
    public void handleOrder(PizzaOrder order) {
        System.out.println("Order is now ready to be picked up.");
        order.setState(new FreeState());
    }
}

class PizzaOrder {
    private State state;
    public PizzaOrder() {
        this.state = new FreeState();
    }
    public void setState(State state) {
        this.state = state;
    }
    public void processOrder() {
        state.handleOrder(this);
    }
}
