public class SkillAssignment {
    static void findTeams(int[] arr, int index, int target, String team) {
        if (target == 0) {
            System.out.println("[" + team.trim() + "]");
            return;
        }

        if (index == arr.length || target < 0) return;

        findTeams(arr, index + 1, target - arr[index], team + arr[index] + " ");
        findTeams(arr, index + 1, target, team);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7};
        int target = 10;
        findTeams(arr, 0, target, "");
    }
}