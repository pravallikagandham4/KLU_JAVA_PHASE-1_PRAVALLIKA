import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int V = obj.nextInt();
        int E = obj.nextInt();
        int[][] matrix = new int[V][V];
        for(int i=0;i<E;i++) {
            int u = obj.nextInt();
            int v = obj.nextInt();
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        for(int i=0;i<V;i++) {
            for(int j=0;j<V;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    } 
}