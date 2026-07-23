import java.util.*;
public class DFS {
    static int[][] graph;
    static boolean[] visited;
    static void dfs(int n,int V) {
        visited[n] = true;
        for (int i = 0; i < V; i++) {
            if (graph[n][i]==1 && !visited[i]) {
                dfs(i,V);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        graph = new int[V][V];
        visited = new boolean[V];
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        dfs(0,V);
    }
}
