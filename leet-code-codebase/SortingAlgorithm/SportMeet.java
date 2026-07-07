import java.util.*;

public class SportMeet {

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int swaps = 0;
        boolean sorted;

        for (int i = 0; i < n - 1; i++) {
            sorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.println("Already Sorted (Best Case)");
                break;
            }
        }

        System.out.println("Bubble Sorted: " + Arrays.toString(arr));
        System.out.println("Total Swaps: " + swaps);
    }

    static void insertionSort(int[] arr) {
        int swaps = 0;

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                swaps++;
            }

            arr[j + 1] = key;
        }

        System.out.println("Insertion Sorted: " + Arrays.toString(arr));
        System.out.println("Shifts: " + swaps);
    }

    static void top3(int[] arr) {
        int[] temp = arr.clone();
        Arrays.sort(temp);

        System.out.println("Gold: " + temp[temp.length - 1]);
        System.out.println("Silver: " + temp[temp.length - 2]);
        System.out.println("Bronze: " + temp[temp.length - 3]);
    }

    static void traceBubble() {
        int[] arr = {64,25,12,22,11};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.println("Pass " + (i + 1) + ": " + Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] scores = {75,90,85,60,98,80,76,95};

        bubbleSort(scores.clone());

        insertionSort(scores.clone());

        top3(scores);

        System.out.println("\nTrace:");

        traceBubble();
    }
}