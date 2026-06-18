import java.util.Scanner;

public class Maximum69Number {

  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] arr = new int[4];
        
        int i=0;

        while (num > 0) {
            arr[i] = num % 10;
            num /= 10;
            i++;
        }

        num = 0;
        boolean flag = true;

        for (i--; i >= 0; i--) {
            if (arr[i] == 6 && flag) {
                arr[i] = 9;
                flag = false;
            }
            num = num * 10 + arr[i];
        }


        System.out.println(num);

        sc.close();
    }
}