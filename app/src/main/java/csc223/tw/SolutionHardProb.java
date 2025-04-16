package csc223.tw;

// 2642. Design Graph With Shortest Path Calculator
// https://leetcode.com/problems/design-graph-with-shortest-path-calculator/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SolutionHardProb {
    class Edge implements Comparable<Edge> {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }

        // Compare edges based on their weight

        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }
    class Graph {
        List<List<Edge>> adjacencyList;
        int n;

        public Graph(int n, int[][] edges) {
            this.n = n;
            this.adjacencyList = new ArrayList<>();

            // Initialize empty lists for each vertex
            for (int i = 0; i < n; i++) {
                adjacencyList.add(new ArrayList<>());
            }

            // Add edges
            for (int[] edge : edges) {
                int from = edge[0];
                int to = edge[1];
                int weight = edge[2];

                adjacencyList.get(from).add(new Edge(from, to, weight));
            }
        }

        
        public void addEdge(int[] edge) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            adjacencyList.get(from).add(new Edge(from, to, weight));
        }
        
        public int shortestPath(int node1, int node2) {
            int[] distances = new int[n];
            Arrays.fill(distances, Integer.MAX_VALUE);
            distances[node1] = 0;

            PriorityQueue<Edge> pq = new PriorityQueue<>();
            pq.add(new Edge(-1, node1, 0));

            while (!pq.isEmpty()) {
                Edge current = pq.poll();
                int currentVertex = current.destination;

                for (Edge edge : adjacencyList.get(currentVertex)) {
                    int newDist = distances[currentVertex] + edge.weight;
                    if (newDist < distances[edge.destination]) {
                        distances[edge.destination] = newDist;
                        pq.add(new Edge(currentVertex, edge.destination, newDist));
                    }
                }
            }

            if(distances[node2] == Integer.MAX_VALUE){
                distances[node2] = -1;
            }
            return distances[node2];
    }
    }
    /**
     * Your Graph object will be instantiated and called as such:
     * Graph obj = new Graph(n, edges);
     * obj.addEdge(edge);
     * int param_2 = obj.shortestPath(node1,node2);
     */

    public static void main(String[] args) {
        
    }
}
