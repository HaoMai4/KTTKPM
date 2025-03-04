package NotUseDP;

public class Pizza {
    boolean hasCheese = false;
    boolean hasSeafood = false;

    public double getCost() {
        double cost = 5.0;
        if (hasCheese) cost += 1.5;
        if (hasSeafood) cost += 2.5;
        return cost;
    }
}
