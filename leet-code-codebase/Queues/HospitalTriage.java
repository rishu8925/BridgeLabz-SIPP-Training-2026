import java.util.*;

class Patient {
    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalTriage {
    private PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    public void admitPatient(Patient p) {
        triageQueue.offer(p);
    }

    public Patient callNextPatient() {
        return triageQueue.poll();
    }

    public static void main(String[] args) {
        HospitalTriage hospital = new HospitalTriage();
        hospital.admitPatient(new Patient(3, "Alice"));
        hospital.admitPatient(new Patient(1, "Bob"));
        hospital.admitPatient(new Patient(2, "Charlie"));

        Patient p = hospital.callNextPatient();
        System.out.println(p.name + " " + p.priority);
    }
}