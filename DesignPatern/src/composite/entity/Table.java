package composite.entity;

public class Table extends Composite {
    private int tableNumber;

    public Table(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}