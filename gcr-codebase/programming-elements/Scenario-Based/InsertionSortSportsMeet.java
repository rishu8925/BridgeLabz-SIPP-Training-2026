import java.util.*;

public class InsertionSortSportsMeet {

    public static void main(String[] args) {

        int[] scores = {64,25,12,22,11,45,23,44,56,56};

        int shifts = 0;

        System.out.println("Original Array");
        System.out.println(Arrays.toString(scores));

        for(int i=1;i<scores.length;i++){

            int key = scores[i];
            int j = i-1;

            while(j>=0 && scores[j] > key){

                scores[j+1] = scores[j];
                j--;
                shifts++;
            }

            scores[j+1] = key;

            System.out.println("Pass " + i + " : " + Arrays.toString(scores));
        }

        System.out.println("\nSorted Array");
        System.out.println(Arrays.toString(scores));

        System.out.println("Total Shifts = " + shifts);

        System.out.println("\nTop 3 Medalists");
        System.out.println("Gold   : " + scores[scores.length-1]);
        System.out.println("Silver : " + scores[scores.length-2]);
        System.out.println("Bronze : " + scores[scores.length-3]);
    }
}