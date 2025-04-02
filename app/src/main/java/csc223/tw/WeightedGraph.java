package csc223.tw;

import java.util.PriorityQueue;

public class WeightedGraph implements WeightedGraphInterface {
    
    double[][] m;

    public  WeightedGraph(int vertices){
        this.m = new double[vertices][vertices];
        // initialize all edges to positive infinity
        for(int i = 0; i < vertices; i++){
            for(int j = 0; j < vertices; j++){
                this.m[i][j] = Double.POSITIVE_INFINITY;
            }
        }
    }

    @Override
    public void addEdge(int v1, int v2, double weight){
        this.m[v1][v2] = weight;
        
    }
    @Override
    public void removeEdge(int v1, int v2){
        this.m[v1][v2] = Double.POSITIVE_INFINITY;
    }

    @Override
    public boolean hasEdge(int v1, int v2){
        return this.m[v1][v2] != Double.POSITIVE_INFINITY;
    }

    @Override
    public int[] getNeighbors(int vertex){
        int n = m.length;
        int[] neighbors = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (this.m[vertex][i] != Double.POSITIVE_INFINITY) {
                neighbors[count++] = i;
            }
        }
        // resize array for only the filled part
        int[] result = new int[count];
        System.arraycopy(neighbors, 0, result, 0, count);
        return result;
    }

    @Override
    public double getEdgeWeight(int v1, int v2){
        //check if edge exists
        if(this.m[v1][v2] == Double.POSITIVE_INFINITY){
            return -1;
        }
        return this.m[v1][v2];
    }

    @Override
    public int getNumVertices(){
        return this.m.length;
    }

    @Override
    public void printGraph(){
        for (int i = 0; i< this.m.length; i++){
            System.out.print(i + " -> ");
            for (int j = 0; j < this.m[i].length; j++){
                if (this.m[i][j] != Double.POSITIVE_INFINITY){
                    System.out.print(j + " (" + this.m[i][j] + ") ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public String shortestPath(int startVertex, int endVertex){
        // Dijkstra's algorithm
        int n = m.length;
        double[] distances = new double[n];
        int[] previous = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            distances[i] = Double.POSITIVE_INFINITY;
            previous[i] = -1;
            visited[i] = false;

        }
        distances[startVertex] = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Double.compare(distances[a], distances[b]));
        pq.add(startVertex);

        while (!pq.isEmpty()) {
            int current = pq.poll();
            visited[current] = true;

            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (m[current][neighbor] != Double.POSITIVE_INFINITY && !visited[neighbor]) {
                    double newDist = distances[current] + m[current][neighbor];
                    if (newDist < distances[neighbor]) {
                        distances[neighbor] = newDist;
                        previous[neighbor] = current;
                        pq.add(neighbor);
                    }
                }
            }
        }
        if (distances[endVertex] == Double.POSITIVE_INFINITY){
            return "No path found";
        }

        StringBuilder path = new StringBuilder();
        int curr = endVertex;
        while (curr != -1) {
            path.insert(0, curr + " ");
            curr = previous[curr];
        }
        return "Shortest path: " + path.toString().trim() + "\nTotal distance: " + distances[endVertex];
    }
    
}
