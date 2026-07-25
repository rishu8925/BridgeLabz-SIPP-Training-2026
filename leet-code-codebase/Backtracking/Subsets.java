package Backtracking;

import java.util.*;

public class Subsets {

    static List<List<String>> generateSubsets(String[] flags) {

        List<List<String>> result = new ArrayList<>();

        backtrack(flags, 0, new ArrayList<>(), result);

        return result;
    }


    static void backtrack(String[] flags,
                          int index,
                          List<String> current,
                          List<List<String>> result) {


        if(index == flags.length) {

            result.add(new ArrayList<>(current));
            return;
        }


        // Choose flag ON
        current.add(flags[index]);

        backtrack(flags, index + 1, current, result);


        // Undo choice
        current.remove(current.size()-1);


        // Choose flag OFF
        backtrack(flags, index + 1, current, result);
    }



    public static void main(String[] args) {

        String flags[] = {"DarkMode","Checkout","Search"};

        System.out.println(generateSubsets(flags));
    }
}