import java.util.*;

class Contact implements Comparable<Contact> {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int compareTo(Contact c) {
        return this.name.compareToIgnoreCase(c.name);
    }

    public String toString() {
        return name + " " + phone + " " + email;
    }
}

public class AddressBook {

    static ArrayList<Contact> list = new ArrayList<>();
    static HashMap<String, Contact> map = new HashMap<>();
    static HashSet<String> phones = new HashSet<>();

    static void add(String name, String phone, String email) {
        if (phones.contains(phone)) {
            System.out.println("Duplicate Phone Number");
            return;
        }

        Contact c = new Contact(name, phone, email);
        list.add(c);
        map.put(name, c);
        phones.add(phone);
    }

    static void search(String name) {
        if (map.containsKey(name))
            System.out.println(map.get(name));
        else
            System.out.println("Contact Not Found");
    }

    static void delete(String name) {
        Contact c = map.get(name);

        if (c == null) {
            System.out.println("Contact Not Found");
            return;
        }

        list.remove(c);
        map.remove(name);
        phones.remove(c.phone);
    }

    static void display() {
        Collections.sort(list);

        for (Contact c : list)
            System.out.println(c);
    }

    public static void main(String[] args) {

        add("Rahul", "9999", "rahul@gmail.com");
        add("Aman", "8888", "aman@gmail.com");
        add("Priya", "7777", "priya@gmail.com");
        add("Test", "9999", "test@gmail.com");

        search("Rahul");

        delete("Aman");

        display();
    }
}