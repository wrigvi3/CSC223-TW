package csc223.tw;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GraphTest{

    @Test
    public void testaddEdge(){
        Graph g = new Graph();
        assertFalse(g.hasEdge(1, 2));
        g.addEdge(1, 2);
        assertTrue(g.hasEdge(1, 2));
    }

    @Test
    public void testremoveEdge(){
        Graph g = new Graph();
        g.addEdge(1, 2);
        assertTrue(g.hasEdge(1, 2));
        g.removeEdge(1, 2);
        assertFalse(g.hasEdge(1, 2));
    }

    @Test
    public void testhasEdge(){
        Graph g = new Graph();
        assertFalse(g.hasEdge(1, 2));
        g.addEdge(1, 2);
        assertTrue(g.hasEdge(1, 2));
    }

    @Test
    public void testgetNeighbors(){
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        assertEquals([2, 4, 5], g.getNeighbors(3));
    }

    @Test
    public void testgetNumVertices(){
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        assertEquals(5, g.getNumVertices());
    }

    @Test
    public void testprintGraph(){
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        assertEquals(g, g.printGraph());
    }

    @Test
    public void testshortestPath(){
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        assertEquals("1, 2, 3, 5", g.shortestPath());
        assertEquals(null, g.shortestPath(5, 6));
    }

    @Test
    public void testaddWeightedEdge(){
        Graph g = new Graph();
        assertFalse(g.hasEdge(1, 2));
        g.addEdge(1, 2, 10);
        assertTrue(g.hasEdge(1, 2));
    }

    @Test
    public void testgetEdgeWeight(){
        Graph g = new Graph();
        g.addEdge(1, 2, 5);
        g.addEdge(2, 3, 7);
        assertEquals(7, g.getEdgeWeight(2, 3));
        assertEquals(-1, g.getEdgeWeight(1, 3));
    }

    @Test
    public void testWeightedShortestPath(){
        Graph g = new Graph();
        g.addEdge(1, 2, 5);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 3);
        g.addEdge(3, 5, 10);
        g.addEdge(4, 5, 2);
        assertEquals("1, 2, 3, 4, 5 - 17", g.shortestPath(1, 5));
    }
}