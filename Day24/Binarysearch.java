package Day24;

public class Binarysearch {
   
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int key = 30;
        int l = 0, r = a.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (a[mid] == key) {
                System.out.println("Found");
                return;
            } else if (a[mid] < key)
                l = mid + 1;
            else
                r = mid - 1;
        }

        System.out.println("Not Found");
    }
}
