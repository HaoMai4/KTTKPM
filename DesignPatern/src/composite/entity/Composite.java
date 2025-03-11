package composite.entity;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> children = new ArrayList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Component child : children) {
            total += child.getPrice();
        }
        return total;
    }
}