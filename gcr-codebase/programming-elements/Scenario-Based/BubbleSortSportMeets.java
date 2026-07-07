import java.util.*;

public class BubbleSortSportMeets {

    public static void main(String[] args) {

        int[] scores = {64,25,12,22,11,45,23,44,56,56};

        int swaps = 0;
        boolean sorted;

        System.out.println("Original Array");
        System.out.println(Arrays.toString(scores));

        for(int i=0;i<scores.length-1;i++){

            sorted = true;

            for(int j=0;j<scores.length-i-1;j++){

                if(scores[j] > scores[j+1]){

                    int temp = scores[j];
                    scores[j] = scores[j+1];
                    scores[j+1] = temp;

                    swaps++;
                    sorted = false;
                }
            }

            System.out.println("Pass " + (i+1) + " : " + Arrays.toString(scores));

            if(sorted){
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("\nSorted Array");
        System.out.println(Arrays.toString(scores));

        System.out.println("Total Swaps = " + swaps);

        System.out.println("\nTop 3 Medalists");
        System.out.println("Gold   : " + scores[scores.length-1]);
        System.out.println("Silver : " + scores[scores.length-2]);
        System.out.println("Bronze : " + scores[scores.length-3]);
    }
} 
    

