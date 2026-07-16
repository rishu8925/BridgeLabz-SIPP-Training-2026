import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySumEqualsK(int[] nums, int k) {

        HashMap<Integer, Integer> prefixCount = new HashMap<>();

        prefixCount.put(0, 1);

        int sum = 0;
        int answer = 0;

        for (int num : nums) {

            sum += num;

            answer += prefixCount.getOrDefault(sum - k, 0);

            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] revenue = {1, 2, 3, -2, 2};

        System.out.println("Subarrays = " + subarraySumEqualsK(revenue, 3));
    }
}