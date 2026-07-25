class Student {
    int id;
    String name;
    double marks;

    // Constructor
    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // toString()
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', marks=" + marks + "}";
    }

    // equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Student s = (Student) obj;

        return id == s.id &&
               name.equals(s.name) &&
               marks == s.marks;
    }
w
    // hashCode()
    @Override
    public int hashCode() {
        return id + name.hashCode() + (int) marks;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Vedita", 89.5);
        Student s2 = new Student(101, "Vedita", 89.5);

        // toString()
        System.out.println(s1);

        // equals()
        System.out.println("Equal? " + s1.equals(s2));

        // hashCode()
        System.out.println("HashCode s1: " + s1.hashCode());
        System.out.println("HashCode s2: " + s2.hashCode());
    }
}