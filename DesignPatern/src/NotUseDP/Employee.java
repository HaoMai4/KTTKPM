package NotUseDP;

public class Employee {
    String type;

    Employee(String type) {
        this.type = type;
    }

    public void work() {
        if (type.equals("Manager")) {
            System.out.println("Managing the team");
        } else if (type.equals("Developer")) {
            System.out.println("Writing code");
        }
    }
}
