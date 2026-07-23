package Day27;

public class DFS {
   
    static int[][] g = {
        {0, 1, 1},
        {1, 0, 1},
        {1, 1, 0}
    };

    static boolean[] visited = new boolean[3];

    static void dfs(int v) {
        System.out.print(v + " ");
        visited[v] = true;

        for (int i = 0; i < 3; i++) {
            if (g[v][i] == 1 && !visited[i])
                dfs(i);
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
    

