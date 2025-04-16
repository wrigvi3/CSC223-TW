package csc223.tw;
// 1971. Find if Path Exists in Graph
//https://leetcode.com/problems/find-if-path-exists-in-graph/description/


import java.util.*;

class SolutionEasyProb {

    public boolean validPath(int n, int[][] edges, int source, int destination) {

        if (source == destination){
            return true;
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u); 
        }
        
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        boolean[] visited = new boolean[n];

        
        queue.add(source);
        visited[source] = true;
        
        while (!queue.isEmpty()) {
            int curr = queue.poll();

            if (curr == destination) {
                return true;
            }
            for (int neighbor: graph.get(curr)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }return false;
        
    }
}