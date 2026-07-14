package Day22;
import java.util.Scanner;
public class Prefixsum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate prefix sum
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        System.out.println("Prefix Sum Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
    

