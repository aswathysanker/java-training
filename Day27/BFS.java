package Day27;
import java.util.*;

public class  BFS {
    public static void main(String[] args) {
        int[][] g = {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0}
        };

        boolean[] visited = new boolean[3];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");

            for (int i = 0; i < 3; i++) {
                if (g[v][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
}