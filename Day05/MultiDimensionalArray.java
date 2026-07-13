package Day5;
import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][][] arr = new int[2][2][2];

        System.out.println("Enter 8 elements:");

        // Input elements
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        // Display elements
        System.out.println("3D Array Elements:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}

