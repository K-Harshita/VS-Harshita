import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.println();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        System.out.println();

        System.out.println("Before swap : First number => " + a + " Second number => " + b);

        temp = b;
        b = a;
        a = temp;

        System.out.println("After swap : First number => " + a + " Second number => " + b);

        sc.close();
    }
}
