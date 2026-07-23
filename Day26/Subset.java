package Day26;

public class Subset {
    
    static void find(int[] a, int i, String s) {
        if (i == a.length) {
            System.out.println(s);
            return;
        }

        find(a, i + 1, s);              // Don't take
        find(a, i + 1, s + a[i] + " "); // Take
    }

    public static void main(String[] args) {
        int[] a = {1, 2};
        find(a, 0, "");
    }
}

