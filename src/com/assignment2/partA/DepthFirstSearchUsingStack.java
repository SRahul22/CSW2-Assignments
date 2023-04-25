package com.assignment2.partA;

import java.util.*;

public class DepthFirstSearchUsingStack {
    private int V; // number of vertices
    private List<List<Integer>> adj; // adjacency list

    public DepthFirstSearchUsingStack(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    public void DFS(int start) {
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<Integer>();
        visited[start] = true;
        stack.push(start);
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            System.out.print(vertex + " ");
            for (int neighbor : adj.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        DepthFirstSearchUsingStack g = new DepthFirstSearchUsingStack(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(4, 5);
        System.out.print("Depth-first traversal of the graph starting from vertex 2: ");
        g.DFS(2);
    }
}