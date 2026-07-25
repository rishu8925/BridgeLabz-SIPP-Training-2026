package Heaps;

import java.util.*;

public class EmergencyRoomTriage {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        public String toString() {
            return name + " - Severity: " + severity;
        }
    }


    static PriorityQueue<Patient> triageQueue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);


    static void addPatient(Patient p) {
        triageQueue.offer(p);
    }


    static Patient treatNext() {
        return triageQueue.poll();
    }


    public static void main(String[] args) {

        addPatient(new Patient("Rahul", 5));
        addPatient(new Patient("Amit", 10));
        addPatient(new Patient("Neha", 8));


        System.out.println("Treat Next: " + treatNext());
    }
}