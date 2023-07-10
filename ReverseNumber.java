import java.util.*;
import java.lang.String;

public class ReverseNumber {
    public static void main(String[] args) {
        int reversenum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to be reversed : ");
        int a = sc.nextInt();
        while (a != 0) {
            reversenum *= 10;
            reversenum += (a % 10);
            // order is important
            a = a / 10;
        }
        System.out.println("the reversed number is " + reversenum);
        sc.close();
    }
}
