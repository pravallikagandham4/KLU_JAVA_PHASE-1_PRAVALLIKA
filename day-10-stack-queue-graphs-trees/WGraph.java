import java.util.*;
public class WGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the number of Edges");
        int E = sc.nextInt();
        int[][]  graph = new int[V][V];
        for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                graph[u][v] = 1;
                graph[v][u] = 1;
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
