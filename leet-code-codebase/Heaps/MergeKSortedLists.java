package Heaps;

import java.util.*;

public class MergeKSortedLists {


    static List<Integer> mergeKSortedLists(
            List<List<Integer>> lists) {


        PriorityQueue<int[]> minHeap =
                new PriorityQueue<>(
                (a,b) ->
                lists.get(a[0]).get(a[1])
                -
                lists.get(b[0]).get(b[1])
                );


        // Insert first element of every list
        for(int i=0;i<lists.size();i++) {

            if(!lists.get(i).isEmpty()) {

                minHeap.offer(new int[]{i,0});
            }
        }



        List<Integer> result = new ArrayList<>();



        while(!minHeap.isEmpty()) {


            int current[] = minHeap.poll();


            int listIndex = current[0];
            int elementIndex = current[1];


            result.add(
                lists.get(listIndex).get(elementIndex)
            );


            if(elementIndex + 1 < lists.get(listIndex).size()) {

                minHeap.offer(
                    new int[]{listIndex, elementIndex+1}
                );
            }
        }


        return result;
    }



    public static void main(String[] args) {


        List<List<Integer>> lists = Arrays.asList(
                Arrays.asList(1,4,7),
                Arrays.asList(2,5,8),
                Arrays.asList(3,6,9)
        );


        System.out.println(
                mergeKSortedLists(lists)
        );
    }
}