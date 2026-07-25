package Heaps;

import java.util.*;

public class TopKLargest {


    static List<Integer> topKLargest(int arr[], int k) {


        PriorityQueue<Integer> minHeap =
                new PriorityQueue<>();


        for(int num : arr) {


            if(minHeap.size() < k) {

                minHeap.offer(num);
            }

            else if(num > minHeap.peek()) {

                minHeap.poll();
                minHeap.offer(num);
            }
        }


        return new ArrayList<>(minHeap);
    }



    public static void main(String[] args) {


        int arr[] = {100,500,200,900,700};


        System.out.println(topKLargest(arr,3));
    }
}