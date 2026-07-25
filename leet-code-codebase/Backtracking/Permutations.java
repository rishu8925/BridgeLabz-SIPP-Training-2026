package Backtracking;

import java.util.*;

public class Permutations {


    static List<List<String>> generatePermutations(String names[]) {


        List<List<String>> result = new ArrayList<>();

        boolean used[] = new boolean[names.length];


        backtrack(names,used,
                new ArrayList<>(),
                result);


        return result;
    }



    static void backtrack(String names[],
                          boolean used[],
                          List<String> path,
                          List<List<String>> result) {


        if(path.size()==names.length) {

            result.add(new ArrayList<>(path));
            return;
        }



        for(int i=0;i<names.length;i++) {


            if(used[i])
                continue;


            used[i]=true;

            path.add(names[i]);


            backtrack(names,used,path,result);


            path.remove(path.size()-1);

            used[i]=false;
        }
    }



    public static void main(String[] args) {


        String engineers[]={"Amit","Rahul","Neha"};


        System.out.println(
                generatePermutations(engineers)
        );
    }
}