import java.util.*;

// Generic Pair Class
class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

// Generic Stack Class
class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is Empty");
            return null;
        }
        return stack.remove(stack.size() - 1);
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

// Generic Repository Class
class Repository<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        data.add(item);
    }

    public void display() {
        for (T item : data) {
            System.out.println(item);
        }
    }
}

// Employee Class
class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class GenericsDemo {

    // Generic Method with Comparable Bound
    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T value : arr) {
            if (value.compareTo(max) > 0) {
                max = value;
            }
        }
        return max;
    }

    // Wildcard Method
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        // Pair
        System.out.println("----- Generic Pair -----");
        Pair<Integer, String> p = new Pair<>(101, "Rahul");
        System.out.println(p);

        // Stack
        System.out.println("\n----- Generic Stack -----");
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Top Element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Top Element: " + stack.peek());

        // findMax
        System.out.println("\n----- Generic findMax -----");

        Integer[] numbers = {10, 50, 20, 80, 30};

        System.out.println("Maximum = " + findMax(numbers));

        // Repository
        System.out.println("\n----- Generic Repository -----");

        Repository<Employee> repo = new Repository<>();

        repo.add(new Employee(101, "Rahul"));
        repo.add(new Employee(102, "Aman"));
        repo.add(new Employee(103, "Priya"));

        repo.display();

        // Wildcard Example
        System.out.println("\n----- Wildcard List<?> -----");

        List<String> names = Arrays.asList("Rahul", "Aman", "Priya");

        printList(names);
    }
}