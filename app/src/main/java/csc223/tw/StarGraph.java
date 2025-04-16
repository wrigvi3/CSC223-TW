package csc223.tw;
// 1791. Find Center of Star Graph
// https://leetcode.com/problems/find-center-of-star-graph/description/

public class StarGraph {
    public int FindCenter(int[][] edges) {

         // check if the first node of the first edge appears in the second edge
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        } else {
            // other must be center
            return edges[0][1];
        }
    }
}
