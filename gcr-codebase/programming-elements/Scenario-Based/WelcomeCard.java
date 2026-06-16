public class WelcomeCard {
    public static void main(String[] args) {

        String name = "Ravi";
        int rank = 5;
        int age = 22;
        double salary = 50000.0;
        float membershipFee = 999.50f;
        int annualBonus = (int) (salary * 0.12);
// to take command line argument
        // String name = args[0];
        // int rank = Integer.parseInt(args[1]);
        // int age = Integer.parseInt(args[2]);
        // double salary = Double.parseDouble(args[3]);
        // float membershipFee = Float.parseFloat(args[4]);


        System.out.println("Welcome        : " + name);
        System.out.println("Rank           : " + rank);
        System.out.println("Age            : " + age);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("12% Bonus      : " + annualBonus);
    }
}