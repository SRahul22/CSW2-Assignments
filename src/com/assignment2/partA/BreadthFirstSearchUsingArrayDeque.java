package com.assignment2.partA;

import java.util.*;

public class BreadthFirstSearchUsingArrayDeque {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list

    public BreadthFirstSearchUsingArrayDeque(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    public void BFS(int start) {
        boolean[] visited = new boolean[V];
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        visited[start] = true;
        queue.add(start);
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for (int neighbor : adj.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BreadthFirstSearchUsingArrayDeque g = new
                BreadthFirstSearchUsingArrayDeque(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(4, 5);
        System.out.print("Breadth-first traversal of the graph starting from vertex 2: ");
        g.BFS(2);
    }
}
