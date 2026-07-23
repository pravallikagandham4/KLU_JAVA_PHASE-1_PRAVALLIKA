import java.util.*;
public class WLGraph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Vertices: ");
        int V = sc.nextInt();
        System.out.println("Enter the number of Edges");
        int E = sc.nextInt();
        int[][]  graph = new int[V][V];
        int[] deg = new int[V];
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][deg[u]++] = v;
            graph[v][deg[v]++] = u;
        }
        for (int i =0; i < V; i++) {
            System.out.println("Vertex " + i + ": ");
            for (int j = 0; j < deg[i]; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
