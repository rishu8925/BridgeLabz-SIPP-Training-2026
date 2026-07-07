import java.util.*;

public class EventEntryVerify {

    static HashSet<String> participants = new HashSet<>();

    static void register(String email) {

        if (participants.add(email))
            System.out.println(email + " Registered");
        else
            System.out.println("Duplicate Registration");
    }

    static void display() {

        System.out.println("Participants");

        for (String email : participants)
            System.out.println(email);

        System.out.println("Total : " + participants.size());
    }

    public static void main(String[] args) {

        register("rahul@gmail.com");
        register("aman@gmail.com");
        register("priya@gmail.com");
        register("rahul@gmail.com");

        display();
    }
}