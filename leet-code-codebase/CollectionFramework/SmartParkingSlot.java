import java.util.*;

public class SmartParkingSlot {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void enter(String number) {
        vehicles.add(number);
    }

    static void exit(String number) {
        if (vehicles.remove(number))
            System.out.println(number + " Removed");
        else
            System.out.println("Vehicle Not Found");
    }

    static void search(String number) {
        if (vehicles.contains(number))
            System.out.println("Vehicle Present");
        else
            System.out.println("Vehicle Not Present");
    }

    static void display() {

        System.out.println("Parked Vehicles");

        for (String v : vehicles)
            System.out.println(v);

        System.out.println("Occupied Slots : " + vehicles.size());
    }

    public static void main(String[] args) {

        enter("MH12AB1111");
        enter("MH12CD2222");
        enter("MH12EF3333");

        search("MH12CD2222");

        exit("MH12AB1111");

        display();
    }
}