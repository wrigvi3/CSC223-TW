package csc223.mb;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

//https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/
public class AncestorsGraph {
    
    public List<List<Integer>> getAncestors(int n, int[][] edgeList){
        List<List<Integer>> graph = new ArrayList<>();
        int[] degree = new int[n];
        List<Set<Integer>> ancestors = new ArrayList<>();

        for(int i = 0; i< n; i++){
            graph.add(new ArrayList<>());
            ancestors.add(new HashSet<>());
        }
         for(int[] edge : edgeList){
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            degree[to]++;
         }

         Queue<Integer> queue = new LinkedList<>();
         for(int j = 0; j < n; j++){
            if( degree[j] == 0){
                queue.offer(j);
            }
         }

         while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbor : graph.get(node)){
                ancestors.get(neighbor).addAll(ancestors.get(node));
                ancestors.get(neighbor).add(node);
                degree[neighbor]--;
                if(degree[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
         }

         List<List<Integer>> ancestorList = new ArrayList<>();
         for(Set<Integer> set : ancestors){
            List<Integer> sortedList = new ArrayList<>(set);
            Collections.sort(sortedList);
            ancestorList.add(sortedList);
         }
         return ancestorList;
        }
    }