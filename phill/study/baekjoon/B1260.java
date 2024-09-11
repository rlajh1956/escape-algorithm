package baekjoon;

import java.util.*;

public class B1260 {
    // 1260 번 https://www.acmicpc.net/problem/1260
    static boolean[] visited;
    static ArrayList<Integer>[] adjList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 정점의 개수
        int M = sc.nextInt(); // 간선의 개수
        int V = sc.nextInt(); // 시작 정점

        adjList = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adjList[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);
        }

        for (int i = 1; i <= N; i++) {
            Collections.sort(adjList[i]);
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        Arrays.fill(visited, false);
        bfs(V);
    }

    static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }

    static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
