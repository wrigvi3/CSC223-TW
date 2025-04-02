package csc223.tw;

public interface WeightedGraphInterface extends Graph {
    
    /**
     * Adds an edge between two vertices with the given weight.
     * 
     * @param v1 the first vertex
     * @param v2 the second vertex
     * @param weight the weight of the edge
     */
    void addEdge(int v1, int v2, double weight);
    
    /**
     * Gets the weight of the edge between two vertices.
     * 
     * @param v1 the first vertex
     * @param v2 the second vertex
     * @return the weight of the edge, or -1 if no edge exists
     */
    double getEdgeWeight(int v1, int v2);
    
    /**
     * Finds the shortest path between two vertices.
     * Returns both the path and the total distance as a formatted string.
     * 
     * @param startVertex the starting vertex
     * @param endVertex the ending vertex
     * @return a string containing the shortest path and its total distance
     */
    @Override
    String shortestPath(int startVertex, int endVertex);

}
