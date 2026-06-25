class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }
}

class Student extends Person {
    final String studentId;
    double gpa;

    Student(String name, String studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, String studentId, double gpa, String thesis) {
        super(name, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() + ", Thesis: " + thesis;
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        GradStudent g = new GradStudent("Rishu", "S101", 8.9, "AI Research");
        System.out.println(g);
    }
}