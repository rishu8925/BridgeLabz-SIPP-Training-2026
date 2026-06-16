import java.util.*;

public class MathWizard {
    int instanceVar = 100;

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    static double factorial(double n) {
        int num = (int) n;
        double fact = 1;
        for (int i = 1; i <= num; i++)
            fact *= i;
        return fact;
    }

    static int fibonacci(int n) {
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    static long power(int base, int exp) {
        long result = 1;
        for (int i = 1; i <= exp; i++)
            result *= base;
        return result;
    }
    void showScope() {
        int localVar = 50;
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathWizard obj = new MathWizard();

        System.out.print("Enter number for prime check: ");
        int n = sc.nextInt();
        System.out.println("Prime: " + isPrime(n));

        System.out.print("Enter integer for factorial: ");
        int x = sc.nextInt();
        System.out.println("Factorial(int): " + factorial(x));

        System.out.print("Enter double for factorial: ");
        double d = sc.nextDouble();
        System.out.println("Factorial(double): " + factorial(d));

        System.out.print("Enter terms for Fibonacci: ");
        int f = sc.nextInt();
        fibonacci(f);

        System.out.print("Enter two numbers for GCD and LCM: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));

        System.out.print("Enter base and exponent: ");
        int base = sc.nextInt();
        int exp = sc.nextInt();
        System.out.println("Power: " + power(base, exp));

        obj.showScope();
    }
}