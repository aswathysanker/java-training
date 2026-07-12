package Day4;
import java.util.Scanner;

public class Greatestof3 {
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is the greatest number");
        }
        else if (b > a && b > c) {
            System.out.println(b + " is the greatest number");
        }
        else {
            System.out.println(c + " is the greatest number");
        }

        sc.close();
    }
}
    

