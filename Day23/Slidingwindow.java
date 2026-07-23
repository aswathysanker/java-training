package Day23;
import java.util.*;

class SlidingWindow {
    public static void main(String[] args) {
        int[] a = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int sum = 0, max = 0;

        // First window
        for (int i = 0; i < k; i++)
            sum += a[i];

        max = sum;

        // Slide the window
        for (int i = k; i < a.length; i++) {
            sum = sum + a[i] - a[i - k];
            max = Math.max(max, sum);
        }

        System.out.println("Maximum Sum = " + max);
    }
}