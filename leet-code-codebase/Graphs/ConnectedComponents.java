package Graphs;

import java.util.*;

public class ConnectedComponents {

    static int countComponents(Map<Integer, List<Integer>> graph, int n) {

        Set<Integer> visited = new HashSet<>();
        int components = 0;

        for (int i = 0; i < n; i++) {

            if (!visited.contains(i)) {

                components++;
                dfs(graph, i, visited);
            }
        }

        return components;
    }

    static void dfs(Map<Integer, List<Integer>> graph,
                    int node,
                    Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {

                dfs(graph, neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(0, Arrays.asList(1));
        graph.put(1, Arrays.asList(0));
        graph.put(2, Arrays.asList(3));
        graph.put(3, Arrays.asList(2));

        int components = countComponents(graph, 4);

        System.out.println("Connected Components: " + components);
        System.out.println("Fully Connected: " + (components == 1));
    }
}