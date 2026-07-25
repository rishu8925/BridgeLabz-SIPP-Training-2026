package Graphs;

import java.util.*;

public class DirectedCycleDetection {

    static boolean hasCycle(Map<Integer, List<Integer>> graph, int n) {

        int[] state = new int[n];

        for (int i = 0; i < n; i++) {

            if (state[i] == 0) {

                if (dfs(graph, i, state))
                    return true;
            }
        }

        return false;
    }

    static boolean dfs(Map<Integer, List<Integer>> graph,
                       int node,
                       int[] state) {

        state[node] = 1;

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (state[neighbor] == 1)
                return true;

            if (state[neighbor] == 0 && dfs(graph, neighbor, state))
                return true;
        }

        state[node] = 2;

        return false;
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(2));
        graph.put(2, Arrays.asList(0));

        System.out.println("Cycle Present: " + hasCycle(graph, 3));
    }
}