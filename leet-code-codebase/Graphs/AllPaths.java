package Graphs;

import java.util.*;

public class AllPaths {

    static void findAllPaths(
            Map<Integer, List<Integer>> graph,
            int current,
            int target,
            List<Integer> path,
            Set<Integer> visited,
            List<List<Integer>> allPaths) {

        path.add(current);
        visited.add(current);

        if (current == target) {

            allPaths.add(new ArrayList<>(path));

        } else {

            for (int neighbor : graph.getOrDefault(current, Collections.emptyList())) {

                if (!visited.contains(neighbor)) {

                    findAllPaths(graph, neighbor, target, path, visited, allPaths);
                }
            }
        }

        path.remove(path.size() - 1);
        visited.remove(current);
    }

    public static void main(String[] args) {

        Map<Integer, List<Integer>> graph = new HashMap<>();

        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4));
        graph.put(3, Arrays.asList(4));
        graph.put(4, Arrays.asList(5));
        graph.put(5, Collections.emptyList());

        List<List<Integer>> allPaths = new ArrayList<>();

        findAllPaths(graph, 1, 5,
                new ArrayList<>(),
                new HashSet<>(),
                allPaths);

        System.out.println(allPaths);
    }
}