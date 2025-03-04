package UsingDP;

interface Pizza {
    String getDescription();
    double getCost();
}

class PlainPizza implements Pizza {
    public String getDescription() { return "Plain Pizza"; }
    public double getCost() { return 5.0; }
}

abstract class ToppingDecorator implements Pizza {
    protected Pizza pizza;
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}

class Cheese extends ToppingDecorator {
    public Cheese(Pizza pizza) { super(pizza); }
    public String getDescription() { return pizza.getDescription() + ", Cheese"; }
    public double getCost() { return pizza.getCost() + 1.5; }
}
