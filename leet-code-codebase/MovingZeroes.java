import java.util.*;


public class MovingZeroes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array size");
        int count =0;
        for(int i=0;i<=n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                count++;
            }
        }
        ArrayList<Integer> nonZero = new ArrayList<>();
        for (int num : arr) {
            if (num != 0) {
                nonZero.add(num);
            }
        }

        int starting = count/2;
        int ending =count/2;
        boolean middlezero= count%2 !=0;

        int[] result =new int[n];
         int index = 0;

        for (int i = 0; i < starting; i++) {
            result[index++] = 0;
        }

        int mid = nonZero.size() / 2;
        for (int i = 0; i < mid; i++) {
            result[index++] = nonZero.get(i);
        }

        if (middlezero) {
            result[index++] = 0;
        }
        for (int i = mid; i < nonZero.size(); i++) {
            result[index++] = nonZero.get(i);
        }

        for (int i = 0; i < ending; i++) {
            result[index++] = 0;
        }

        System.out.println("Result array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();

    }
}