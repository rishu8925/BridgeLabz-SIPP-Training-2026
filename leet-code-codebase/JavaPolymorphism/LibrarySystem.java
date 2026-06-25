class LibraryMember {
    String memberName;
    String memberId;

    LibraryMember(String name, String id) {
        memberName = name;
        memberId = id;
    }

    double calculateFine(int overdueDays) {
        return 0;
    }

    void printDetails() {
        System.out.println(memberName + " " + memberId);
    }
}

class StudentMember extends LibraryMember {
    StudentMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {
    FacultyMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {
    GuestMember(String name, String id) {
        super(name, id);
    }

    double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        LibraryMember[] members = {
            new StudentMember("Rishu", "S101"),
            new FacultyMember("Aman", "F102"),
            new GuestMember("Neha", "G103")
        };

        String searchId = "F102";

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine: " + m.calculateFine(4));

            if (m.memberId.equals(searchId)) {
                System.out.println("Found Member: " + m.memberName);
            }
        }
    }
}