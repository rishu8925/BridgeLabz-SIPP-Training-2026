import java.util.ArrayList;

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Rishu"));
        employees.add(new Employee(102, "Reshu"));
        employees.add(new Employee(103, "Pragati"));

        for (Employee emp : employees) {
            System.out.println("ID: " + emp.id + ", Name: " + emp.name);
        }
    }
}