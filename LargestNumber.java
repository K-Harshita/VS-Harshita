import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.println();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();
        System.out.println();

        if ((a > b && a > c)) {
            System.out.println(a + " is the largest number");
        } else if ((b > a && b > c)) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
        sc.close();
    }
}
