public class Subsets {
    static void subset(int[] arr, int index, String current) {
        if (index == arr.length) {
            System.out.println("[" + current + "]");
            return;
        }

        subset(arr, index + 1, current);

        String next = current.isEmpty() ? String.valueOf(arr[index]) : current + "," + arr[index];
        subset(arr, index + 1, next);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        subset(arr, 0, "");
    }
}
