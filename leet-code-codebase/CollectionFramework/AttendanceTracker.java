import java.util.*;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (!students.contains(student))
            students.add(student);
        else
            System.out.println(student + " Already Present in " + subject);
    }

    static void display() {

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println(subject);

            for (String s : students)
                System.out.println(s);

            System.out.println("Total Students : " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Priya");
        markAttendance("Python", "Rahul");

        display();
    }
}