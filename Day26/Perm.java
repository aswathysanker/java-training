package Day26;

public class Perm {
    
    static void perm(String s, String ans) {
        if (s.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            perm(rest, ans + ch);
        }
    }

    public static void main(String[] args) {
        perm("ABC", "");
    }
}
    

