package Day28.java;
public class Undirectedgraph {
    public static void main(String[] args) {
        int[][] g = {
            {0, 1, 1},
            {1, 0, 0},
            {1, 0, 0}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (g[i][j] == 1)
                    System.out.println(i + " -- " + j);
            }
        }
    }
}
    

