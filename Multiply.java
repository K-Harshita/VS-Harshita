import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("The multiplication of the 2 numbers is : " + a * b);
        sc.close();
    }
}
