package csc223.mb;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;


public class UnweightedGraph implements Graph{

    int unweightarray[][];
    int vertices;

    public  UnweightedGraph(int vertices){
        this.unweightarray = new int[vertices][vertices];
        this.vertices = vertices;




    }
    /**
     * Adds an edge between two vertices.
     * 
     * @param v1 the first vertex
     * @param v2 the second vertex
     */
    @Override
    public void addEdge(int v1, int v2){
        if(hasEdge(v1,v2)){
            return;
        }
        this.unweightarray[v1][v2] = 1;
        this.unweightarray [v2][v1] =1;
    }
    
    /**
     * Removes the edge between two vertices.
     * 
     * @param v1 the first vertex
     * @param v2 the second vertex
     */
    @Override
    public void removeEdge(int v1, int v2){
        if(hasEdge(v1,v2)){
            this.unweightarray[v1][v2]=0;
            this.unweightarray [v2][v1]=0;

        }
        else{
            return;

        }
        
    }
    
    /**
     * Checks if there is an edge between two vertices.
     * 
     * @param v1 the first vertex
     * @param v2 the second vertex
     * @return true if an edge exists, false otherwise
     */
    @Override
    public boolean hasEdge(int v1, int v2){
        if(unweightarray[v1][v2] == 1){
            return true;

        }
        else{
            return false;
        }
    }
    
    /**
     * Gets all neighbors of the given vertex.
     * 
     * @param vertex the vertex to find neighbors for
     * @return an array of neighboring vertices
     */
    @Override
    public int[] getNeighbors(int vertex){
        List<Integer> neighbors = new ArrayList<>();
        for(int i = 0; i < this.vertices; i++){
            if(this.unweightarray[vertex][i]==1){
                neighbors.add(i);
            }
        }
        return neighbors.stream().mapToInt(Integer::intValue).toArray();
    }
    
    /**
     * Gets the number of vertices in the graph.
     * 
     * @return the number of vertices
     */
    @Override
    public int getNumVertices(){
        return this.vertices;
    }
    
    /**
     * Prints the graph representation.
     */
    @Override
    public void printGraph(){
        for (int i = 0; i<this.vertices; i++){
            System.out.print("Vertex  " + i + ":");
            for(int j = 0; j< this.vertices; j++){
                if(this.unweightarray[i][j]==1){
                    System.out.print(j + "");
                }

            }
            System.out.println();
        }
    }
    
    /**
     * Finds the shortest path between two vertices.
     * 
     * @param startVertex the starting vertex
     * @param endVertex the ending vertex
     * @return the shortest path as a string representation, or null if no path exists
     */
    @Override
    public String shortestPath(int startVertex, int endVertex){
        int[] parent = new int[this.vertices];
        Arrays.fill(parent, -1);
        boolean[] visited = new boolean[this.vertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex]= true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == endVertex){
                return reconstructPath(startVertex, endVertex, parent);

            }
            for(int neighbor : getNeighbors(current)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.add(neighbor);
                }
            }
        }
        return null;

    }

    private String reconstructPath(int startVertex, int endVertex, int[] parent){
        List<Integer> path = new ArrayList<>();
        for(int v = endVertex; v != -1; v = parent[v]){
            path.add(v);
        }
        Collections.reverse(path);
        return path.toString();
    }
    
}
