package UsingDP;

abstract class Employee {
    abstract void work();
}

class Manager extends Employee {
    void work() { System.out.println("Managing the team"); }
}

class Developer extends Employee {
    void work() { System.out.println("Writing code"); }
}

class EmployeeFactory {
    public static Employee createEmployee(String type) {
        if (type.equalsIgnoreCase("Manager")) return new Manager();
        else if (type.equalsIgnoreCase("Developer")) return new Developer();
        return null;
    }
}
