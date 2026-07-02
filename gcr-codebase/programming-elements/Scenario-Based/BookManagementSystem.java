/*Question:
Built an Address Book Management System that stores x=contact details such as name, phone num, and email address. Design the application using 
multiple java collections to acieve efficient, storage, searching and duplicate prevention,your program should supportthe following functionalities:

-Store all contacts in an ArrayList to maintain an orderd list 
-Use a Hashmap<String, Contact> fir quick look up of contacts by name
-Use a HashSet<String> to ensure that duplicates phone num cannot be added
-Implementfunctionality to ad ,search , delete and display contacts.
-Display all contact sorted alphabetically by name using Collections.sort().
-Ensure that whenever a contact is added or deleted , all three collections remain synchronized and contain consistent data.*/

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

    public int compareTo(Contact other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();
    HashMap<String, Contact> contactMap = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    public void addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed!");
            return;
        }

        Contact c = new Contact(name, phone, email);
        contactList.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added successfully.");
    }

    public void searchContact(String name) {
        Contact c = contactMap.get(name);

        if (c != null)
            System.out.println(c);
        else
            System.out.println("Contact not found.");
    }

    public void deleteContact(String name) {
        Contact c = contactMap.get(name);

        if (c == null) {
            System.out.println("Contact not found.");
            return;
        }

        contactList.remove(c);
        contactMap.remove(name);
        phoneSet.remove(c.phone);

        System.out.println("Contact deleted successfully.");
    }

    public void displayContacts() {
        Collections.sort(contactList);

        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
            return;
        }

        for (Contact c : contactList) {
            System.out.println(c);
        }
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        book.addContact("Rahul", "9876543210", "rahul@gmail.com");
        book.addContact("Aman", "9999999999", "aman@gmail.com");
        book.addContact("Priya", "8888888888", "priya@gmail.com");

        book.addContact("Test", "9876543210", "test@gmail.com");

        System.out.println("\nSearch Contact:");
        book.searchContact("Rahul");

        System.out.println("\nAll Contacts:");
        book.displayContacts();

        System.out.println("\nDelete Contact:");
        book.deleteContact("Aman");

        System.out.println("\nContacts After Deletion:");
        book.displayContacts();
    }
}